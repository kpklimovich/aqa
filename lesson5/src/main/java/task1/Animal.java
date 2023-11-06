package task1;

public class Animal {

    private int runDistanceLimit;
    private int swimDistanceLimit;
    private String name;

    public Animal(int runDistanceLimit, int swimDistanceLimit, String name) {
        this.swimDistanceLimit = swimDistanceLimit;
        this.runDistanceLimit = runDistanceLimit;
        this.name = name;
        AnimalsHelper.incAnimalsCount();
    }
    public int getSwimDistanceLimit() {
        return swimDistanceLimit;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public String getName() {
       return name;
    }

    public void run(int distance) {
        if (distance < runDistanceLimit) {
            System.out.println("Животное пробежало " + distance + "м.");
        } else {
            System.out.println("Животное не может столько пробежать!");
        }
    }

    public void swim(int distance) {
        if (distance < swimDistanceLimit) {
            System.out.println("Животное проплыло " + distance + "м.");
        } else {
            System.out.println("Животное не может столько проплыть");
        }
    }
}
