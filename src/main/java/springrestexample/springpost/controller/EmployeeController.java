package springrestexample.springpost.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springrestexample.springpost.entity.EmployeeEntity;
import springrestexample.springpost.service.EmployeeService;
import java.util.List;
import java.util.Optional;

@RestController



public class EmployeeController {
    // inject employee dao
    @Autowired
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService= employeeService;

    }
    // expose "/employees" and return list of employees


    @GetMapping("/employees")
    public List<EmployeeEntity> findAllEmployee() {

        return employeeService.findAllEmployee();
    }

    @GetMapping("/employees/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable Long id) {


        return employeeService.findById(id);
    }


    @PutMapping("/employees/{id}")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee, @PathVariable String id) {

        return employeeService.saveEmployee(employee);


    }

    @PostMapping("/employees")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee) {

        return employeeService.saveEmployee(employee);


    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {

        employeeService.deleteEmployee(id);



    }
}
