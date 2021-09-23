package com.ab.design.algorithm.circuitbreaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ThirdPartyService implements Service{
    URL url;

    public ThirdPartyService(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    @Override
    public String call() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(120000);
        httpURLConnection.setReadTimeout(120000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        int status = httpURLConnection.getResponseCode();
        InputStream in = (status < 200 || status > 299) ?
                httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String responseLine = null;
        StringBuffer responseContent = new StringBuffer();

        while ((responseLine = reader.readLine()) != null){
            responseContent.append(responseLine);
        }

        reader.close();
        httpURLConnection.disconnect();
        return responseContent.toString();
    }
}
