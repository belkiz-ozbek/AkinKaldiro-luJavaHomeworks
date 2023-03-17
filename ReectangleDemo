package org.javaturk.shapes.rectangle;

public class Rectangle {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.drawFilledReactangle(5, 7);
        System.out.println();
        r.drawVoidRectangle(4, 7);
        //içi boş dikdörtgen çiz
    }

    public void drawFilledReactangle(int row, int column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawVoidRectangle(int row, int column) { //row yatay, column dikey

        //if else lerle yap tekrar
        for (int i = 0; i < column; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < row - 2; i++) {

            System.out.print("*");
            for (int j = 0; j < column - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < column; i++) {
            System.out.print("*");
        }

    }

}
