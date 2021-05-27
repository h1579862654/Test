package com.test;

import java.io.IOException;

/**
 * @program: ssm20
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-27 10:37
 **/
public class Test1 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        int i = r.availableProcessors();
        try {
            r.exec("start chrome.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
