package com.company.B;

public class Laptop extends Computers {
    private double screenSize;

    public Laptop(String brand, String processor, int ramSize, int sdd, double screenSize) {
        super(brand, processor, ramSize, sdd);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Screen size: " + screenSize + " HD");
    }
}
