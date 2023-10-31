package Misc;

import java.util.*;

public class FuelConsumption {

    static void calculateConsumption(double fuel, double distance) {
        double conForOneKm = fuel / distance;
        double conForHundredKm = conForOneKm * 100;
        double miles = distance * 0.6214;
        double gallons = fuel * 0.2642;
        double con_us = miles / gallons;

        System.out.printf("consumption in liter/100km is %.2f\n", conForHundredKm);
        System.out.printf("Consumption in miles/gallons is %.2f", con_us);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fuel quantity to fill the tank in litres");
        double fuel = sc.nextInt();
        System.out.println("Enter distance covered in above fuel quantity in kilometers");
        double distance = sc.nextInt();
        calculateConsumption(fuel, distance);
        sc.close();
    }
}
