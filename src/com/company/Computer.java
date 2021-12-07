package com.company;

public class Computer {
    String brand;
    String model;
    String screenSize;
    int year;

    public Computer(String brand, String model, String screenSize, int year){
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.year = year;
    }
    public String toString(){
        return "The Brand of the Computer is " + brand + "\n" +
                "The Model is " + model + "\n" + "The Screen Size is " +
                screenSize + "\n" + "The year is " + year;
    }

    public static void main(String[] args){
        Computer computer1 = new Computer("HP", "Envy x360", "15 inches", 2020);


        System.out.println(computer1);

    }
}

