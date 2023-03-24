package AbstractFactory.Schoolboy;

import AbstractFactory.OS;

public class Windows implements OS {
    @Override
    public void Run() {
        System.out.println("Windows запущен");
    }
}
