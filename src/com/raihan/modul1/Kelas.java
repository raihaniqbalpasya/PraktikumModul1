package com.raihan.modul1;

public class Kelas {
    private static String nama = "Udin";

    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Main\t\t: " + nama);
        System.out.println("SetMinute\t: " + setMinute());
    }
}
