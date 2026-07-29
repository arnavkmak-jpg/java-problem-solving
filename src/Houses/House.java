package Houses;

public class House {
    String name;
    int number;
    Room room1;
    Room room2;

    House(String name, int number){
        this.name=name;
        this.number=number;
        this.room1 = new Room("Bedroom","Back");
        this.room2 = new Room("Kitchen","Front");

    }
    void detail(){
        System.out.println(this.number+" "+this.name+"\n");
        System.out.println(this.room1);
        System.out.println(this.room2);

    }
}
