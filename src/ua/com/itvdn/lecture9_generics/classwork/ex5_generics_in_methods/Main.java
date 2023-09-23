package ua.com.itvdn.lecture9_generics.classwork.ex5_generics_in_methods;

public class Main {
    public static void main(String[] args) {

        MyGenMethod myGenMethod = new MyGenMethod();

        myGenMethod.methodWithGen("Hello World!");
        Integer methodInt = myGenMethod.returnT(100);
        String methodStr = myGenMethod.returnT("Hello");
        Boolean methodBool = myGenMethod.returnT(true);
        String str = myGenMethod.returnT2("World!");

        System.out.println(methodInt + "\n" + methodStr + "\n" + methodBool + "\n" + str);

    }
}
