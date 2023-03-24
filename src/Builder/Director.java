package Builder;

public class Director {
    GameBuilder build;

    public void setBuilders(GameBuilder build) {
        this.build = build;
    }
    Game buildGame(){
        build.createGame();
        build.buildName();
        build.buildGaner();
        build.buildPrice();

        Game game = build.getGame();
        return game;
    }
}
