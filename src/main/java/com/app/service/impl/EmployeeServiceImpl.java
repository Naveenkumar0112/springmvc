package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeDao dao;

	@Override
	@Transactional
	public int saveEmployee(Employee empid) {
		return dao.saveEmployee(empid);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee empid) {
		dao.updateEmployee(empid);		
	}

	@Override
	@Transactional
	public void deletEmployee(int empid) {
		dao.deletEmployee(empid);
	}

	@Override
	@Transactional(readOnly=true)
	public Employee getElementById(int empid) {
		return dao.getElementById(empid);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Employee> Loadall() {
		return dao.Loadall();
	}

}
