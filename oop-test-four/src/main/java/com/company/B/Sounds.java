package com.company.B;

public class Sounds extends Electronics {
    private int power;

    public Sounds(String brand, int power) {
        super(brand);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Power: " + power + " Watts");
    }
}
