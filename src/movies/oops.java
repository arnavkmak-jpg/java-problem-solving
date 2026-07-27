package movies;

public class oops {
    public static void main(String[] args) {
        movies movie1 = new movies("Inception",8.8);
        movies movie2 = new movies("Twilight",5.3);
        movies movie3 = new movies("Knives Out",7.9);
        movies movie4 = new movies("Spider-Man: Into the Spider-Verse",8.4);
        movies movie5 = new movies("Spirited Away",8.6);

        movies[] list = {movie1,movie2,movie3,movie4,movie5};
        for (movies good:list){
            if (good.rating>8){
                System.out.println(good.name+" | Rated: "+good.rating);
            }
        }


    }
}
