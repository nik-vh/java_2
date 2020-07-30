package lesson_1;

import java.util.Random;

public class Human extends Creature {

    public Human(String type, String name, int maxRunDistance, int maxJumpHeight) {
        super(type, name, maxRunDistance, maxJumpHeight);
    }

    public Human (String name) {
        super("Человек", name, 1000, 3);
    }

    public Human() {
        Random random = new Random();
        String[] names = {"Иван", "Николай", "Дмитрий", "Алексей", "Владимир", "Борис", "Андрей", "Иосиф", "Бонопарт", "Ашот"};
        this.type = "Человек";
        this.name = names[random.nextInt(9)];
        this.maxRunDistance = random.nextInt(1200 - 801) + 800; //Диапазон от 800 до 1200
        this.maxJumpHeight = random.nextInt(3) + 2; //Диапазон от 2 до 4
        this.onDistance = true;
    }
}
