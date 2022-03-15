package server;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:12345/HelloWorld", new WebServiceImpl());
    }
}