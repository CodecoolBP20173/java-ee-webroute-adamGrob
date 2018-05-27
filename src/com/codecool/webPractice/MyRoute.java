package com.codecool.webPractice;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

import static com.codecool.webPractice.MyHandler.handleRequests;

public class MyRoute {

    @WebRoute("/test1")
    void onTes1(HttpExchange requestData) throws IOException {
        String response = "This is test 1";
        handleRequests(requestData, response);

    }

    @WebRoute("/test2")
    void onTes2(HttpExchange requestData) throws IOException {
        String response = "This is test 2";
        handleRequests(requestData, response);

    }

    @WebRoute("/test3")
    void onTes3(HttpExchange requestData) throws IOException {
        String response = "This is test 3";
        handleRequests(requestData, response);

    }

    @WebRoute("/test4")
    void onTes4(HttpExchange requestData) throws IOException {
        String response = "This is test 4";
        handleRequests(requestData, response);

    }
    @WebRoute("/test5")
    void onTes5(HttpExchange requestData) throws IOException {
        String response = "This is test 5";
        handleRequests(requestData, response);

    }

    @WebRoute("/test6")
    void onTes6(HttpExchange requestData) throws IOException {
        String response = "This is test 6";
        handleRequests(requestData, response);

    }

    @WebRoute("/test7")
    void onTes7(HttpExchange requestData) throws IOException {
        String response = "This is test 7";
        handleRequests(requestData, response);

    }

    @WebRoute("/test9")
    void onTes8(HttpExchange requestData) throws IOException {
        String response = "This is test 8";
        handleRequests(requestData, response);

    }
}
