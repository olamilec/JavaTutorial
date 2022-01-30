package com.company;

public class DVD {
    // A simple definition for a DVD.
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }
    public String toString() {
            return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
        }

    public static void main(String[] args){
        // The actual code for creating an Array to hold DVD's.
        DVD[] dvdCollection = new DVD[5];


        DVD dvd1 = new DVD("Evil Dead", 1990, "Stephen Cole");
        dvdCollection[0] = dvd1;

        DVD dvd2 = new DVD("Sunita", 1985, "Amitab Bashar");
        dvdCollection[1] = dvd2;

        System.out.println(dvdCollection[0]);
        System.out.println(dvdCollection[1]);

            }
        }
