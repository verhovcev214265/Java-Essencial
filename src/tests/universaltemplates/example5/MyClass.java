package tests.universaltemplates.example5;
public class  MyClass <T> {

    protected T field;

    public void method(){
        System.out.println(field.getClass());
    }

}
class Main{
    public static void main(String[] args) {

        MyClass<String> myClassStr = new MyClass<>();
        myClassStr.field = "Oleksandr";
        myClassStr.method();

        MyClass<Long> myClassLon = new MyClass<>();
        myClassLon.field = 2299519476L;
        myClassLon.method();
    }
}
