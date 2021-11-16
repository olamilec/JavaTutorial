package com.company;

public class conditionalStatement {
    public static void main(String[] args){
        System.out.println("Test Me!");
        testIf(20);
        addTwoNums(19, 67);
    }
    public static void testIf(int num){

        if (num > 10){
            System.out.println("Num is greater than");
        }else{
            System.out.println("Num is less than");
        }
    }
    public static void addTwoNums(int num1, int num2){
        System.out.println(num1 + num2);

    }
}
