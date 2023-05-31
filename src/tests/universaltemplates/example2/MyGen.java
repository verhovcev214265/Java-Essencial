package tests.universaltemplates.example2;

public class MyGen <T1, T2> {

    protected T1 variable1;
    protected T2 variable2;

    MyGen(T1 argument1, T2 argument2){
        this.variable1 = argument1;
        this.variable2 = argument2;
    }
}

class Main{
    public static void main(String[] args) {

        MyGen<Integer, Integer> instance1 = new MyGen<>(1,2);
        MyGen<String, Integer> instance2 = new MyGen<>("number", 777);

        System.out.println(instance1.variable1 + instance1.variable2);
        System.out.println(instance2.variable1 + instance2.variable2);
    }
}
