package Builder;

public class Game {
    private String name;
    private Ganer genre;
    private int price;

    public void setName(String name){
        this.name = name;
    }

    public void setGenre(Ganer genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Game{"+
                "price=" + price +
                ", ganer=" + genre +
                ", name=" + name +'\'' +
                '}';
    }
}
