package FactoryMethod;

public class Run {
    public static void main(String[] args) {
    PrepodFactory prepodFactory = createSpecPrep("MA");
    Prepod prepod = prepodFactory.createPrepod();

    prepod.prepodParody();
    }
    static PrepodFactory createSpecPrep(String spec){
        switch (spec){
            case "MA":
                return new MATeacherFactory();

            case "Alg":
                return new AlgTeacherFactory();
            default:
                throw new RuntimeException();
        }
            

    }
}