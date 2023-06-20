package ua.com.itvdn.javaessencial.lecture4.classwork.array_list.ex1_Create;

import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();          // Capacity = (array * 3) / 2.
        names.add("Oleksandr");
        names.add("Bob");
        names.add("Rob");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            if (i != names.size() - 1){
                System.out.print(names.get(i) + ", ");
            }else {
                System.out.print(names.get(names.size() - 1) + ".\nSize = " + names.size() + ".");
            }
        }
    }

}
