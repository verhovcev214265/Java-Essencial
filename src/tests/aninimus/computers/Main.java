package tests.aninimus.computers;

public class Main {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        Phone p2 = new Phone();

        Computer c1 = new Computer();
        Computer c2 = new Computer();

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        Computer[] computers = { c1, c2, m1 };
        Phone[] phones ={ p1, p2, m2.creatPhone() };

        for(Computer temp: computers){
            temp.process();
        }

        System.out.println("----------------------------------------------------------------------------------------");

        for(Phone temp: phones){
            temp.process();
        }
    }
}
