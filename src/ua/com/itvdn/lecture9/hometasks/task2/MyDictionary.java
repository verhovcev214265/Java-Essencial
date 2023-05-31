package ua.com.itvdn.lecture9.hometasks.task2;
import java.util.HashMap;
import java.util.Map;

//Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
//использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
//должен включать метод добавления пар элементов, индексатор для получения значения элемента по
//указанному индексу и свойство только для чтения для получения общего количества пар элементов

public class MyDictionary <TKey, TValue>{

    Map <TKey, TValue> dictionary = new HashMap<TKey, TValue>();

    public Map <TKey, TValue> getDictionary(){
        return dictionary;
    }

    public void addKV(TKey key, TValue value){
        dictionary.put(key, value);
    }

    public TValue keyIndex(TKey key){
        return dictionary.get(key);
    }

    public int lengthDictionary(){
        return dictionary.size();
    }

}
