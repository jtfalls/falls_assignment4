package falls_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;



//instance variable:  uniqueWords;
public class DuplicateRemover {
	
	
private Set<String> uniqueWords;

public DuplicateRemover() {
	
	//make a new hash set into variable
	uniqueWords = new HashSet<>();
	
}

	public void remove(String dataFile) {
		
		
try {		
	
	Scanner scan = new Scanner (new File(dataFile));
	
	//scan the words within the txt
	
		while (scan.hasNext()) {
			
uniqueWords.add(scan.next());

		}
scan.close();

}    catch (FileNotFoundException e) {
	
	//print error message if something goes wrong
	System.out.println("Sorry, the file you are looking for has not been found. Please try again.");
}


	}

	
	

	
	

	
	public void write(String outputFile) {
		
		
		try {
			
			PrintWriter prt = new PrintWriter(new File(outputFile));
			
			
				for (String string : uniqueWords) {
					
					prt.println(string);
				}
		prt.flush();
		
		//CLOSE what we opened. VERY important
		prt.close();
		
			
		} catch (FileNotFoundException e) {
			
			System.out.print("Sorry, the file you are looking for has not been found. Please try again.");
		}
		
		
	}
	
}
