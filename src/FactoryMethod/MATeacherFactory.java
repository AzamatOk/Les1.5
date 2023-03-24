package FactoryMethod;

public class MATeacherFactory implements PrepodFactory {
    @Override
    public Prepod createPrepod(){

        return new MATeacher();
    }
}
