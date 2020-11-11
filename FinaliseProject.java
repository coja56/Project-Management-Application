package l2Task7;
/* Class to generate an invoice if the fee charged is not
 * fully paid and display customer details.
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FinaliseProject {
	String name;
	String telephoneNumber;
	String emailAddress;
	double feeCharged;
	double amountPaid;
	
	//Initiating the Constructor
	public FinaliseProject(String name,String telephoneNumber,String emailAddress,String physicalAddress,float feeCharged, float amountPaid) {
		
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.feeCharged = feeCharged;
		this.amountPaid = amountPaid;
	}
	
	//
	public void completedProject(String name, String telephoneNumber,String emailAddress,String physicalAddress,double feeCharged, double amountPaid) {
		
		//
		if(amountPaid < feeCharged) {
			double outstandingAmount = feeCharged - amountPaid;
			
			try {
				FileWriter writeText = new FileWriter("CompletedProject.txt");
				PrintWriter printWriter = new PrintWriter(writeText);
				printWriter.printf("Name     : %s\n"
						+ "Telephone Number  : %s\n"
						+ "Email Address      : %s\n"
						+ "Outstanding Amount   : %s\n",name,telephoneNumber,emailAddress,physicalAddress,outstandingAmount);
				writeText.close();
				
				System.out.println("\n INVOICE:\n");
			    } catch(IOException e) {
			    	
			    	System.out.println("An error has occured");
			    	e.printStackTrace();
			    }
			
			//
			try {
				
				FileReader projectFile = new FileReader("CompletedProject.txt");
				BufferedReader projectReader = new BufferedReader(projectFile);
				String line = "";
				line = projectReader.readLine();
				while(line != null) {
					System.out.println(line);
					line = projectReader.readLine();
				}
				projectReader.close();
			    }catch(Exception ex) {
			    	System.out.println("Error: " + ex);
			    }
				
		}
		//
		
		else if(amountPaid == feeCharged) {
			
			System.out.println("Amount is Paid in Full.");
		}
		
		else {
			System.out.println("Inconsistent amounts entered");
		}
	}
}
