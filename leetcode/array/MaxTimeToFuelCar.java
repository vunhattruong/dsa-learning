package com.leetcode.array;

import java.util.Arrays;

public class MaxTimeToFuelCar {
    public int maxTimeToFuel (int[] cars, int X, int Y, int Z) {
        int[] times = new int[cars.length];
        int maxTime;

        for (int i = 0; i < times.length; i++) {
            int car = cars[i];
            if ( car <= X || car <= Y || car <= Z ) {
                if ( i == 0 ) {
                    times[i] = 0;
                }
                else {
                    times[i] = times[i - 1] + cars[i - 1];
                }
                if ( car <= X ) {
                    X -= car;
                }
                else if ( car <= Y ) {
                    Y -= car;
                }
                else if ( car <= Z ) {
                    Z -= car;
                }
                times[i] = car;
            }
            else {
                return -1;
            }
        }
        maxTime = Arrays.stream(times).max().orElse(Integer.MIN_VALUE);
        return maxTime;
    }

    public static void main (String[] args) {
        MaxTimeToFuelCar car  = new MaxTimeToFuelCar();
        int[]            cars = { 5, 10, 7 };
        System.out.println(car.maxTimeToFuel(cars, 12, 9, 8));
    }
}
