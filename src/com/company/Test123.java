package com.company;

public class Test123 {
    public void nonStatic(){
        String kiss = "No parameter constructor and non static";
        System.out.println(kiss);
    }
    public void nonStatic(String kiss){
        System.out.println(kiss);
    }
    public static void staticIs(String kiss){
        System.out.println(kiss);
    }
    public static void main(String[] args) {
        Test123 n = new Test123();
        Test123 n1 = new Test123();
        staticIs("Kiss me to know how soft I am!");
        n.nonStatic("constructor with parameter and non static");
        n1.nonStatic();
        /*System.out.println("The Bomb will go off at the count of 1 - 3");
        int Bomb = 1;
        while (Bomb < 3){
            System.out.println(Bomb);
            Bomb++;
            if(Bomb == 3){
                System.out.println("BlastOff!");
            }
        }*/
        /*int Bomb = 10;

        do {
            System.out.println(Bomb);
            Bomb--;
        }while(Bomb > 0);
        if (Bomb == 0){
            System.out.println("BlastOff!");
        }*/

    }
}
