package ua.com.itvdn.javaessencial.lecture6.classwork.enums.ex4_with_methods;

public class Main {
    public static void main(String[] args) {

        Company ymca = Company.YMCA;
        Company meta = Company.META;
        Company spaceX = Company.SPACE_X;

        int salaryYmca = ymca.getSalary();
        int salaryMeta = meta.getSalary();
        int salarySpaceX = spaceX.getSalary();

        String currencyYmca = ymca.getCurrency();
        String currencyMeta = meta.getCurrency();
        String currencySpaceX = spaceX.getCurrency();

        System.out.println(
                ymca + "\n" +
                        "I earned " + salaryYmca + " " + currencyYmca + " per month" +
                        "\n------------------------------------------------------\n" +
                        meta + "\n" +
                        "I earned " + salaryMeta + " " + currencyMeta + " per month" +
                        "\n------------------------------------------------------\n" +
                        spaceX + "\n" +
                        "I earned " + salarySpaceX + " " + currencySpaceX + " per month" +
                        "\n------------------------------------------------------\n"
        );
    }
}
