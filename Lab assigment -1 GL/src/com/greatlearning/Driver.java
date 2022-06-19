package com.greatlearning;
import java.util.Scanner;

import com.greatlearningabc.Employee;
import com.greatlearningabcdf.Credentials;

public class Driver {
	
	public static void main (String[] args)
	{
		Employee emp= new Employee("Shailesh","Pabari");
		
		System.out.println("Menu");
		System.out.println("1. Technical\n"
				+ "2. Admin \n"
				+ "3. Human Resource\n"
				+ "4. Legal\n"
				);
	
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	String department;
	
	switch(input) {
	
	case 1:
		department="tech";
	 break;
	 
	case 2:
		department ="adm";
	 break;
	
	case 3:
		department= "hr";
	 break;
	 
	case 4:
		department= "lgl";
	 break;
	 
	 default:
		 
		 throw new IllegalArgumentException("Illegal Input"+ input);
		
	}
	
	
	Credentials cs = new Credentials();
	String email= cs.generateEmailAddress(emp, department);
	String password = cs.generatePassword();
	
	cs.showCredentials(emp.getFirstName(), password, email);
	
	}
	
}
