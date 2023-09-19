package org.launchcode;

public class Wheel extends BaseDisk implements PhysicalMovingDisk{

    public Wheel(int rmpSpeed, String title) {
        super(rmpSpeed, title);
    }

    @Override
    public void moveDisk() {
        System.out.println("The wheel is moving");
    }
}
