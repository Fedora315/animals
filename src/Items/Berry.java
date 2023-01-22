package Items;

public class Berry extends Item implements Eatable{
    private final int foodLevelIncreasing;
    private boolean isAlive=true;

    public Berry(Coordinate coordinate, int foodLevelIncreasing){
        super(coordinate);
        this.foodLevelIncreasing=foodLevelIncreasing;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return foodLevelIncreasing;
    }

    @Override
    public void eat() {
        isAlive=false;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }
}
