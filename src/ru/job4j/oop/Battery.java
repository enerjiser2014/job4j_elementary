package ru.job4j.oop;

public class Battery {
    private int power;

    public Battery(int pw) {
        this.power = pw;
    }

    public void exchange(Battery another) {
        this.power += another.power;
        another.power = 0;
    }

    public void show() {
        System.out.println("power is: " + this.power);
    }

    public static void main(String[] args) {
        Battery bat1 = new Battery(50);
        Battery bat2 = new Battery(50);
        bat1.show();
        bat2.show();
        bat1.exchange(bat2);
        bat1.show();
        bat2.show();
    }
}
