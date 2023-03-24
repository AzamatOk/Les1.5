package AbstractFactory.Programmer;

import AbstractFactory.Program;

public class WebServer implements Program {
    @Override
    public void prog() {
        System.out.println("Visual Studio Code запущен");
    }
}
