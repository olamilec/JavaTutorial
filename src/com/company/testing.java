package com.company;
import java.lang.Math;
import java.util.Scanner;

public class testing {
    public static void printLogarithm(double x){
        if(x <= 0.0){
            System.out.println("Positive numbers only, please!");
            return;
        }
        double result = Math.log(x);
        System.out.println("The Log of x is " + result);
    }
    public static void printParity(int x){
        if (x % 2 == 0){
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }
    }
    public static void currentTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hour 1-24: ");
        int hour = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter minutes 0-59: ");
        int minutes = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter seconds 0-59: ");
        int seconds = input3.nextInt();

        System.out.print("Current Time: " + hour + ":" + minutes  + ":" + seconds);

        if (hour < 12){
            System.out.println(" am");
        }else {
            System.out.println(" pm");
        }
    }

    public  static void main(String[] args) {
        currentTime();
        printParity(87);
        printLogarithm(0.1);
    }
}
