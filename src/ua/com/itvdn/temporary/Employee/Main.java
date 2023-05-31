package ua.com.itvdn.temporary.Employee;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new President();
        employees[1] = new Manager();
        employees[2] = new Worker();

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].print());
        }
    }
}
