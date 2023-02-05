package Items;

public abstract class Animal extends Killer implements Eatable {
    private int foodLevel;
    private int healthLevel;
    private final int recoveryLevel;

    public Animal(Coordinate coordinate, int distance, int healthLevel, int foodLevel, int recoveryLevel){
        super(coordinate, distance);
        this.foodLevel=foodLevel;
        this.healthLevel=healthLevel;
        this.recoveryLevel=recoveryLevel;
    }

    public int getRecoveryLevel(){
        return recoveryLevel;
    }
    public void setFoodLevel (int foodLevel){
        this.foodLevel=foodLevel;
    }
    public int getFoodLevel(){
        return foodLevel;
    }
    public void setHealthLevel (int healthLevel){
        this.healthLevel=healthLevel;
    }
    public int getHealthLevel(){
        return healthLevel;
    }

    public abstract boolean canEat(Eatable eatable);

    public boolean canEat(Eatable eatable, Class ... classes){
        for (int i=0;i<classes.length;i++){
            if (classes[i] == eatable.getClass()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public void kill(Item item) {
        if (item instanceof Eatable){
            Eatable eatable=(Eatable) item;
            if (canEat(eatable)){
                eatable.eat();
                setFoodLevel(getFoodLevel()+eatable.getFoodLevelIncreasing());

            }

        }
    }

    @Override
    public void eat() {
        healthLevel=0;
    }
}
