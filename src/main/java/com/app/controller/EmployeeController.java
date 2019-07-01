package com.app.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Employee;
import com.app.service.IEmployeeService;
import com.app.validator.EmployeeValidator;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@Autowired
	private EmployeeValidator Validator;

	//Reg Page
	@RequestMapping("/show")
	public String empReg(ModelMap map) {
		map.addAttribute("employee",new Employee());
		return "EmpReg";

	}
	//save
	@RequestMapping(value="/save",method=POST)
	public String saveEmp(@ModelAttribute Employee employee,Errors errors,ModelMap map) {
		Validator.validate(employee,errors);
		int id= service.saveEmployee(employee);
		map.addAttribute("emp","EMPLOYEE DATA SAVED WITH "+ id);
		map.addAttribute("employee",new Employee()); 
		return "EmpReg";
	}


	//LoadAll data
	@RequestMapping("/all")
	public String ShowAllData(ModelMap map) {
		List<Employee>	list=service.Loadall();
		map.addAttribute("list", list);
		return "EmpData";
	}



	//delete
	@RequestMapping(value="/delete")
	public String deletEmp(@RequestParam Integer empid,ModelMap map) {
		service.deletEmployee(empid);
		List<Employee>	list=service.Loadall();
		map.addAttribute("list", list);
		map.addAttribute("emp","EMPLOYEE DELETED SUCCUSSFULLY"+empid);
		return "EmpData";
	}
	//get
	@RequestMapping("/view")
	public String shoeEmpOneData(@RequestParam Integer empid,ModelMap map) {
		Employee em=service.getElementById(empid);
		map.addAttribute("emp",em);
		return "EmpViewOne";
	}
	//search
	@RequestMapping(value="/search",method=POST)
	public String shoeEmpOneSerach(@RequestParam Integer empid,ModelMap map) {
		if(0==empid){
			List<Employee>	list=service.Loadall();
			map.addAttribute("list", list);
			map.addAttribute("emp","PLZ ENTER VALID EMPLOYEE ID");
			return "EmpData";
		}	
		
		else 
		{
			Employee em=service.getElementById(empid);
			map.addAttribute("emp",em);
			return "EmpViewOne";
		}
	}
}