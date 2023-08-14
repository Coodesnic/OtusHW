package service;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return new Random().nextInt();
    }
    public int repairedRoll1() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return  ((int)(Math.random() * 6) + 1);
    }
}
