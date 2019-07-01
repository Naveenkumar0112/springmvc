package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeDao {
	
    public  int saveEmployee(Employee empid);
    
    public void updateEmployee(Employee empid);
    
    public void deletEmployee(int empid);
    
    public Employee getElementById(int empid);
    
    public List<Employee> Loadall();
    
}
