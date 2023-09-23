package ua.com.itvdn.lecture9_generics.classwork.ex7_rules;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<A> list = new ArrayList<>();

    static void sumValueConcrete(List<B> list){
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getValue();
        }
    }

    A a = list.get(0);

    // Чи можемо ми отримати елемент списку 'list' в клас В та С?
//  B b = list.get(0);
//  C c = list.get(0);

    static void sumValueExtendsB(List<? extends B> list){
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getValue();
        }
    }

    static void sumValueExtendsA(List<? extends A> list){
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getValue();
        }
    }

    static void addNewElement1(List<B> bList){
        for (int i = 0; i < bList.size(); i++) {
            bList.add(new B());
        }
    }

    static void addNewElement2(List<? super B > bList){
        for (int i = 0; i < bList.size(); i++) {
            bList.add(new B());
        }
// Чи можемо додати новий об'єкт іншого типу?
//        bList.add(new C());
//        bList.add(new B());
//        bList.add(new A());

        Object obj = bList.get(0);
        A a = (A) obj;
        B b = (B) obj;
        C c = (C) obj;

        String str = (String) obj;
    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        a = b;
        a = c;
        b = c;

//      b = a;
//      c = b
//      B b2 = new C();
//      c = b2;

        List<A> listA = new ArrayList<>();
        a = listA.get(0);
//      b = listA.get(0);
//      c = listA.get(0);

        List<B> listB = new ArrayList<>();
        a = listB.get(0);
        b = listB.get(0);
//      c = listB.get(0);

        List<C> listC1 = new ArrayList<>();
        a = listC1.get(0);
        b = listC1.get(0);
        c = listC1.get(0);

        List<C> listC2 = new ArrayList<>();

        /*
        Інваріантність: ситуація, коли успадкування вихідних типів не переноситься на виробничі.
        Тобто передати значення в List<> ми можемо лише того типу, який там вже проаисаний.
         */

        listC1 = listC2;
        //      listB = listC
        sumValueConcrete(listB);
//      sumValueConcrete(listA);
//      sumValueConcrete(listC1);

        /*
        Коваріантність - перенесення успадкування вихідних типів на виробничі від них типи в прямому порядку.
        За допомоги постановочного знаку: ? - (wildcard).
        (? extends A)
         */
        sumValueExtendsB(listB);
        sumValueExtendsB(listC1);
//      sumValueExtendsB(listA);

        sumValueExtendsA(listA);
        sumValueExtendsA(listB);
        sumValueExtendsA(listC1);

        // Контрваріантність - переніс успадкування вихідних типів на виробничі від них типи в зворотньому порядку

        addNewElement1(listB);
//      addNewElement1(listC1);
//      addNewElement1(listA);

        addNewElement2(listB);
//      addNewElement2(listC1);
//      addNewElement2(listA);




    }
}
