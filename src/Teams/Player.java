package Teams;

public class Player {
    String name;
    String position;

    Player(String name, String position){
        this.name=name;
        this.position=position;
    }
    @Override
    public String toString(){
        return this.name+" : "+this.position;
    }
}
