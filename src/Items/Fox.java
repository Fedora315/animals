package Items;

public class Fox extends Animal {
    public Fox (Coordinate coordinate, int distance, int healthLevel, int foodLevel, int recoveryLevel) {
        super(coordinate, distance, healthLevel, foodLevel, recoveryLevel);


    }

    @Override
    public boolean canEat(Eatable eatable) {
        return canEat(eatable, Rabbit.class, Mouse.class);
    }

    @Override
    public boolean isAlive() {
        return   getHealthLevel()>0;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 70;
    }

    @Override
    public void eat() {

    }
}
