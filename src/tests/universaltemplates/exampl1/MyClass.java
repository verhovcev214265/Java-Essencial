package tests.universaltemplates.exampl1;

public class MyClass <T>{

    protected T field;

    public void show(){
        System.out.println(field.getClass());
    }
}

class Main{
    public static void main(String[] args) {

        MyClass<String> myClassStr = new MyClass<>();
        myClassStr.field = "ABCD";
        myClassStr.show();

        MyClass<Integer> myClassInt = new MyClass<>();
        myClassInt.field = 1234;
        myClassInt.show();


    }
}
