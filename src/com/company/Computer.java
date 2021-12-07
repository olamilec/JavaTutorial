package com.company;

public class Computer {
    String brand;
    String model;
    String screen;
    int year;

    public Computer(String brandName, String modelType, String screenSize, int yearMade){
        brand = brandName;
        model = modelType;
        screen = screenSize;
        year = yearMade;
    }
    public String toString(){
        return "The Brand of the Computer is " + brand + "\n" +
                "The Model is " + model + "\n" + "The Screen Size is " +
                screen + "\n" + "The year is " + year;
    }

    public static void main(String[] args){
        Computer computer1 = new Computer("HP", "Envy x360", "15 inches", 2020);


        System.out.println(computer1);

    }
}

