package com.example.streamsApi.demo;

public class Client {
    public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();
    }
}