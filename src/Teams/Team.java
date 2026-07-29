package Teams;

public class Team {
    String name;
    Player[] players;

    Team(String name,Player[] players){
        this.name=name;
        this.players=players;
    }
    @Override
    public String toString(){
        String result = this.name+"\n";
        for (Player i:players){
            result+=i+"\n";
        }
        return result;
    }

}
