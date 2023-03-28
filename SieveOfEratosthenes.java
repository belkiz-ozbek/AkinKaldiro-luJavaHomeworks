package AkınHocaHomeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author belkizozbek
 */
public class SieveOfEratosthenes {

    public static void main(String[] args) {
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        System.out.println("Please enter a positive number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        soe.countNumberOfPrimesUpTo(n);

    }

    void countNumberOfPrimesUpTo(int n) {
        long start = System.currentTimeMillis();
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);
        list[0] = false;
        list[1] = false;
        
        for (int i = 2; i <= n; i++) {
            if (list[i] == true) {
                for (int j = 2; i * j <= n; j++) {
                    list[i * j] = false;
                }
            }
        }

        int primeNumber = 0;
        for(boolean b: list){
            if(b){
                primeNumber++;
            }
        }
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(n + " sayısına kadar " + primeNumber + " tane asal sayı vardır.");
        System.out.println("Time: " + time + " ms.");
    }
}
 