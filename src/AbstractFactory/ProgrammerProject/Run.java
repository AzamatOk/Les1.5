package AbstractFactory.ProgrammerProject;

import AbstractFactory.Programmer.HostStackFactory;
import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;

public class Run {
    public static void main(String[] args) {
        StackFactory stackFactory = new HostStackFactory();
        OS os = stackFactory.getOS();
        Program program = stackFactory.getProgram();

        os.Run();
        program.prog();
    }
}
