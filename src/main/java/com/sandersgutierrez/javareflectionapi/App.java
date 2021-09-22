package com.sandersgutierrez.javareflectionapi;

import com.sandersgutierrez.javareflectionapi.model.Computer;
import com.sandersgutierrez.javareflectionapi.model.Washer;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();
        Computer computerOne = new Computer(1L, 3, "HP EliteBook 840 G6");
        Computer computerTwo = new Computer(2L, 2, "Lenovo ThinkPad T490");
        computerList.add(computerOne);
        computerList.add(computerTwo);

        for (Computer computer : computerList) {
            System.out.println("ID: " + computer.getId());
            System.out.println("Power: " + computer.getPower());
            System.out.println("Description: " + computer.getDescription());
            System.out.println("---------------------------------------");
        }

        System.out.println("\n|==================================|\n");

        List<Washer> washerList = new ArrayList<>();
        Washer washerOne = new Washer(1L, "LG-480", "The Washer's home");
        Washer washerTwo = new Washer(2L, "Samsung-T50", "The Washer of my Mom");
        washerList.add(washerOne);
        washerList.add(washerTwo);

        for (Washer washer : washerList) {
            System.out.println("ID: " + washer.getId());
            System.out.println("Model: " + washer.getModel());
            System.out.println("Description: " + washer.getDescription());
            System.out.println("---------------------------------------");
        }
    }
}
