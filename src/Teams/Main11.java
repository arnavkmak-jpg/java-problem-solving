package Teams;

public class Main11 {
    public static void main(String[] args) {
        Player p1= new Player("Lionel Messi","Forward");
        Player p2= new Player("Virgil van Dijk","Defender");
        Player p3= new Player("Alisson Becker","Goalkeeper");
        Player p4= new Player("Kevin De Bruyne","Midfielder");

        Player[] InterM= {p1,p2,p4};
        Player[] Argentina= {p1,p3};
        Player[] Belgium={p2,p4};

        Team team1 = new Team("Inter Milan",InterM);
        Team team2 = new Team("Argentina",Argentina);
        Team team3 = new Team("Belgium",Belgium);

        Team[] teams = {team1,team2,team3};
        for (int i=0;i<teams.length;i++){
            System.out.println(teams[i]);

        }


    }
}
