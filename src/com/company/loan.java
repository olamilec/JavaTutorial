package com.company;

import java.util.Scanner;

public class loan {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your loan amount: ");
            int amount = input.nextInt();
            int loan;
            //your code goes here
            for(int i = 1; i <= 3; i++)
            {
                loan = amount / 10;
                amount -= loan;
            }
            System.out.println(amount);
        }
    }
