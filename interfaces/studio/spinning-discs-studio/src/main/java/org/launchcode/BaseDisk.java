package org.launchcode;

public abstract class BaseDisk {
    private int rmpSpeed = 0;
    private String title = "";

    public BaseDisk(int rmpSpeed, String title) {
        this.rmpSpeed = rmpSpeed;
        this.title = title;
    }

    public int getRmpSpeed() {
        return rmpSpeed;
    }

    public void setRmpSpeed(int rmpSpeed) {
        this.rmpSpeed = rmpSpeed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
