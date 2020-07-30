package lesson_1;

public class Main {
    public static void main (String... args) {
        Course randomCourse = new Course();
        randomCourse.infoObstacles();
        Team randomTeam = new Team();
        randomTeam.infoCompetitors();
        randomCourse.doIt(randomTeam);
        randomTeam.showResults();
    }
}
