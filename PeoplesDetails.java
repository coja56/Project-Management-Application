package l2Task7;

// A class to store PeoplesDetails
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PeoplesDetails {
	//attributes
	String name;
	String telephoneNumber;
	String emailAddress;
	String physicalAddress;
	
	//Constructor
	public PeoplesDetails(String name, String telephoneNumber, String emailAddress,
			String physicalAddress) {
		
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	public void savePerson(String name, String telephoneNumber,String emailAddress,String pysicalAddress) {
		
		try {
			FileWriter writeText = new FileWriter("PeopleFile.txt");
			PrintWriter printWriter = new PrintWriter(writeText);
			printWriter.printf("%s, %s, %s, %s", name,telephoneNumber,emailAddress,physicalAddress);
			writeText.close();
			
			System.out.println("\n Information successfully captured.\n");
		
		    } catch(IOException e) {
		    	
		    	System.out.println("An error occured.");
		    	e.printStackTrace();
		    	
		    }
	}
		
		
		

	

}


