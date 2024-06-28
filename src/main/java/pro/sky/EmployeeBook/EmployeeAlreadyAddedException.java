package pro.sky.EmployeeBook;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException() {
        super("Сотрудник уже есть в коллекции");
    }
}
