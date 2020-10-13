package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(int value) {
        return (float)value / 90;
    }

    public static float rubleToDollar(int value) {
        return (float)value / 77;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " $$.");
    }
}
