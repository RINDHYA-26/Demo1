package com.demo;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Demo1!");
    }

  // intentionally inefficient: demonstrates a logic issue Copilot can find USE CASE 3
    public int addNumbers(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {  // unnecessary loop
            result = a + b;           
        }
        return result;
    }
}