package pro.sky.EmployeeBook;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam(value = "firstName") String firstName,
                        @RequestParam(value = "lastName") String lastName) {
        employeeService.addEmployee(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam(value = "firstName") String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        employeeService.removeEmployee(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam(value = "firstName") String firstName,
                         @RequestParam(value = "lastName") String lastName) {
        employeeService.findEmployee(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @GetMapping("/getList")
    public List<Employee> getList() {
        return employeeService.getEmployeeList();
    }
}
