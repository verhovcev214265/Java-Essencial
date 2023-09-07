package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex7_hashcode_rules;

public class Main {
    public static void main(String[] args) {

        /*
        1) Виклик методу hashCode один або декілька разів на одним і тим самим об'єктом має повертати
        одне і те саме hash значення, за умови якщо поля об'єкта, які приймають участь у вирахуванні
        значення не були змінені.
         */
        Bus busA = new Bus();

        System.out.println(busA.hashCode() + "\n" +
                busA.hashCode() + "\n" +
                "------------------------------------------------"
        );

        /*
        2) Виклик методу hashCode над двома об'єктами має завжди повертати одне і те саме число,
        якщо ці об'єкти є рівними (виклик метода equals для цих об'єктів повертає true).
         */
        Bus busB = new Bus("Mercedes");
        Bus busC = new Bus("Mercedes");

        System.out.println(
                busB.equals(busC) + "\n" +
                        (busB.hashCode() == busC.hashCode()) + "\n" +
                        "----------------------------------------"
        );

        /*
         3) Виклик методу hashCode над двома нерівними між собою об'єктами має завжди повертати різне hash-значення.
         Може виникнути ситуація коли у двох різних об'єктів будуть однакові hashCodes тоді це називається колізія.
         */
        Bus busD = new Bus("Ford");
        Bus busE = new Bus("Volvo");

        System.out.println(
                busD.hashCode() + "\n" +
                        busE.hashCode() + "\n" +
                        "---------------------------------------"
        );

        // Якщо результат виконання обох методів повертає true, тоді ці об'єкти є рівними.
        System.out.println(
                busB.equals(busC) + "\n" +
                        (busB.hashCode() == busC.hashCode())
        );
    }
}
