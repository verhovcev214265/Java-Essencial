package ua.com.itvdn.javaessencial.lecture3.lab;

public class Main {
    public static void main(String[] args) {

        Employer[] employers = new Employer[3];
        employers[0] = new President();
        employers[1] = new Manager();
        employers[2] = new Worker();

        for (int i = 0; i < employers.length; i++) {
            employers[i].print();
        }
    }
}
