package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex1_inner;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        // 1 - variant to create InnerClass
        OuterClass outerClassA = new OuterClass();
        OuterClass.InnerClass innerClassA = outerClassA.new InnerClass();
        innerClassA.show();
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // 2 - variant to create InnerClass
        OuterClass.InnerClass innerClassB = new OuterClass().new InnerClass();
        innerClassB.show();
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        OuterClass outerClassB = new OuterClass();
        outerClassB.createInner();

    }
}
