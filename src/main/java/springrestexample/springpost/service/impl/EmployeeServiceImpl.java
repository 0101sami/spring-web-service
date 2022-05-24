package springrestexample.springpost.service.impl;

import org.springframework.stereotype.Service;
import springrestexample.springpost.repository.EmployeeRepository;
import springrestexample.springpost.service.EmployeeService;
import java.util.List;
import java.util.Optional;

import springrestexample.springpost.entity.EmployeeEntity;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;

    }
    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.saveAndFlush(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity, Long id) {
        return employeeRepository.saveAndFlush(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
