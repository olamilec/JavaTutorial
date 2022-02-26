package com.company;

public class FizzBuzz {
    public static void main(String[] args){
        Fizz_buzz(15);
    }
    public static void Fizz_buzz(int n){
        for(int i = 1; i <= n; i++)
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }

    }
}
