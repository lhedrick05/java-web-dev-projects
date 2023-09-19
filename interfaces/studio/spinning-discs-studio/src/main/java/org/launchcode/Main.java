package org.launchcode;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        CD Karma = new CD(600, "Karma");
        Karma.spinDisc();
        Karma.writeData();
        Karma.readData();
        Karma.reportData();
        Karma.storeData();

        System.out.println("\n********\n");

        DVD spiderman = new DVD(1000, "Spiderman: Across the Spiderverse");
        spiderman.spinDisc();
        spiderman.writeData();
        spiderman.readData();
        spiderman.reportData();
        spiderman.storeData();

        System.out.println("\n********\n");

        Frisbee frisbee = new Frisbee(20, "Newton's Frisbee");
        frisbee.moveDisk();

        System.out.println("\n********\n");

        Wheel wheel = new Wheel(45, "Goodyear");
        wheel.moveDisk();
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}