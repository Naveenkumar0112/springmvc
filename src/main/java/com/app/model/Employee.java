package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab_info_tcs")
public class Employee {

	@Id
	@Column(name="eid")
	@GeneratedValue
	private Integer empid;
	
	@Column(name="ename")
	private String emname;
	
	@Column(name="esal")
	private Double empsal;
	
	@Column(name="egen")
	private String empgen;
	
	@Column(name="edept")
	private String empept;
	
	@Column(name="eloc")
	private String emploc;
	
	@Column(name="eaddr")
	private String empaddr;

	public Employee() {
		super();
	}

	public Employee(Integer empid) {
		super();
		this.empid = empid;
	}

	public Employee(Integer empid, String emname, Double empsal, String empgen, String empept, String emploc,
			String empaddr) {
		super();
		this.empid = empid;
		this.emname = emname;
		this.empsal = empsal;
		this.empgen = empgen;
		this.empept = empept;
		this.emploc = emploc;
		this.empaddr = empaddr;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	public Double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}

	public String getEmpgen() {
		return empgen;
	}

	public void setEmpgen(String empgen) {
		this.empgen = empgen;
	}

	public String getEmpept() {
		return empept;
	}

	public void setEmpept(String empept) {
		this.empept = empept;
	}

	public String getEmploc() {
		return emploc;
	}

	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}

	public String getEmpaddr() {
		return empaddr;
	}

	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emname=" + emname + ", empsal=" + empsal + ", empgen=" + empgen
				+ ", empept=" + empept + ", emploc=" + emploc + ", empaddr=" + empaddr + "]";
	}





}
