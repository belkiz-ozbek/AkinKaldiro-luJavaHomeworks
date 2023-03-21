package org.javaturk.algorithm;

import java.util.Scanner;

/**
 *
 * @author belkizozbek
 */
public class MonteCarloPI {

    public static void main(String[] args) {

        System.out.println("Nokta sayısını girin: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int numberInCircle = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            // Akın hoca köke almaya gerek yok diyor bir ile kıyaslanacağı için???
            double distance = Math.sqrt(x * x + y * y);
            if (distance <= 1) {
                numberInCircle++;
            }
        }

        double myPI = 4.0 * numberInCircle / n;
        System.out.println("My pi " + myPI);
        System.out.println("Java's pi " + Math.PI);

    }

}
