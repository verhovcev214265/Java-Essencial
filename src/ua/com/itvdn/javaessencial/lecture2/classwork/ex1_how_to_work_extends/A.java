package ua.com.itvdn.javaessencial.lecture2.classwork.ex1_how_to_work_extends;

public class A {

    private int fieldA;
    protected String fieldB;

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(int fieldA) {
        this.fieldA = fieldA;
    }

    public void setFieldB(String fieldB){
        this.fieldB = fieldB;
    }

    public String show(){
        return new String("Method from class A");
    }

}
