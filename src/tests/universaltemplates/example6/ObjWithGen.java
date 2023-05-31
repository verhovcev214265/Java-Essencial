package tests.universaltemplates.example6;

public class ObjWithGen {

    private Object fieldObj;

    ObjWithGen(Object fieldObj){
        this.fieldObj = fieldObj;
    }

    public Object getFieldObj(){
        return fieldObj;
    }

    @Override
    public String toString(){
        return "Class ObjWithGen: \n" +
                "fieldObj = " + fieldObj + ".";
    }
}
