package ua.com.itvdn.javaessencial.lecture2.hometask.task2;

public class ExcellentPupil extends Pupil{

    public ExcellentPupil(String name) {
        super(name);
    }

    @Override
    void study(int rating) {
        System.out.println("Study is excellent");
    }

    @Override
    void read(int rating) {
        System.out.println("Read is excellent");
    }

    @Override
    void write(int rating) {
        System.out.println("Write is excellent");
    }

    @Override
    void relax(int rating) {
        System.out.println("Relax is excellent");
    }
}
