package com.company;

public class pyramidOfStars {
    public static void main(String[] args) {
        int i, j, k, l;
        for (i = 0; i < 1; i++) {
            System.out.println("*");
            for (j = i; j < 1; j++) {
                System.out.println("**");
                for (k = j; k < 1; k++) {
                    System.out.println("***");
                    for (l = k; l < 1; l++) {
                        System.out.println("****");
                    }
                }
            }
        }
    }
}