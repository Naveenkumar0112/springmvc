package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired
	private IEmployeeService serivce;
	@PostMapping("/data")
	public ResponseEntity<?> insert(@RequestBody Employee emp){
		ResponseEntity<?> entity=null;
		int id=serivce.saveEmployee(emp);
		String body="Employee data saved with"+id;
		entity= new ResponseEntity<String>(body,HttpStatus.OK);
		return entity;
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllData(){
		ResponseEntity<?> entity=null;
		List<Employee> list=serivce.Loadall();
		entity=new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		return entity;

	}

	@GetMapping("/getone")
	public ResponseEntity<?> getdata(@RequestParam int empid){

		ResponseEntity<?> entity=null;
		Employee emp=serivce.getElementById(empid);
		entity=new ResponseEntity<Employee>(emp,HttpStatus.OK);

		return entity;
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?>  delete(@RequestParam int empid){

		ResponseEntity<?>  entity=null;
		serivce.deletEmployee(empid);
		String body="Employee"+empid+"deleted Successfully";
		entity=new ResponseEntity<String>(body,HttpStatus.OK);
		return entity;

	}
	@PutMapping("/update")
	public ResponseEntity<?> modiy(@RequestParam Employee empid){
		ResponseEntity<?> entity=null;
		serivce.updateEmployee(empid);
		String body="Employee data updated";
		entity=new ResponseEntity<String>(body,HttpStatus.OK);

		return entity;
	}

}	
