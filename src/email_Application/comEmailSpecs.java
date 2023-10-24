package email_Application;

import java.util.Scanner;

//email -> firstname.lastname@depatment.company.com
// department --> Sales, development, accounting, none -> blank
//Generate random password for a user
//set -> Change Passwords, Mailbox capacity, alternative email address.
// get to display

public class comEmailSpecs {
	
	
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String compName ="xyz";
	private String deptartment;

	


	public comEmailSpecs(String firstName,String lastName ) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println(createEmail());
		System.out.println(ran_Password(10));
		
	}
	
	public String createEmail()
	{
		System.out.println(firstName + " Can you please select the department \n");
		String user_Email="";
		
		System.out.println(" Please select from below \n 1.Sales \n 2.development \n 3.accounting");
		Scanner sc = new Scanner(System.in);
		String userDept = sc.next();
		System.out.println(userDept);
		
		if(userDept.toLowerCase().equals("sales") || userDept.toLowerCase().equals("development") || 
				userDept.toLowerCase().equals("accounting"))
		{
			user_Email = firstName+"."+lastName+"@"+userDept+"."+compName+".com";
			this.emailAddress = user_Email;
		 
		  
		}
		else 
		{
			System.out.println("Please select the valid dept");
		}
		
		 return user_Email;
		
	}
	
	  public String ran_Password(int passLenght)
	  {
		  String random ="ABCDEF1234567890~!@#$%";
		  char [] passWord = new char[passLenght];
		  
		  for(int i=0; i<passLenght; i++)
		  {
			  int pass_Value = (int) (Math.random() * random.length());
			  passWord[i] = random.charAt(pass_Value);	  
		  }
		  
	     	return new String(passWord);
		  
	  }

}
