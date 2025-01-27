package com.startjava.lesson_2_3.method.naming;

public class MethodNameHelper {
    
    public static String current() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}