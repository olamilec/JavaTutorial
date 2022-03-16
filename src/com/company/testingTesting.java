package com.company;

public class testingTesting {
    public static void main(String[] args) {
        nLines(5);
    }
    public static void nLines(int n){
        if(n > 0){
            System.out.println("");
            nLines(n - 1);
        }
    }
}
