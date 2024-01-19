package com.company.B;

public class PC extends Computers {
    private String system;

    public PC(String brand, String processor, int ramSize, int sdd, String system) {
        super(brand, processor, ramSize, sdd);
        this.system = system;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("System: " + system);
    }
}
