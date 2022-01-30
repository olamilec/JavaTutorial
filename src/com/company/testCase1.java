package com.company;

class testCase1 {
    int num1 = 40;
    int num2 = 30;
    public static void main(String[] args){
        testCase1 test = new testCase1();
        test.test1();
        test.test2();

    }
    public void test1(){
        int sum = num1 + num2;
        System.out.println(sum);
    }
     public void test2(){
        int sum = num1 - num2;
        System.out.println(sum);
     }
}

