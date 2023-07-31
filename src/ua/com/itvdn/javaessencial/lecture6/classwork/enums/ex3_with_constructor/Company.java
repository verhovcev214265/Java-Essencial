package ua.com.itvdn.javaessencial.lecture6.classwork.enums.ex3_with_constructor;

public enum Company {

    YMCA(10_000), META(5_000), SPACE_X(4_500);

    private final int salary;

    Company(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }


}
