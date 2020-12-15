


import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionTask {

	 
	   public static void main(String[] args)
	   {
		   String name,email;
		   int phoneNumber = 0;
	       name = JOptionPane.showInputDialog("What is your name? ");

	         	           
	       email = JOptionPane.showInputDialog("What is your e-mail ? ");

	            	            
	       String Stringinput = JOptionPane.showInputDialog("What is your phone number ? ");
	       try {
	    	    phoneNumber= Integer.parseInt(Stringinput);
		} catch (NumberFormatException e) {
			
			JOptionPane.showInputDialog(null, "input not valid ,please enter a valid number");
		}catch (NullPointerException e) {
			JOptionPane.showInputDialog(null, "Please enter Value");

		}
	        ;   
	        
	            String[] grade= new String[2];
	            String[] Subject= new String[2];
	            Subject[0]="Arabic";
	            Subject[1]="English";
	            
		        for (int i=0;i<Subject.length;i++)
		        {
		        	grade[i]=JOptionPane.showInputDialog("Please enter your grade["+Subject[i]+"].");
		        	//grade[i]= JOptionPane.showInputDialog(null,"Please enter your grade:", JOptionPane.QUESTION_MESSAGE);
		            
     
		        }

	          
				JOptionPane.showMessageDialog(null,"Hello " + name+"\nE-mail:" +email+"\n Phone Number:"+phoneNumber+"\n Subject Arabic Grade:"+grade[0] +"\n Subject English Grade: " +grade[1]);
				
				
	   
	}
	
	
}
	