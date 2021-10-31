package bank;

public class Bank {
// Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
//кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
//выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
//и 400 грн. Закрыть весь долг.
//Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
//банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
//переплаты, сообщение об отсутствии долга).

        public static void main(String[] args) {

            Client oleksandr = new Client("Oleksandr", 700, 0);
            System.out.println(oleksandr);

            oleksandr.deptSum(400);
            System.out.println(oleksandr);

            oleksandr.deptSum(400);
            System.out.println(oleksandr);

            oleksandr.deptSum(-100);
            System.out.println(oleksandr);
        }
}

