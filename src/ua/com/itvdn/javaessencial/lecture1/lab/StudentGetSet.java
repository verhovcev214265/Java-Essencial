package ua.com.itvdn.javaessencial.lecture1.lab;

public class StudentGetSet extends Student {

    public StudentGetSet(String firstName, String lastName, int yearBorn, int phoneNumber, int group) {
        super(firstName, lastName, yearBorn, phoneNumber, group);
    }

    public StudentGetSet() {
        Student.count++;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public int getYearBorn() {
        return super.getYearBorn();
    }

    @Override
    public void setYearBorn(int yearBorn) {
        super.setYearBorn(yearBorn);
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public int getGroup() {
        return super.getGroup();
    }

    @Override
    public void setGroup(int group) {
        super.setGroup(group);
    }
}