package com.company.B;

public class Computers extends Electronics {
    private String processor;
    private int ramSize;
    private int sdd;

    public Computers(String brand, String processor, int ramSize, int sdd) {
        super(brand);
        this.processor = processor;
        this.ramSize = ramSize;
        this.sdd = sdd;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getSdd() {
        return sdd;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setSdd(int sdd) {
        this.sdd = sdd;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Processor: " + processor);
        System.out.println("Ram size: " + ramSize);
        System.out.println("SSD: " + sdd + " GB");
    }
}
