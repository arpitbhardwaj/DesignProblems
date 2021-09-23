package com.ab.design.patterns.creational.abstractfactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;


public class AbstractFactoryDemo {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        String xml = "<document><body><stock>AAPL</stock></body></document>";

        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(bais);

        System.out.println(document.getDocumentElement().getNodeName());
        System.out.println(documentBuilderFactory);
        System.out.println(documentBuilder);

    }
}
