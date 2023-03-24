package AbstractFactory.SchullboyProject;

import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;
import AbstractFactory.Schoolboy.SchullboyFactory;

public class Run {
    public static void main(String[] args) {
        StackFactory stackFactory = new SchullboyFactory();
        OS os = stackFactory.getOS();
        Program program = stackFactory.getProgram();

        os.Run();
        program.prog();
    }
}
