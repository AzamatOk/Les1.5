package Singlton;

public class Class5B {
    private static Class5B fiveBClsdd;
    public static String schullClass = "Это 5б класс \n\n";
    public static Class5B getClazz(){
        if(fiveBClsdd == null){
            fiveBClsdd = new Class5B();
        }
        return fiveBClsdd;
    }
    private Class5B(){

    }

    public void addSchuller(String child){
        schullClass += child + "\n";
    }

    public void showlist(){
        System.out.println(schullClass);
    }
}
