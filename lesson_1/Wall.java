package lesson_1;

import java.util.Random;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
        Random random = new Random();
        this.height = random.nextInt(15 ) + 1; //Диапазон от 1 до 30
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void tryIt(Compete compete) {
        compete.jump(height);
    }

    @Override
    public int getValue() {
        return this.height;
    }
}
