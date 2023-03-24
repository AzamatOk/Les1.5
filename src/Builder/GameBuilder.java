package Builder;

public abstract class GameBuilder {
    Game game;
    void createGame(){
        game = new Game();
    }

    abstract void  buildName();
    abstract void buildGaner();
    abstract void buildPrice();

    Game getGame(){
        return game;
    }
}
