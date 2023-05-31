package tests.universaltemplates.example4;

class Bace {
    private String name;

    public Bace(String name){
        this.name = name;
    }
}

class Devired extends Bace{
    private String name;

    public Devired(String name, String name1) {
        super(name);
        this.name = name1;
    }
}

class MyClass<T extends Bace>{

}

class Main{
    public static void main(String[] args) {
        MyClass<Bace> mcB = new MyClass<>();
        MyClass<Devired> mcD = new MyClass<>();
//        MyClass<Integer> mcInt = new MyClass<Integer>();   error
    }
}
