package Items;

public class Item {
    private Coordinate coordinate;

    public Item(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate(){
        return coordinate;
    }
}
