package lesson_1;

import java.util.Random;

public class Cat extends Creature {

    public Cat(String type, String name, int maxRunDistance, int maxJumpHeight) {
        super(type, name, maxRunDistance, maxJumpHeight);
    }

    public Cat (String name) {
        super("Кот", name, 700, 12);
    }

    public Cat() {
        Random random = new Random();
        String[] names = {"Вася", "Мурзик", "Кузя", "Мася", "Мотроскин", "Барсик", "Обормот", "Бегимот", "Пушистик"};
        this.type = "Кот";
        this.name = names[random.nextInt(8)];
        this.maxRunDistance = random.nextInt((800 - 400) + 1) + 400; //Диапазон от 400 до 800
        this.maxJumpHeight = random.nextInt((15 - 10) + 1) + 10; //Диапазон от 10 до 15
        this.onDistance = true;
    }
}
