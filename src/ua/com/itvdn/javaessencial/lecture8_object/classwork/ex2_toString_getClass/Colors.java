package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex2_toString_getClass;

public enum Colors {

    BLACK("black"), RED("Red");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
