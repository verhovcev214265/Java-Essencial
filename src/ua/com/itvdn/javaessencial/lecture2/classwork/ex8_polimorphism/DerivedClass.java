package ua.com.itvdn.javaessencial.lecture2.classwork.ex8_polimorphism;

public class DerivedClass extends BaseClass{

    public String methodFromBase(){
        return "Interface'm method from BaseClass, but Interface can change my realisation in another classes";
    }

/*
    Модифікатор доступу перевизначеного метода може бути з таким самими модифікатором, або може бути розширений.
    Звужування доступ заборонено.
 */

//    private String methodFromBase(){
//        return "Interface'm method from BaseClass, but Interface can change my realisation in another classes";
//    }
}
