package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        names[0] = "Petr Arsentev";
        names[1] = "Jagupov Jurii";
        names[2] = "Vladimir Lenin";
        names[3] = "Sergey Krolev";
    }
}
