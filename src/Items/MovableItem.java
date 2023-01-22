package Items;

public abstract class MovableItem extends Item {
    private final int distance;

    public MovableItem (Coordinate coordinate,int distance){
        super(coordinate);
        this.distance=distance;
    }

    public int getDistance(){
        return distance;
    }


}
