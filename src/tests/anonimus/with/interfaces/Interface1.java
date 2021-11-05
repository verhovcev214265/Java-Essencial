package tests.anonimus.with.interfaces;

interface Interface1 {
    void method();
}

class Main{
    public static void main(String[] args) {

        Interface1 interface1 = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method from anonymous class ");
            }
        };

        interface1.method();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(interface1.getClass().toString());
    }
}
