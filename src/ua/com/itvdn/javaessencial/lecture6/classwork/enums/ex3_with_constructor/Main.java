package ua.com.itvdn.javaessencial.lecture6.classwork.enums.ex3_with_constructor;

public class Main {
    public static void main(String[] args) {

        Company company = Company.YMCA;

        System.out.println(
                "I work at " + company + " company and have my salary = " + company.getSalary() + "$ per month."
        );
    }
}
