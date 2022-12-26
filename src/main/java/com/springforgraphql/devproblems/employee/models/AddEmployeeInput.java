package com.springforgraphql.devproblems.employee.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEmployeeInput {
    private String name, salary;
    private Integer departmentId;
}
