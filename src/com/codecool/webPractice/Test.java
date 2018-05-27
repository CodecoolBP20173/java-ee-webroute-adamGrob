package com.codecool.webPractice;

import java.lang.reflect.Method;
import java.net.InetSocketAddress;


import com.sun.net.httpserver.HttpServer;

public class Test {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        for(Method method: Class.forName("com.codecool.webPractice.MyRoute").getDeclaredMethods()) {
            if(method.isAnnotationPresent(WebRoute.class)) {
                server.createContext(method.getAnnotation(WebRoute.class).value(), new MyHandler());
            }
        }


        server.setExecutor(null); // creates a default executor
        server.start();
    }

}