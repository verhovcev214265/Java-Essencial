package bank;

public class Client implements CreditOptions{
    private String name;
    private int dept;
    private int overPayment;

    public Client(String name, int dept, int overPayment) {
        this.name = name;
        this.dept = dept;
        this.overPayment = overPayment;
    }

    @Override
    public void deptSum(int payment) {
        try {
            if (payment < 100){
                throw new ArithmeticException();
            }else if (payment <= 700 && payment <= dept){
                dept -= payment;
            }else if (payment > dept){
                dept = 0;
                overPayment = 700 - payment;
                System.out.println(GREEN_TEXT + "Dear customer your dept is paid!");
            }
        }catch (ArithmeticException e){
            System.out.println(RED_TEXT + "The payment must be 100-UAH or more");
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name = '" + name + '\'' +
                ", dept = " + dept +
                ", overPayment = " + overPayment +
                '}';
    }

    public static final String GREEN_TEXT = "\u001B[32m";
    public static final String RED_TEXT = "\u001B[31m";
}
