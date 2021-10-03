package Bank;

public class Client implements CreditBalance{

    private String name;
    private int dept;
    private int accountBalance ;
    private int overPayment ;

    public Client(String name, int dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void balance(int payment) {
        try{
            if (payment < 100){
                throw new ArithmeticException();
            }else if (payment <= 700){
                dept -= payment;
                accountBalance -= dept;
            }else {
                dept = 0;
                overPayment = payment - 700;
                accountBalance = overPayment;
                System.out.println("The loan has been repaid");
            }
        }catch (ArithmeticException e){
            System.out.println("The payment must be at least 100 UAH");
        }
    }
    @Override
    public boolean overPayment() {
       if (accountBalance > 0){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name = '" + name + '\'' +
                ", dept = " + dept +
                ", accountBalance = " + accountBalance +
                ", overPayment = " + overPayment +
                '}';
    }
}
