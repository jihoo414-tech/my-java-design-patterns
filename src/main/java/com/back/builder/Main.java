package com.back.builder;

public class Main {
    public static void main(String[] args){
        Computer officeComputer = new Computer.Builder("Intel i3", 8)
                .build();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", 32)
                .setStorage(1024)
                .setGraphicsCard("NVIDIA RTX 4080")
                .setBluetoothEnabled(true)
                .build();

        System.out.println("=== 사무용 컴퓨터 ===");
        System.out.println(officeComputer);

        System.out.println("\n=== 게이밍 컴퓨터 ===");
        System.out.println(gamingComputer);
    }
}
