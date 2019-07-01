package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;
@Repository
public class EmployeeDaoImpl  implements IEmployeeDao{
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveEmployee(Employee empid) {
		return (int) ht.save(empid);
	}

	@Override
	public void updateEmployee(Employee empid) {
		ht.update(empid);		
	}

	@Override
	public void deletEmployee(int empid) {
		Employee e=new Employee();
		e.setEmpid(empid);
		ht.delete(e);
	}

	@Override
	public Employee getElementById(int empid) {
		return ht.get(Employee.class, empid);
	}

	@Override
	public List<Employee> Loadall() {
		return ht.loadAll(Employee.class);
	}

}
