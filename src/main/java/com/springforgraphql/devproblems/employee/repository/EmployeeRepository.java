package com.springforgraphql.devproblems.employee.repository;

import com.springforgraphql.devproblems.employee.models.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {
    Flux<Employee> getEmployeeByName(String name);

    Flux<Employee> getAllEmployeeByDepartmentId(Integer departmentId);
}
