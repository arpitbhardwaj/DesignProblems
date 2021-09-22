package com.ab.design.circuitbreaker;

import java.io.IOException;
import java.net.http.HttpResponse;

public interface Service {
    String call() throws IOException;
}
