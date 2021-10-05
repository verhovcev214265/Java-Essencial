package ua.com.itvdn.javaessencial.lecture0.hometask.task3;

public class Main {
    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++){
            computers[i] = new Computer();
            System.out.println(computers[i] + " ");
        }
    }
}
