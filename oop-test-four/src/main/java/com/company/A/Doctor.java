package com.company.A;

public class Doctor {
    private String name;
    private String specialty;
    private int yearOfExperience;

    public Doctor(String name, String specialty, int yearOfExperience) {
        this.name = name;
        this.specialty = specialty;
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Experience years: " + yearOfExperience);
    }
}
