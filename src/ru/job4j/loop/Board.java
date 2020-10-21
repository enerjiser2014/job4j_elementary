package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        // Vertical
        for (int  row= 0; row < height; row++) {
            // Horizontal
            for (int cell = 0; cell < width; cell++) {
                String f1 = row % 2 == 0 ? "X" : " ";
                String f2 = row % 2 == 0 ? " " : "X";
                System.out.print(cell % 2 == 0 ? f1 : f2);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        paint(3,3);
        System.out.println();
        paint(5,4);
    }
}
