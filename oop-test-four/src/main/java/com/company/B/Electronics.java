package com.company.B;

public class Electronics {
    private String brand;

    public Electronics(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getInfo() {
        System.out.println("Brand: " + brand);
    }
}
