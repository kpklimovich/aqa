package task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1");
        cat1.swim(10);

        Dog dog1 = new Dog("Dog1");
        dog1.run(600);

        System.out.println("Всего животных - " + AnimalsHelper.getAnimalsCount());
        System.out.println("Из них собак - " + AnimalsHelper.getDogsCount());

        int foodCount = 50;
        int partialFoodCount = 15;
        Cat[] cats = {new Cat("Cat11"), new Cat("Cat12"), new Cat("Cat13"), new Cat("Cat14")};
        Plate plate = new Plate(foodCount);

        for(Cat cat : cats) {
            cat.tryToEat(plate, partialFoodCount);
        }

        for(Cat cat : cats) {
            if (cat.getSatiety()) {
                System.out.println(cat.getName() + " - сыт");
            } else {
                System.out.println(cat.getName() + " - голоден");
            }
        }
    }
}
