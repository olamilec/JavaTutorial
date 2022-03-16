package com.company;
import java.lang.Math.*;

public class FermatTheorem {
    public static void main(String[] args) {
        //checkFermat();
        raiseToPow(2, 4);

    }
    public static void checkFermat(int a, int b, int c, int n){
        if(n > 2){
            System.out.println("Holy Smokes, Fermat was wrong!");
        }else
        {
            System.out.println("No, that doesn't work.");
        }
    }
    public static void raiseToPow(double x, double n){
        System.out.println(Math.pow(x, n));
    }
    
}
