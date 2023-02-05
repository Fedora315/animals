package Items;

public class Rabbit extends Animal{
    public Rabbit (Coordinate coordinate, int distance, int healthLevel, int foodLevel, int recoveryLevel) {
        super(coordinate, distance, healthLevel, foodLevel, recoveryLevel);


    }

    @Override
    public boolean canEat(Eatable eatable) {
        return canEat(eatable, Mouse.class);
    }

    @Override
    public boolean isAlive() {
        return  getHealthLevel()>0;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 50;
    }

    @Override
    public void eat() {

    }
}
