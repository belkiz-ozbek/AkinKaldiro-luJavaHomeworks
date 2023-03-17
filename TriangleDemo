package org.javaturk.shapes.triangle;

public class Triangle {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.dikUcgen(10);
        System.out.println();
        t.ucgen(10);

    }

    public void dikUcgen(int row) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void ucgen(int row) {

        for (int i = 0; i < row; i++) {

            //row row-1 row-2
            for (int j = 1; j < row - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
