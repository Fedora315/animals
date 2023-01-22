package Items;

public class Hunter extends Killer{
    int count=0;

    public Hunter(Coordinate coordinate,int distance){
        super( coordinate,distance);
    }

    @Override
    public void kill(Item item) {
        if (item instanceof Animal){
            Animal animal=(Animal) item;
            animal.setHealthLevel(0);
            count++;
        }

    }

}
