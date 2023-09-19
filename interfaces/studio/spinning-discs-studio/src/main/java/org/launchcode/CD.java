package org.launchcode;

public class CD extends BaseDisk implements StorageDisk {
    public CD(int rmpSpeed, String title) {
        super(rmpSpeed, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("The spin rate of " + this.getTitle() + " is: " + this.getRmpSpeed());
    }

    @Override
    public void writeData() {
        System.out.println("There is data being written to the CD" + this.getTitle());
    }

    @Override
    public void storeData() {
        System.out.println("There is data being stored on the CD " + this.getTitle());
    }

    @Override
    public void readData() {
        System.out.println("There is data being read on the CD " + this.getTitle());
    }

    @Override
    public void reportData() {
        System.out.println("This is the report data: " + this.getTitle() + ", this is a CD");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
