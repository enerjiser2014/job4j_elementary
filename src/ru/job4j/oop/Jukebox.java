package ru.job4j.oop;

public class Jukebox {
    private String song1 = "Пусть бегут неуклюже...";
    private String song2 = "Спокойной ночи...";
    private String NotFound = "Песня не найдена";
    public void music(int position){
        String rsl = NotFound;
        if (position == 1) {
            rsl = song1;
        }
        if (position == 2) {
            rsl = song2;
        }
        song(rsl);
    }

    void song(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
        box.music(2);
        box.music(3);
    }
}
