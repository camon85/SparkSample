package com.camon;

import static spark.Spark.*;
/**
 * Created by jooyong on 2016-03-02.
 */
public class App {
    public static void main(String[] args) {

        get("/", (request, response) -> "hello");
        get("/hello", (request, response) -> "Hello World!");
    }
}
