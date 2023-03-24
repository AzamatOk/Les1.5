package AbstractFactory.Programmer;

import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;

public class HostStackFactory implements StackFactory {
    @Override
    public OS getOS() {
        return new Windows();
    }

    @Override
    public Program getProgram() {
        return new WebServer();
    }
}
