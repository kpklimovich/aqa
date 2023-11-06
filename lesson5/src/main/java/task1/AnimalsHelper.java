package task1;

public class AnimalsHelper {

    private static int animalsCount = 0;
    private static int catsCount = 0;
    private static int dogsCount = 0;

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public static void incAnimalsCount() {
        animalsCount++;
    }

    public static void incCatsCount() {
        catsCount++;
    }

    public static void incDogsCount() {
        dogsCount++;
    }
}
