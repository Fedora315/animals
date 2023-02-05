package Items;

public class Bear extends Animal{
    public Bear(Coordinate coordinate, int distance, int healthLevel, int foodLevel, int recoveryLevel) {
        super(coordinate, distance, healthLevel, foodLevel, recoveryLevel);


    }

    @Override
    public boolean canEat(Eatable eatable) {
        return canEat(eatable, Fox.class, Mouse.class, Rabbit.class);
    }

    @Override
    public boolean isAlive() {
        return getHealthLevel()>0;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 100;
    }



}

