package com.junit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	Employee emp=new Employee();
	@Test
	public void testCalSalary() {
		emp.setId(101);
		emp.setName("premala");
		emp.setAge(25);
		emp.setMonthlySalary(12000);
		double salary=emp.calYearlySalry(emp);
		assertEquals(144000, salary,0.0);//0.0 is compulsory in new version not now
		
	}
	@Test
	public void testCalAppraisal() {
		emp.setId(102);
		emp.setName("siddhi");
		emp.setAge(25);
		emp.setMonthlySalary(26000);
		double appraisal=emp.calcAppraisal(emp);
		assertEquals(500,appraisal);
	}

}
