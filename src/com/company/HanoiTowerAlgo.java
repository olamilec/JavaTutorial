package com.company;

public class HanoiTowerAlgo {
    public static void main(String[] args){
        int i, j, k;
        for(i = 0; i < 3; i++){
            System.out.println("I: " + i);
            for (j = i; j < 3; j++){
                System.out.println("I: " + i + " | " + "J: " + j);
                for (k = j;k < 3; k++){
                    System.out.println("I: " + i + " | " + "J: " + j + " | " + "K: " + k);
                    System.out.println("******");
                }
            }
        }


    }
}
