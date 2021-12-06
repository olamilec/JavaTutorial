package com.company;

public class printLogarithm {
    public static void main(String[] args){
       printLog(4.5634);
    }
    public static void printLog(double x){
        if (x <= 0.0){
            System.out.println("Positive numbers only, please.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of X is " + result);
    }
}
