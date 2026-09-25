package com.back.builder;


public class Computer {

    private final String cpu;
    private final int ram; // GB 단위

    private final int storage; // GB 단위
    private final String graphicsCard;
    private final boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [" +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram + "GB" +
                ", Storage=" + storage + "GB" +
                ", GraphicsCard='" + (graphicsCard != null ? graphicsCard : "None") + '\'' +
                ", Bluetooth=" + isBluetoothEnabled +
                ']';
    }

    public static class Builder{
        private final String cpu;
        private final int ram;

        private int storage = 256;
        private String graphicsCard;
        private boolean isBluetoothEnabled = false;


        public Builder(String cpu, int ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGraphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
            return this;
        }
        public Builder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }

    }


}