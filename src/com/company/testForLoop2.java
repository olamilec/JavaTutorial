package com.company;

public class testForLoop2 {
    public static void main(String[] args){
        tForLoop();
    }
    public static void tForLoop(){
        int [] myArrayNew;
        myArrayNew = new int[9];
        myArrayNew[0] = 2;
        myArrayNew[1] = 4;
        myArrayNew[2] = 6;
        myArrayNew[3] = 8;
        myArrayNew[4] = 10;
        myArrayNew[5] = 12;
        myArrayNew[6] = 14;
        myArrayNew[7] = 18;
        myArrayNew[8] = 20;

        for (int i = 0; i < myArrayNew.length; i++){
            System.out.println(myArrayNew[i]);
        }

    }
}
