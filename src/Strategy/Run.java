package Strategy;

public class Run {
    public static void main(String[] args) {
        Student studen = new Student();

        studen.setActivity(new Sleeping());
        studen.executeActivity();

        studen.setActivity(new Lessening());
        studen.executeActivity();

        studen.setActivity(new Reading());
        studen.executeActivity();

        studen.setActivity(new Sleeping());
        studen.executeActivity();
    }
}
