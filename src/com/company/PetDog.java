package com.company;

public class PetDog {
    public static void petAge(int age){
        System.out.println(age);
    }
    public static void petName(String name) {
        System.out.println(name);
    }
    public static void petAddress(String address) {
        System.out.println(address);
    }
    public static void petBreed(String breed){
        System.out.println(breed);
    }
    public static void petHobby(int feeding, String food, String fun){
        System.out.println(feeding);
        System.out.println(food);
        System.out.println(fun);
    }
    public static void main(String[] args){
        System.out.print("The Dog name is: ");
        petName("Doggy");
        System.out.print("The Dog Breed is: ");
        petBreed("Rottweiller");
        System.out.print("The Dog age is: ");
        petAge(7);
        System.out.print("The Dog address is: ");
        petAddress("Dada Estate, Osogbo");
        petHobby(2, "Dog Treats", "Catching Ball");
    }
}
