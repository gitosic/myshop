package com.experimental.shop.dao;


import com.experimental.shop.entity.Employee;
import org.hibernate.SessionFactory;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}