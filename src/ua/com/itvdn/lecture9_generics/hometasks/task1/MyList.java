package ua.com.itvdn.lecture9_generics.hometasks.task1;
import java.util.ArrayList;
import java.util.List;

//Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
//экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
//экземпляром, должен включать метод добавления элемента, индексатор для получения значения
//элемента по указанному индексу и свойство только для чтения для получения общего количества
//элементов.

public class MyList<T> {

    List<T> list = new ArrayList<>();

    public List<T> getList(){
        return list;
    }

    public void addElement(T element){
         list.add(element);
    }

    public int listIndex(T element){
        return list.indexOf(element);
    }

    public int listLength(){
        return list.size();
    }

}
