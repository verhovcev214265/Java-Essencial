package tests.universaltemplates.example7.universalmethod;

public class MyClass {

    public <T> void method(T argument){
        T variable = argument;
        System.out.println(variable);
    }
}

class Main{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.method("Hello");
        myClass.method('H' + 'e' + 'l' + 'l' + 'o');
        myClass.method(1234567890123456789L);
        myClass.method(1234);
        myClass.method(123456.785d);
        myClass.method(123.4f);
        myClass.method(false);

    }
}
