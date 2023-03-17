package org.javaturk.oopj.ch05;

/**
 *
 * @author belkizozbek
 */
public class BreakAndContinue {

    public static void main(String[] args) {

        System.out.println("Break");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                break;  //Terminate loop
            }
            System.out.println(i + "\t" + Math.sqrt(i));
        }

        System.out.println("\nContinue");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;   //Terminate only this step.
            }
            System.out.println(i + "\t" + Math.sqrt(i));
        }

    }
}
