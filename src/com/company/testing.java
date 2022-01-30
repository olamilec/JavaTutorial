package com.company;

public class testing {
    public  static void main(String[] args){
        zippo("rattle", 13);
    }
    public static void baffles(String blimp){
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag){
        if (flag < 0){
            System.out.println(quince + " zoop");
        }else {
            System.out.println("ik");
            baffles(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

}
