package ua.com.itvdn.javaessencial.students.maks.lecture0.task2;

/*
Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
(используя loop)
 */

public class Computer {
    public static void main(String[] args) {
        String Computers[] = new String[5];
        Computer asus = new Computer();
        Computer lenovo = new Computer();
        Computer acer = new Computer();
        Computer apple = new Computer();
        Computer dell = new Computer();

        Computers[0] = asus.toString();
        Computers[1] = lenovo.toString();
        Computers[2] = acer.toString();
        Computers[3] = apple.toString();
        Computers[4] = dell.toString();
        /*
         В мене не вийшло записати в компютер за допомогою loop. І в загалі я
         невпевнений в правильності написання коду, як і в більшості завдань :\
         */

        /*
        - Так дивись тобі треба стоворити клас Computer, потім окремо створити клас Main в якому буде метод main
        - Потім тобі треба в main створити масив об'єктів Computer на 5-ать елементів за допомоги 'new'
        - Після запускаєш цикл, в умові якого буде сказано (поки i менше довжини масиву, створбй новий об'єкт та
        запиши його в масив сomputers)
         */
    }
}
