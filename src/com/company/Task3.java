package com.company;

public class Task3 {

    public static double getDiscount(String type) {
        switch(type) {
            case "A":
                return 0.7;
            case "B":
                return 0.5;
            case "C":
            case "D":
                return 0.2;
            case "E":
                return 0.1;
            default:
                return 0.02;
        }
    }

    public static void main(String[] args) {
        double price = 99.99;
        String discountType = "E";

        System.out.println(price - (getDiscount(discountType) * price));
    }
}