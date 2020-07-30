package lesson_1;

import java.util.Random;

public class Treadmill implements Obstacle {
    protected int length;

    public Treadmill(int length) {
        this.length = length;
    }
    public Treadmill() {
        Random random = new Random();
        //Диапазон от 500 до 1500
        this.length = random.nextInt((1500 - 500) + 1) + 500;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public void tryIt(Compete compete) {
        compete.run(length);
    }

    @Override
    public int getValue() {
        return this.length;
    }
}
