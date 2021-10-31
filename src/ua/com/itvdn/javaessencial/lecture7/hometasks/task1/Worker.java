package ua.com.itvdn.javaessencial.lecture7.hometasks.task1;

public class Worker {

    private String surname;
    private String name;
    private String position;
    private int workExperience;

    public Worker(String surname, String name, String position, int workExperience) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", position = '" + position + '\'' +
                ", workExperience = " + workExperience +
                '}';
    }

}