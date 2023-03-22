package Arrays;

import java.util.Random;

/**
 *
 * @author belkizozbek
 */
public class ForEach {

    public static void main(String[] args) {

        Random r = new Random();
        int randomInt = Math.abs(r.nextInt());
        int size = randomInt % 100;
        System.out.println("Size is " + size);
        int[] intArray = new int[size];

        for (int i = 0; i < intArray.length; i++) {
            randomInt = r.nextInt();
            int number = randomInt % 100;
            intArray[i] = number;
        }

        for (int i : intArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

    }

}
