package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex2._animal;

public interface ICreator {

    void live();

    default String speak(){
        return "Interface can speak";
    }
}
