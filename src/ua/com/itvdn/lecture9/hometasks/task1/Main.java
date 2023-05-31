package ua.com.itvdn.lecture9.hometasks.task1;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myListInt = new MyList<>();
        myListInt.addElement(12345);
        myListInt.addElement(678910);

        MyList<String> myListStr = new MyList<>();
        myListStr.addElement("Hello");
        myListStr.addElement("my");
        myListStr.addElement("beautiful");
        myListStr.addElement("World!");

        System.out.println("IntegerList: " + myListInt.getList());
        System.out.println("StringList: " + myListStr.getList());
        System.out.println("==================================================================================");

        System.out.println("Element (678910) has " + myListInt.listIndex(678910) + "th index in IntegerList;");
        System.out.println("Element (Hello) has " + myListStr.listIndex("Hello") + "th index in StringList");
        System.out.println("==================================================================================");

        System.out.println("IntegerList has " + myListInt.listLength() + " elements");
        System.out.println("StringList has " + myListStr.listLength() + " elements");
        System.out.println("==================================================================================");
    }
}
