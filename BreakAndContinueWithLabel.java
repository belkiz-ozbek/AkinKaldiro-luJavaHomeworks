package org.javaturk.oopj.ch05;

/**
 *
 * @author belkizozbek
 */
public class BreakAndContinueWithLabel {

    public static void main(String[] args) {

        int[][] arrayOfInts = {{32, 7, 5, 678},
                                {12, 374, 3476, 12},
                                {678, 123, 12, 12}};
        int searchfor = 12;

        int i = 0;
        int j = 0;
        boolean foundIt = false;

        here: 
        for (; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    System.out.println("Found " + searchfor + " at " + i + ", " + j);
                    break here;     //continue here
                }
            }
        }

        if (!foundIt) {
            System.out.println(searchfor + " not in the array");
        }

    }

}
