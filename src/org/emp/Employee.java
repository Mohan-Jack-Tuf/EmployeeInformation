package org.emp;

public class Employee {
	private void empName() {
System.out.println("Employee Name Mohan");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		Company c = new Company();
		c.companyName();
		Client cl = new Client();
		cl.clientName();
		Project p = new Project();
		p.projectName();
		
	}

}
