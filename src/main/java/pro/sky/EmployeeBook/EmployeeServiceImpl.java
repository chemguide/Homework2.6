package pro.sky.EmployeeBook;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private int employeeNumber = 10;
    List<Employee> employeesList = new ArrayList<>();

    public void addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (findEmployeePosition(employee) >= 0) {
            throw new EmployeeAlreadyAddedException();
        }
        if (employeesList.size() < employeeNumber) {
            employeesList.add(employee);
        } else {
            throw new EmployeeStorageIsFullException();
        }
    }

    public void removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        int position = findEmployeePosition(employee);
        if (position >= 0) {
            employeesList.remove(position);
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    public void findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (findEmployeePosition(employee) < 0) {
            throw new EmployeeNotFoundException();
        }
    }

    private int findEmployeePosition(Employee employee) {
        int employeePosition = -1;
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).equals(employee)) {
                employeePosition = i;
            }
        }
        return employeePosition;
    }

    public List<Employee> getEmployeeList() {
        return employeesList;
    }
}
