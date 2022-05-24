package springrestexample.springpost.service;
import springrestexample.springpost.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id) ;


    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity, Long id) ;
    void deleteEmployee(Long id);
}
