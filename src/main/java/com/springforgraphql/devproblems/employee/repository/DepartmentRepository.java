package com.springforgraphql.devproblems.employee.repository;

import com.springforgraphql.devproblems.employee.models.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DepartmentRepository extends ReactiveCrudRepository<Department, Integer> {
}
