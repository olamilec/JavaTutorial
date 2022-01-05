package com.company;

class testCase1 {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s);
        System.out.println(addExact(11, 5));
        System.out.println(incrementExact(5));
    }

    static int addExact(int a, int b) {
        return a - b;
    }

    static int incrementExact(int a) {
        a++;
        return a;
    }
}

