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
	uniqueWords = new HashSet<>();
}

	public void remove(String dataFile) {
		
		
		
		//get the file
		// File dataFile = new File("problem1.txt");
		
try {		
	
	Scanner scan = new Scanner (new File(dataFile));
	
		while (scan.hasNext()) {
			
uniqueWords.add(scan.next());

		}
scan.close();

}    catch (FileNotFoundException e) {
	System.out.println("Sorry, the file you are looking for has not been found. Try again.");
}


	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*if (dataFile.exists())
}
			System.out.println(dataFile.getName() + " Exists!");
		else System.out.println("This ain't it chief");
	//okay, so we can get into txt file here	
	
		
		Scanner sc = new Scanner(dataFile);
		//reading words here
	//while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		
		Scanner readChar = new Scanner (dataFile);
		String a = readChar.next();
		System.out.println(a);
	
		
		String b = readChar.next();
		System.out.println(b);
		
		return;
} catch ( SomeException e) {*/
	// catch exceptions. print error.
	
	//}

	
		
	//if sc.hasNextLine = sc.hasNextLine
	
	
	
	
		
		//try (DuplicateRemover dataFile = new DuplicateRemover("problem1.txt")) {
		  //  dataFile.println(text);
		//}
	
		/*try {
			
			dataFile = new String(Files.readAllBytes(Paths.get("problem1.txt")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		d= dataFile;
		return d;
		String[] words = dataFile.split("[!-~]* ");
		Set<String> uniqueWords = new HashSet<String>();

		for (String word : words) {
		    uniqueWords.add(word);
		}*/
		
		
		
	
	

	
	public void write(String outputFile) {
		
		
		try {
			
			PrintWriter prt = new PrintWriter(new File(outputFile));
			
			
				for (String string : uniqueWords) {
					
					prt.println(string);
				}
		prt.flush();
		prt.close();
		
			
		} catch (FileNotFoundException e) {
			
			System.out.print(e);
		}
		
		
	}
	
}
