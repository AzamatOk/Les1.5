package Prototype;

public class Run {
    public static void main(String[] args) {
        Book grad = new Book("451 градус по фаренгейту",288, true);
        BookFactory bookFactory = new BookFactory(grad);
        Book gradClone = bookFactory.cloneBook();

        System.out.println(grad);
        System.out.println(gradClone);
    }
}
