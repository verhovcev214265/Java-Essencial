package ua.com.itvdn.lecture9_generics.lab.task1;

// Створити "Generic class" в тілі класу має бути метод show(), який буде виводити в крнсрль тип,
// який буде передано у цей клас MyClass<Integer> myClassInt = new MyClass<>();
// вивід має бути class java.lang.Integer;

public class Main {
    public static void main(String[] args) {

        MyClass<String> myClassStr = new MyClass<>("Mark");
        myClassStr.show();
        System.out.println("=====================================================");

        MyClass<Integer> myClassInt = new MyClass<>(31);
        myClassInt.show();
        System.out.println("=====================================================");

        MyClass<Boolean> myClassBool = new MyClass<>(true);
        myClassBool.show();
        System.out.println("=====================================================");
    }
}
