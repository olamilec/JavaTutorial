package com.company;

public class Cars {

    String make;
    String model;
    int year;

    public Cars(String maker, String modelType, int yearMade){

        make = maker;
        model = modelType;
        year = yearMade;
    }
    public String toString(){
        return "Cars maker: " + make + "\n" + "Cars model: " + model + "\n" + "Cars year: " + year;
    }

    public static void main(String[] args){
        Cars myCars = new Cars("Honda", "Civic", 2021);

        System.out.println(myCars);

    }


}
