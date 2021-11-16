package com.company;

public class testArray {
    public static void main(String[] args){
        myArray();
    }
    public static void myArray(){
        int [] thisArray = {0,1,2,3,4};
        //thisArray = new int[5];
        thisArray[0] = 10;
        thisArray[1] = 15;
        thisArray[2] = 20;
        thisArray[3] = 25;
        thisArray[4] = 30;
        System.out.println(thisArray[0]);
        System.out.println(thisArray[1]);
        System.out.println(thisArray[2]);
        System.out.println(thisArray[3]);
        System.out.println(thisArray[4]);
    }
}
