package lesson_1;

public class Creature implements Compete {
    protected String type;
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected boolean onDistance;

    public Creature(){

    }

    public Creature(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " хорошо пробежал");
        } else {
            System.out.println(type + " " + name + " не добежал");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не перепрыгнул стену");
            onDistance = false;
        }
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(this.type + " " + this.name + " Бегучесть - " + this.maxRunDistance +
                " Прыгучесть - " + this.maxJumpHeight);
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
}
