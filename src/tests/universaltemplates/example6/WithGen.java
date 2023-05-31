package tests.universaltemplates.example6;

public class WithGen<T> {

    private T field;

    WithGen(T field){
        this.field = field;
    }

    public T getField(){
        return field;
    }

    @Override
    public String toString(){
        return "Class WithGen:\n" +
                "field = " + field + ".";
    }
}
