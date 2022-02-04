package com.company;

public class Lasangna {

    public static void main(String[] args) {
        Lasangna lasangna = new Lasangna();
        int minutesInOven = lasangna.expectedMinutesInOven();
        System.out.println("Minutes In Oven: " + minutesInOven);

        int remainingToCook = lasangna.remainingMinutesInOven(30);
        System.out.println("Remaining Minutes to Cook in Oven: " + remainingToCook);

        int preparationLayers = lasangna.preparationTimeInMinutes(30);
        System.out.println("Preparation Layers: " + preparationLayers);

        int totalTimeInMinutes = lasangna.totalTimeInMinutes(3, 20);
        System.out.println("Total in Minutes to Cook: " + totalTimeInMinutes);

    }

    // Define the expected oven time in minutes
    int expectedMinutesInOven(){
        return 40;
    }
    // Calculate the remaining oven time in minutes
    int remainingMinutesInOven(int k){
        return expectedMinutesInOven() - k;
    }
    // Calculate the preparation time in minutes
    int preparationTimeInMinutes(int n){
        return n * 2;
    }
    // Calculate the total working time in minutes
    int totalTimeInMinutes(int i, int m){
        i = i * 2;
        return i + m;
    }
}
