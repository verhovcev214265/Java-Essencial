package tests.universaltemplates.example3;

public class MyClass {

    public <T> void method(T argument){
        T variable = argument;
        System.out.println(variable);
    }
}

class Main{
    public static void main(String[] args) {

        MyClass instance = new MyClass();
        instance.method("Hello I`m a open type method");

        MyClass instance2 = new MyClass();
        instance2.method(1234);
    }
}
