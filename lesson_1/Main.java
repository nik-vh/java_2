package lesson_1;

public class Main {
    public static void main (String... args) {

        Course randomCourse = new Course();
        randomCourse.infoObstacles();
        Team randomTeam = new Team();
        randomTeam.infoCompetitors();
        randomCourse.doIt(randomTeam);
        randomTeam.showResults();

        Team team = new Team( new Human("Bob"), new Cat("Vaska"), new Robot("Killer"));
        Course course = new Course(new Treadmill(80), new Wall(2), new Wall(1), new Treadmill(120));
        course.doIt(team);
        team.showResults();
    }
}
