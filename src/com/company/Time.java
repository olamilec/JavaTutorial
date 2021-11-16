package com.company;

public class Time {
    public static void main(String[] args){
        int hour, minute, second, WholeDay;
        hour = 14;
        minute = 30;
        second = 30;
        WholeDay = 24 * 60 * 60;
        System.out.println("Current Time " + hour + ":" + minute + ":" + second);
        int ConvertHourToSecond = hour * 60 * 60;
        int ConvertMinuteToSecond = minute * 60;
        int NumOfSecondTillMidNight = WholeDay - ConvertHourToSecond + ConvertMinuteToSecond + second;
        System.out.println("Number of second till Midnight: " + NumOfSecondTillMidNight);
        System.out.println("Number of second till Midnight: " + NumOfSecondTillMidNight);
    }
}
