package Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Builder> builders = new ArrayList<Builder>();

    public void addBuilder(Builder builder){
        builders.add(builder);
    }
    public void removeBuilder(Builder builder){
        builders.remove(builder);
    }
    public void buildHouse(){
        System.out.println("Строители строят... *тук* *тук* *тук*");
        for (Builder builders: builders){
            builders.working();
        }
    }
}
