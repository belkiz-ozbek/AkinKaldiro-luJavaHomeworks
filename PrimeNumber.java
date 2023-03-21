package AkınHocaHomeworks;

import java.util.Scanner;

/**
 *
 * @author belkizozbek
 */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int number = input.nextInt();
        
        
        PrimeNumber obje = new PrimeNumber();
        //obje.determinePrimeNumber();
        obje.howManyPrimeNumberAreThere(number);

    }

    public boolean determinePrimeNumber(int number) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        //int number = input.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        /*if (flag) {
            return true;
        } else {
            return false;
        }*/
        return flag;
    }

    public void howManyPrimeNumberAreThere(int number) {

        int numberOfPrime = 0;

        for (int i = 2; i < number; i++) {
            if (determinePrimeNumber(i)) {
                numberOfPrime++;
            }
        }

        System.out.println("The total of prime number from 2 to " + number + " is " + numberOfPrime);

    }
}
