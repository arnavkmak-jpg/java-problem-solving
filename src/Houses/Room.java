package Houses;

public class Room {
    String name;
    String location;

    Room(String name, String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString() {
        return this.name+" "+this.location;
    }
}
