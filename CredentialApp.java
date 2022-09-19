package com.email.main;
import java.util.Scanner;
import com.email.model.Employee;
import com.email.service.CredentialService;

public class CredentialApp {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Deepak","Sankhlecha");
		CredentialService credentialService= new CredentialService(); 
		String generatedEmail = null;
		char[] generatedpwd;
		
	// To display the options to the User.
		
	    System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human resource");
		System.out.println("4. Legal");
		
	// Use of Scanner Class to read the input from the user.
		
		Scanner scanner = new Scanner (System.in);
		int option = scanner.nextInt();
	
	// Now , Use of if - else if statements to choose among multiple options.
		
		if ( option== 1) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");
			
		}else if (option==2){
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"admin");
			
		}else if ( option==3) {
		    generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"hr");
		}else if (option==4) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"legal");
		}else {
			System.out.println("Enter a valid Option");
			scanner.close();
			System.exit(-1);
			}

		generatedpwd=credentialService.generatePassword();
		credentialService.showCredentials(employee.getFirstName(),generatedEmail ,generatedpwd );
		scanner.close();
		
		
	}

}
