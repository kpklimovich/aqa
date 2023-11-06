package task1;

public class Plate {
    private int foodCount = 0;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void addFood(int foodCount) {
        this.foodCount += foodCount;
    }

    public boolean deleteFood(int foodCount) {
        if (this.foodCount >= foodCount) {
            this.foodCount -= foodCount;
            return true;
        } else {
            return false;
        }
    }
}
