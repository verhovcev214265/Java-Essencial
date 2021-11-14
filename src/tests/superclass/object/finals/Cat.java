package tests.superclass.object.finals;

public class Cat {

    private String name;
    final int AGE = 3;

    Cat(String name){
        this.name = name;
    }


    public int getAge(){
        return AGE;
    }

    @Override
    public String toString(){
        return String.format("Name is: %s .\nAge is: %d .",name,AGE);
    }

//    public final int fin(){
//        return AGE = 10; //error
//    }

//    {
//        AGE = 12;
//    }
}
