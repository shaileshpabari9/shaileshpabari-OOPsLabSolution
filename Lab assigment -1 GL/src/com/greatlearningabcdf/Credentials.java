package com.greatlearningabcdf;
import java.util.Random;

import com.greatlearningabc.Employee;

public class Credentials {
	
	public String generatePassword(){
	
	int first = (int) '!' ; //33
	int last = (int ) '~' ; // 126
	
	Random random = new Random();
	
	StringBuilder  sb = new StringBuilder();
	
	for(int i=0; i<8; i++) {
		
		int Fandom = random.nextInt(first, last);
		
		char randomchar = (char) Fandom ;
		sb.append(randomchar);}
	
		return sb.toString();
}
	
	public String generateEmailAddress(Employee emp, String dep ){
		
		String email = String.format("%s%s@%s.company.com",emp.getFirstName(),emp.getLastName(),dep);
		
		return email;	
	}
	
	public void showCredentials(String firstName, String password, String email) {
		
		System.out.printf("Dear %s your generated credentials are as follows \n"
				+ " Email %s \n"
				+ " Password %s \n"
				, firstName, email, password);
	}
	

}
