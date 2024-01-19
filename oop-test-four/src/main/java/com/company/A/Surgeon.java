package com.company.A;

public class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, String specialty, int yearOfExperience, String surgeryType) {
        super(name, specialty, yearOfExperience);
        this.surgeryType = surgeryType;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Surgery Type: " + surgeryType);
    }
}
