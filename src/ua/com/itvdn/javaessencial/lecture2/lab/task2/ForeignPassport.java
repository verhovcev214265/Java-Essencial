package ua.com.itvdn.javaessencial.lecture2.lab.task2;

public class ForeignPassport extends Passport{

   private String visa;
   private int passportNumber;

    public ForeignPassport(String firstName, String lastName, int age, String visa, int passportNumber) {
        super(firstName, lastName, age);
        this.visa = visa;
        this.passportNumber = passportNumber;
    }

    public String getVisa() {
        return visa;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

        @Override
    public String toString() {
        return "ForeignPassport{" +
                "visa = '" + visa + '\'' +
                ", passportNumber = " + passportNumber +
                '}';
    }
}
