package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex2_local;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        OuterClass outerClassA = new OuterClass();
        outerClassA.createInner();
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

    }
}
