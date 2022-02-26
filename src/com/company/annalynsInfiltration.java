package com.company;

public class annalynsInfiltration {
    public static void main (String[] args) {
        canFastAttack(false);
        canSpy(true, true, true);
        canFreePrisoner(false, true, true, true);
        canSignalPrisoner(false, true);
    }
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;

    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return knightIsAwake && archerIsAwake && prisonerIsAwake && petDogIsPresent;
    }
}
