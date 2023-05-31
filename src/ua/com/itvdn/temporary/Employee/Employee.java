package ua.com.itvdn.temporary.Employee;

//Задание 1
// Создать абстрактный базовый класс Employer (служащий) с абстрактным методом Print(). Создайте три производных
//класса: President, Manager, Worker. Переопределите функцию Print() для вывода информации, соответствующей каждому типу
//служащего

public abstract class Employee {
    protected static final String SPACE = " ";
    protected static final String MESSAGE_PRESIDENT = "I`m a president! ";
    protected static final String MESSAGE_MANAGER = "I`m a manager! ";
    protected static final String MESSAGE_WORKER = "I`m a worker! ";

    public abstract String print();
}
