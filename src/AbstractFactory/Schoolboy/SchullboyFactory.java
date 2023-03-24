package AbstractFactory.Schoolboy;

import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;

public class SchullboyFactory implements StackFactory {
    @Override
    public OS getOS() {
        return new Windows();
    }

    @Override
    public Program getProgram() {
        return new Excel();
    }
}
