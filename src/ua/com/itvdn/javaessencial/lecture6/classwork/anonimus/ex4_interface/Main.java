package ua.com.itvdn.javaessencial.lecture6.classwork.anonimus.ex4_interface;

public class Main {
    public static void main(String[] args) {

        Interface instance = new Interface() {
            double weight = 4.8;
            String name = "Anonymous";
            int age = 32;

            @Override
            public String method() {
                age = 33;
                return
                        "name: " + name + "\n" +
                                "weight = " + weight + "\n" +
                                "age = " + age;
            }
        };

        String showInfo = instance.method();
        System.out.println(showInfo);
    }
}
