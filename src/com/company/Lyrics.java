package com.company;

public class Lyrics {
    public static void main(String[] args) {
        LyricsRecursion(99);

    }
    public static void LyricsRecursion(int bottles){
        if(bottles == 0){
            System.out.println(bottles + " bottles of beer on the wall, no bottles of beer, ya' can't take one down," +
                    "ya' can't  pass it around, 'cause there are no more bottles of beer on the wall!");

        }else {
            System.out.println(bottles + " bottles of beers on the wall, ");
            System.out.print(bottles + " bottles of beers, ya' take one down, ya' pass it around, ");
            System.out.println(((bottles - 1)) + " bottles of beer on the wall!");
            LyricsRecursion(bottles - 1);

        }

    }

}
