package lesson_1;

import java.util.Arrays;
import java.util.Random;

public class Team {
    protected Compete[] competitors;

    public Team (String name, Compete... competitors) {
        this.competitors = competitors;
    }

    public Team() {
        competitors = new Compete[10]; //10 участников
        Random random = new Random();
        //Random 1-Cat 2-Human 3-Robot
        for (int i = 0; i < competitors.length; i++) {
            int who = random.nextInt(3);
            if(who == 0) {
                this.competitors[i] = new Cat();
            } else if (who == 1) {
                this.competitors[i] = new Human();
            } else {
                this.competitors[i] = new Robot();
            }
        }
    }

    public void showResults() {
        System.out.println("Препятствия преодолели: ");
        for(Compete c: competitors) {
            if(c.isOnDistance()) {
                c.info();
            }
        }
    }

    public void infoCompetitors() {

        for (Compete o: competitors) {
            System.out.println(o);
        }
    }

    public Compete[] getCompetitors() {
        return competitors;
    }

}
