package ru.job4j.calculator;

public class ArgMethod {
    public static void main(String[] args) {
        String name = "Jagupov Jurii";
        int age = 37;
        ArgMethod.hello(name, age);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}
