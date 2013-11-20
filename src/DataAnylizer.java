import java.io.*;
import java.util.*;

public class DataAnylizer {

	public static void main(String arg) {
		// two file directory
		String file1 = "";
		String file2 = "";	
		HashMap<Date, ArrayList<String>> fstHP= new HashMap<Date, ArrayList<String>>();
		HashMap<Date, ArrayList<String>> secHP= new HashMap<Date, ArrayList<String>>();

		// read-in file
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(file1);
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				if(strLine.contains("")){
					// get the string start with Fri,XXXX,XXXX 
					String tem_getDate = strLine.substring(12, 15);
					System.out.println("Check Point: tem_getDate:"+ tem_getDate);
					
					// make it date formate
					
				}
			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
