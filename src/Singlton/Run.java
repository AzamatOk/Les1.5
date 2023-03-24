package Singlton;

public class Run {
    public static void main(String[] args) {
        Class5B.getClazz().addSchuller("Алан");
        Class5B.getClazz().addSchuller("Тамик");
        Class5B.getClazz().addSchuller("Сос");

        Class5B.getClazz().showlist();
    }
}
