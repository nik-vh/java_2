package lesson_1;

import java.util.Random;

public class Robot extends Creature {

    public Robot(String type, String name, int maxRunDistance, int maxJumpHeight) {
        super(type, name, maxRunDistance, maxJumpHeight);
    }

    public Robot (String name) {
        super("Робот", name, 1200, 5);
    }

    public Robot() {
        Random random = new Random();
        String[] names = {"Робокоп", "Терминатор", "Прайм", "Трансформер", "Робопес", "Киборг", "Бот", "Машина", "Убийца"};
        this.type = "Робот";
        this.name = names[random.nextInt(8)];
        this.maxRunDistance = random.nextInt((1500 - 1400) + 1) + 1400; //Диапазон от 1000 до 1500
        this.maxJumpHeight = random.nextInt((15 - 12) + 1) + 12; //Диапазон от 5 до 10
        this.onDistance = true;
    }
}
