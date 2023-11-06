package task1;

public class Cat extends Animal {

    private boolean satiety;
    Cat(String name) {
        super(200, -1, name);
        satiety = false;
        AnimalsHelper.incCatsCount();
    }

    public boolean getSatiety() {
        return satiety;
    }

    @Override
    public void run(int distance) {
        if (distance < getSwimDistanceLimit()) {
            System.out.println("Кот пробежал " + distance + "м.");
        } else {
            System.out.println("Кот не может столько пробежать!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public void tryToEat(Plate plate, int foodCount) {
        if (plate.deleteFood(foodCount)) {
            satiety = true;
        } else {
            System.out.println("В тарелке меьше еды, чем хочет кот. Он всё ещё голоден!");
        }
    }
}
