package task1;

public class Dog extends Animal{

    public Dog(String name) {
        super(500, 10, name);
        AnimalsHelper.incDogsCount();
    }

    @Override
    public void run(int distance) {
        if (distance < getRunDistanceLimit()) {
            System.out.println("Собка пробежала " + distance + "м.");
        } else {
            System.out.println("Собака не может столько пробежать!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < getSwimDistanceLimit()) {
            System.out.println("Собака проплыла " + distance + "м.");
        } else {
            System.out.println("Собака не может столько проплыть");
        }
    }
}
