package com.loonycorn;

public class EntryPoint {

    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.format("App is running in %s mode.\n", this.mode);
    }

    public static void main(String[] args) {

        EntryPoint ep = new EntryPoint("DEV");

        ep.printMode();

    }
}