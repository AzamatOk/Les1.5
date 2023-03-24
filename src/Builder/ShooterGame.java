package Builder;

public class ShooterGame extends GameBuilder {
    @Override
    void buildName(){
        game.setName("CoD");
    }
    @Override
    void buildGaner(){
        game.setGenre(Ganer.SHOOTER);
    }
    @Override
    void  buildPrice(){
        game.setPrice(1500);
    }
}
