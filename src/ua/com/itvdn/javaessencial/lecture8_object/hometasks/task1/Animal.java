package ua.com.itvdn.javaessencial.lecture8_object.hometasks.task1;
import java.util.Objects;
//Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод
//toString, что бы вывод был сдедующим
//«Имя: Васька, возраст: 45, хвост: нет».
//В классе Animal переопределить методы equals & hashCode.
public class Animal {

    private String name;
    private int age;
    private boolean tail;

    Animal(String name, int age, boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }



    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if (name != animal.name && age != animal.age && tail != animal.tail){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age,tail);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", tail = " + tail +
                '}';
    }
}
