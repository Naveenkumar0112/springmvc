package com.app.service;

import java.util.List;  

import com.app.model.Employee;

public interface IEmployeeService {
	
	public  int saveEmployee(Employee empid);
	
	public void updateEmployee(Employee empid);

	public void deletEmployee(int empid);

	public Employee getElementById(int empid);

	public List<Employee> Loadall();

}
