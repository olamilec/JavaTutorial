package com.company;

public class Cars {

    String make;
    String model;
    int year;

    public Cars(String make, String model, int year){

        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String toString(){
        return "Cars maker: " + make + "\n" + "Cars model: " + model + "\n" + "Cars year: " + year;
    }

    public static void main(String[] args){
        Cars myCars = new Cars("Honda", "Civic", 2021);

        System.out.println(myCars);

    }


}
