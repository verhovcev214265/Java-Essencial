package ua.com.itvdn.javaessencial.lecture2.hometask.task2;

public class GoodPupil extends Pupil {

    public GoodPupil(String name) {
        super(name);
    }

    @Override
    void study(int rating) {
        System.out.println("Study is good");
    }

    @Override
    void read(int rating) {
        System.out.println("Read is good");
    }

    @Override
    void write(int rating) {
        System.out.println("Write is good");
    }

    @Override
    void relax(int rating) {
        System.out.println("Relax is good");
    }
}
