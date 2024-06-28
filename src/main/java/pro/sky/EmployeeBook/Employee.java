package pro.sky.EmployeeBook;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Введите корректное имя сотрудника!");
        }
        //idNumber = employeeCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this == null || this.getClass() != o.getClass()) {
            return false;
        }
        Employee testEmployee = (Employee) o;
        return ((firstName.equals(testEmployee.getFirstName())) && (lastName.equals(testEmployee.getLastName())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
