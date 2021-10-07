package ua.com.itvdn.javaessencial.lecture1.lab.task1;

//Задание 1
//Реализуйте класс “Студент”. Необходимо хранить в полях класса: ФИО, дату рождения, контактный телефон, номер группы.
//Реализуйте методы класса для ввода данных, вывода данных, реализуйте аксессоры для доступа к отдельным полям,
//а также конструктор с параметрами.

public class Student {
    private String firstName;
    private String lastName;
    private int yearBorn;
    private long phoneNumber;
    private int group;
    static int count;

    public Student(String firstName, String lastName, int yearBorn, long phoneNumber, int group, int count) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.phoneNumber = phoneNumber;
        this.group = group;
        count++;
    }

    public Student(String firstName, String lastName, int yearBorn, int count){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        count++;
    }

    public Student (){
        Student.count++;
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", yearBorn = " + yearBorn +
                ", phoneNumber = " + phoneNumber +
                ", group = " + group +
                ", count = " + count +'}';
    }
}
