package com.company;

public class countDown {
    public static void main(String[] args){
        coundown(3);
    }
    public static void coundown(int n){
        if (n == 0){
            System.out.println("Blastoff!");
        }else {
            System.out.println(n);
            coundown(n-1);
        }
    }
}
