package org.launchcode;

public class Frisbee extends BaseDisk implements PhysicalMovingDisk{

    public Frisbee(int rmpSpeed, String title) {
        super(rmpSpeed, title);
    }

    @Override
    public void moveDisk() {
        System.out.println("The frisbee is moving");
    }
}
