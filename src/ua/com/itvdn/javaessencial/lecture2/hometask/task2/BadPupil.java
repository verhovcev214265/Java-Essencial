package ua.com.itvdn.javaessencial.lecture2.hometask.task2;

public class BadPupil extends Pupil{

    public BadPupil(String name) {
        super(name);
    }

    @Override
    void study(int rating) {
        System.out.println("Study is bad");
    }

    @Override
    void read(int rating) {
        System.out.println("Read is bad");
    }

    @Override
    void write(int rating) {
        System.out.println("Write is bad");
    }

    @Override
    void relax(int rating) {
        System.out.println("Relax is bad");
    }
}
