package FactoryMethod;

public class AlgTeacherFactory implements PrepodFactory {
    @Override
    public Prepod createPrepod(){
        return new AlgTeacher();
    }
}
