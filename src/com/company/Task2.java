package com.company;

public class Task2 {

    public static void main(String[] args) {
        int rating = -5 ;

        if (rating == 25) {
            System.out.println("F");
        }
        else if (rating >= 25 && rating <= 45) {
            System.out.println("E");
        }
        else if (rating >= 45 && rating <= 50) {
            System.out.println("D");
        }
        else if (rating >= 50 && rating <= 60) {
            System.out.println("B");
        }
        else if (rating >= 60 && rating <= 80) {
            System.out.println("C");
        }
        else if (rating >= 80 && rating <= 100) {
            System.out.println("A");
        }
    }
}

