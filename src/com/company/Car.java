package com.company;

public class Car {
    public static void main(String[] args){
        System.out.println("I am a class Car!");
        System.out.print("The Car is: ");
        engineState("Off");
        System.out.print("The Car is: ");
        engineState("On");
        System.out.println("The Car is Moving");
        System.out.print("The Car is in gear: ");
        gearState(1);
        System.out.print("The Car is Moving and now in gear ");
        gearState(2);
        System.out.print("The Car is back to gear ");
        gearState(1);

    }
    public static void engineState(String state) {
        System.out.println(state);
    }
    public static void gearState(int gear){
        System.out.println(gear);
    }
}
