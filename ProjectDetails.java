package l2Task7;

/* Program for a project management system
 * that allows you to store the project,customer and contractor details
 * and be able to edit certain details.
 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ProjectDetails {
		// variables
		String projectNumber;
		String projectName;
		String buildingType;
		int erfNumber;
		float feeCharged;
		float amountPaid;
		Date date;
		
		// Initializing constructors
		public ProjectDetails(String projectNumber, String projectName, String buildingType, int erfNumber, 
				float feeCharged, float amountPaid, Date date) {
			
			this.projectNumber = projectNumber;
			this.projectName = projectName;
			this.buildingType = buildingType;
			this.erfNumber = erfNumber;
			this.feeCharged = feeCharged;
			this.amountPaid	= amountPaid;
			this.date = date;
			
		}
		// storing the variables
		public void saveProject(String projectNumber, String projectName, String buildingType, int erfNumber, float feeCharged, float amountPaid, Date date) {
			
			try {
				FileWriter writeText = new FileWriter("ProjectFile.txt");
				PrintWriter printWriter = new PrintWriter(writeText);
		        printWriter.printf("%s, %s, %s, %s, %s, %s, %s",projectNumber, projectName, buildingType, erfNumber, feeCharged, amountPaid, date);
		        writeText.close();
		        
		        System.out.println("\nSuccessfully caputured information.\n");
				} catch(IOException e) {
					
					System.out.println("An error occured.");
					e.printStackTrace();
				}
			
		}
		
	}

