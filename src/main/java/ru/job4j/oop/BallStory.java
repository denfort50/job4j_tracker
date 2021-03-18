package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(kolobok);
        kolobok.escape(hare);
        wolf.tryEat(kolobok);
        kolobok.escape(wolf);
        fox.tryEat(kolobok);
        kolobok.end(fox);
    }
}
