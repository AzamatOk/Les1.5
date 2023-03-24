package Builder;

public class StratGame extends GameBuilder {
    @Override
    void buildName(){
        game.setName("EoEII");
    }
    @Override
    void buildGaner(){
        game.setGenre(Ganer.STRATEGY);
    }
    @Override
    void  buildPrice(){
        game.setPrice(1600);
    }
}
