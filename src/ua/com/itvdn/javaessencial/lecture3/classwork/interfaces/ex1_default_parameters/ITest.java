package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex1_default_parameters;

// interface final ITest
public interface ITest {

    public static final int PRICE = 2000;   // default parameters

//    public abstract int price;

    public abstract void move();   // before Java 1.8

    static int add(int valueA, int valueB){
        return valueA + valueB;
    }

    // after Java 8 we can do realisation
    default int mul(int valueA, int valueB){
        return valueA * valueB;
    }
}
