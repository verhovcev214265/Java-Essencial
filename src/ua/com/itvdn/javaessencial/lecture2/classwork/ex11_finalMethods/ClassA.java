package ua.com.itvdn.javaessencial.lecture2.classwork.ex11_finalMethods;

class ClassA {

    // final методи не можна перевизначати

    public final void methodA() {
        System.out.println("Method_A");
    }

    public void methodB() {
        System.out.println("Method_B from classA");
    }
}

class ClassB extends ClassA {

//    public final void methodA() {
//        System.out.println("Method_A");
//    }

    @Override
    public final void methodB() {
        System.out.println("Method_B from classB");
    }
}

class ClassC extends ClassB {

//    @Override
//    public final void methodA() {
//        System.out.println("Method_A");
//    }
//
//    @Override
//    public void methodB() {
//        System.out.println("Method_B from classA");
//    }

}


