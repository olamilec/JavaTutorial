package com.company;

public class Date {

    public static void main(String[] args){
        System.out.println("Hello, Date!");
        System.out.println("----------------");
        String day = "Thursday";
        String date = "November";
        int month = 11;
        int year = 2021;
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        System.out.println("American format");
        System.out.println(day + ", " + date + " " + month + ", " + year);
        System.out.println();
        System.out.println("European format");
        System.out.println(day + ", " + month + " " + date + ", " + year);


    }
}
