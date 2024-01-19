package com.company;

import com.company.A.Lor;
import com.company.A.Surgeon;
import com.company.B.Laptop;
import com.company.B.Loudspeaker;
import com.company.B.PC;
import com.company.B.Subwoofer;

public class Main {
    public static void main(String[] args) {

        Lor lor = new Lor("Dr John", "Ear", 12);
        lor.displayInfo();

        Surgeon surgeon = new Surgeon("Dr Smith", "General", 23, "Cardiac Surgery");
        surgeon.displayInfo();

        System.out.println("_ _ _ _ _ _ _");

        PC pc = new PC("Desktop", "Intel core i5", 16, 512, " Windows");
        pc.getInfo();

        Laptop laptop = new Laptop("Leanova", "AMD Ryzen 5", 16, 256, 15.6);
        laptop.getInfo();

        Subwoofer subwoofer = new Subwoofer("Bass master", 200);
        subwoofer.getInfo();

        Loudspeaker loudspeaker = new Loudspeaker("GGG", 100);
        loudspeaker.getInfo();
    }
}