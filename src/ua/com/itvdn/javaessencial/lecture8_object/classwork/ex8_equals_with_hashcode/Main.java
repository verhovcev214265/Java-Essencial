package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex8_equals_with_hashcode;

public class Main {
    public static void main(String[] args) {

        /*
        1) Виклик методу hashCode один або декілька разів на одним і тим самим об'єктом має повертати
        одне і те саме hash значення, за умови якщо поля об'єкта, які приймають участь у вирахуванні
        значення не були змінені.
         */
        Bus busA = new Bus("bmw");

        /*
        2) Виклик методу hashCode над двома об'єктами має завжди повертати одне і те саме число,
        якщо ці об'єкти є рівними (виклик метода equals для цих об'єктів повертає true).
         */
        Bus busB = new Bus("Volvo");
        Bus busC = new Bus("Volvo");

        /*
         3) Виклик методу hashCode над двома нерівними між собою об'єктами має завжди повертати різне hash-значення.
         Може виникнути ситуація коли у двох різних об'єктів будуть однакові hashCodes тоді це називається колізія.
         */
        Bus busD = new Bus("Bogdan");
        Bus busE = new Bus("Mercedes");

        System.out.println(
                // Якщо результат виконання обох методів повертає true, тоді ці об'єкти є рівними.
                busA.hashCode() + "\n" +
                        busA.hashCode() +
                        "\n--------------------------------------------\n" +
                        busB.equals(busC) + "\n" +
                        (busB.hashCode() == busC.hashCode()) +
                        "\n--------------------------------------------\n" +
                        busD.hashCode() + "\n" +
                        busE.hashCode()
        );
    }

}
