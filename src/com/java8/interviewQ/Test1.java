package com.java8.interviewQ;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.model.EmpUtil;
import com.java.model.Employee;

public class Test1 {

    //How many male and female employees are there in the organization?
	
	/*
	 * For queries such as above where you need to group the input elements, use the
	 * Collectors.groupingBy() method. In this query, we use Collectors.groupingBy()
	 * method which takes two arguments. We pass Employee::getGender as first
	 * argument which groups the input elements based on gender and
	 * Collectors.counting() as second argument which counts the number of entries
	 * in each group.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmpUtil.getEmpList();
		
		Map<String, Long> noOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				          
				System.out.println(noOfMaleAndFemaleEmployees);

	}

}
