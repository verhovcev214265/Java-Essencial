package ua.com.itvdn.temporary.Employee;

import ua.com.itvdn.temporary.Employee.Employee;

public class President extends Employee {

    @Override
    public String print() {
        return String.join(Employee.SPACE, Employee.MESSAGE_PRESIDENT);
    }
}
