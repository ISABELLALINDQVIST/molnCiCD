package org.ISABELLALINDQVIST;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        Car car1 = new Car(0, "gröna");
        Car car2 = new Car(50, "röda");

        System.out.println(car1.Status());
        System.out.println(car2.Status());

        System.out.println(car1.Accelerate( 150));


    }
}