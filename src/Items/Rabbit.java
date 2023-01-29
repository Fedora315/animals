package Items;

public class Rabbit extends Animal{
    public Rabbit (Coordinate coordinate, int distance, int healthLevel, int foodLevel, int recoveryLevel) {
        super(coordinate, distance, healthLevel, foodLevel, recoveryLevel);


    }

    @Override
    public boolean canEat(Eatable eatable) {
        return false;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 0;
    }

    @Override
    public void eat() {

    }
}
