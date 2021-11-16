package com.company;

public class nestedForLoop {
    public static void main(String[] args){
        for(int i = 0; i < 2; i++){
            System.out.println(i);
            for (int k = 0;k < 2; k++){
                System.out.println("Kiss me!");
            }
        }
    }
}
