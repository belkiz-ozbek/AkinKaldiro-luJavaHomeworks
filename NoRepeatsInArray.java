package AkınHocaHomeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author belkizozbek
 */
public class NoRepeatsInArray {

    //girilen bir dizinin elemanlarını sıralarını bozmadan yeni bir array'e ata
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("arrayin boyutunu gir: ");
        int size = input.nextInt();
        int counter = 0;

        int[] originalArray = new int[size];
        int newArray[] = new int[originalArray.length];

        System.out.println("Please enter numbers of arrays: ");

        for (int i = 0; i < size; i++) {
            originalArray[i] = input.nextInt();
        }

        System.out.println("Array:");
        for (int numbers : originalArray) {
            System.out.print(numbers + " ");
        }

        System.out.println("\nArray elemanları: ");

        for (int i = 0; i < size; i++) {
            boolean tekrar = false;
            for (int j = 0; j < i; j++) {
                if (originalArray[i] == originalArray[j]) {
                    tekrar = true;
                    break;
                }
            }
            if (!tekrar) {
                //counter++;
                newArray[counter++] = originalArray[i];
            }
        }

        //System.out.println("\nYeni arrayin boyutu: " + counter);
        System.out.println(Arrays.toString(Arrays.copyOf(newArray, counter)));

    }
}
