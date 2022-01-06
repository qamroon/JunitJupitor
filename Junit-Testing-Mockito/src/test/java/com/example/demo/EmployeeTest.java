package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTest {
	
	@Test
	public void testEmployeeData_01_Pos() {
		Employee e1=new Employee("101","alam");
		Employee e2=new Employee("101","alam");
		assertTrue(e1.equals(e2));
		assertEquals(e1.hashCode(), e2.hashCode());
		
	}
	
	@Test
	public void testEmployeeData_02_Neg() {
		Employee e3=new Employee("103","alam");
		Employee e4=new Employee("104","alam");
		
		assertFalse(e3.equals(e4));
		assertNotEquals(e3.hashCode(), e4.hashCode());
	}

}
