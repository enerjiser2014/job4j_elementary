package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        kolobok.run();
        kolobok.say(hare);
        hare.say(fox);
        fox.say(wolf);
        wolf.eat(kolobok);
    }
}
