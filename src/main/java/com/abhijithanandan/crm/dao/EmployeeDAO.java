package com.abhijithanandan.crm.dao;

import com.abhijithanandan.crm.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
