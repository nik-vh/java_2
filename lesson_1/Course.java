package lesson_1;

import java.util.Arrays;
import java.util.Random;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public Course() {
        obstacles = new Obstacle[10];
        Random random = new Random();
        //1-Wall 2-Water
        for (int i = 0; i < obstacles.length; i++) {
            int what = random.nextInt(2);
            if(what == 0) {
                this.obstacles[i] = new Wall();
            } else if(what == 1) {
                this.obstacles[i] = new Treadmill();
            }
        }
    }

    public void infoObstacles() {
        for (Obstacle o: obstacles) {
            System.out.println(o);
        }
    }

    public void doIt(Team team) {
        System.out.println("Команда стартует!!!");
        System.out.println("=======================================");
        for (Compete c : team.getCompetitors()) {
            for (Obstacle o : obstacles) {
                o.tryIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}