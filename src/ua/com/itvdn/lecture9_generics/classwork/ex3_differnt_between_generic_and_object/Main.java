package ua.com.itvdn.lecture9_generics.classwork.ex3_differnt_between_generic_and_object;

public class Main {
    public static void main(String[] args) {

        WithGeneric<String> withGenA = new WithGeneric<>("Hello!");
        WithGeneric<Integer> withGenB = new WithGeneric<>(1234);
//        withGenA = withGenB;

        WithOutGeneric withOutGenA = new WithOutGeneric("Hello!");
        WithOutGeneric withOutGenB = new WithOutGeneric(1234);
        withOutGenA = withOutGenB;
        System.out.println(withOutGenA);

        String str = (String) withOutGenA.getElement();
        System.out.println(str);  // classCastException

    }
}
