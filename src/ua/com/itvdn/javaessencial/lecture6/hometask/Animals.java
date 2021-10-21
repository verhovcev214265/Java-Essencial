package ua.com.itvdn.javaessencial.lecture6.hometask;

//Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
//целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
//должен возвращать название экземпляра и возраст животного.

public enum Animals {

    CAT(2), DOG(3), CAMEL(45);
    private int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                " species is " + name() +
                ", age = " + age +
                '}';
    }
}
