package ru.job4j.condition;

public class Cinema {
//    public static void access(int age) {
//        int approveAge = 18;
//        System.out.println("The age of the customer is : " + age);
//        if (age >= approveAge) {
//            System.out.println("Welcome to the cinema.");
//        } else {
//            System.out.println("It is not for you");
//        }
//    }

    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't");
        }
    }

    public static void main(String[] args) {
//        Cinema.access(21);
//        Cinema.access(16);

        permission(true, true);
        permission(false, false);
        permission(false, true);
        permission(false,false);

    }
}
