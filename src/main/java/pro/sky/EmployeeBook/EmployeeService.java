package pro.sky.EmployeeBook;

import java.util.List;

public interface EmployeeService {
    void addEmployee(String firstName, String lastName);

    void removeEmployee(String firstName, String lastName);

    void findEmployee(String firstName, String lastName);

    List<Employee> getEmployeeList();
}
