package Builder;


public class Run {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilders(new ShooterGame());
        Game game = director.buildGame();

        System.out.println(game);
    }




}
