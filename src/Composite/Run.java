package Composite;

public class Run {
    public static void main(String[] args) {
        Team team = new Team();
        Builder firstCBuilder = new Carpanter();
        Builder secondCBuilder = new Carpanter();
        Builder firstRBuilder = new Roofer();

        team.addBuilder(firstCBuilder);
        team.addBuilder(secondCBuilder);
        team.addBuilder(firstRBuilder);

        team.buildHouse();
    }
}
