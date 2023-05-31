package tests.universaltemplates.example6;

public class Main {
    public static void main(String[] args) {

        WithGen<String> withGenStr = new WithGen<>("String");
        WithGen<Integer> withGenInt = new WithGen<>(10);

        ObjWithGen objWithGenStr = new ObjWithGen("String");
        ObjWithGen objWithGenInt = new ObjWithGen(10);

        //       withGenStr = withGenInt;

        objWithGenStr = objWithGenInt;
        System.out.println(objWithGenStr);

        // ClassCastException
        String str = (String)objWithGenStr.getFieldObj();
        System.out.println(str);

    }
}
