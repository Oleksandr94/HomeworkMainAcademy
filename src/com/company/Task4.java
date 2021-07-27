package com.company;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 30) {

            for (; i <= 25; ) {
                for (; i % 2 == 0; i++) {
                    System.out.println("Hello from England");
                }

                for (; i % 2 == 1; i++) {
                    if(i==15)
                        continue;
                    System.out.println("Привіт з України");
                }
            }
            i++;
            System.out.println("Hola from Spain");
        }

    }
}