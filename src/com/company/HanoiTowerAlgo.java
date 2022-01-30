package com.company;

public class HanoiTowerAlgo {
    public static void main(String[] args){
        int i, j, k, l;
        for(i = 2; i > 0; i--){
            System.out.println("I: " + i);
            for (j = i; j > 0; j--){
                System.out.println("I: " + i + " | " + "J: " + j);
                for (k = j; k > 0; k--){
                    System.out.println("I: " + i + " | " + "J: " + j + " | " + "K: " + k);
                    for (l = k; l > 0; l--){
                        System.out.println("I: " + i + " | " + "J: " + j + " | " + "K: " + k + " | " + "L: " + l);
                        //System.out.println("**************************");
                    }
                }
            }
        }


    }
}
