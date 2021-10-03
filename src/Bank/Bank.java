package Bank;
//Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
//кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
//выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
//и 400 грн. Закрыть весь долг.
//Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
//банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
//переплаты, сообщение об отсутствии долга).        //
public class Bank {
    public static void main(String[] args) {

        Client oleksandr = new Client("Oleksandr", 700);

        oleksandr.balance(100);
        System.out.println("Overpayment is " + oleksandr.overPayment());
        System.out.println(oleksandr);

        oleksandr.balance(100);
        System.out.println("Overpayment is " + oleksandr.overPayment());
        System.out.println(oleksandr);

    }
}
