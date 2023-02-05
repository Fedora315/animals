package Items;

public class Mouse extends Animal {

    public Mouse(Coordinate coordinate, int distance, int healthLevel, int foodLevel, int recoveryLevel) {
        super(coordinate, distance, healthLevel, foodLevel, recoveryLevel);


    }

    @Override
    public boolean canEat(Eatable eatable) {
        return false;
    }

    @Override
    public boolean isAlive() {
        return  getHealthLevel()>0;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 30;
    }

    @Override
    public void eat() {

    }
}
