package ua.com.itvdn.javaessencial.students.maks.lecture0.task2;

public class MainComputer {
    public static void main(String[] args) {
        String firstWord = "DELL";
        String secondWord = "ASUS";
        String thirdWord = "Acer";
        String fourthWord = "LENOVO";
        String fifthWord = "Apple";

        Computer example = new Computer();
        example.setComputers(firstWord, secondWord, thirdWord, fourthWord, fifthWord);
        example.show();
    }
}
