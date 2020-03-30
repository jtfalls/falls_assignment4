package falls_problem2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	//make a variable to store number of times word is used
	
private Integer wordCounter;


private Map<String, Integer> map;

public DuplicateCounter() {
	//initialize it to zero at first
	this.wordCounter = 0;
	
	this.map = new HashMap<>();
	
}
	public void count(String dataFile) {
		
		
		Scanner fileReader;
		try {
			
			//scan words on file just like last problem
			fileReader = new Scanner (new File(dataFile));
				while (fileReader.hasNextLine()) {
					
					
					
					String line = fileReader.nextLine().trim();
					String[] data = line.split("[\\W]+");
						
						for(String word : data) {
							
							this.wordCounter = map.get(word);
							this.wordCounter = (this.wordCounter== null) ? 1: ++this.wordCounter;
							map.put(word,  this.wordCounter);
						}
				}
				
				//close! Very important.
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File" + dataFile + "cannot be found!");
			System.exit(1);
		}
	}
	

	
	
	
	
	
	
	public void write(String outputFile) {
		

		PrintWriter printwriter;
		FileWriter filewriter;
		
			try {
				
				filewriter= new FileWriter(new File(outputFile));
				printwriter = new PrintWriter(filewriter);
				
					for (Map.Entry<String, Integer> entry: map.entrySet()) {
						
						//print how many times each word was used
						printwriter.write(entry.getKey() + " occurs " + entry.getValue() + " times " + System.lineSeparator());
						
					}
					
				System.out.println("Map data written to file: " + outputFile);
				printwriter.flush();
				
				//close what we opened. very important
				filewriter.close();
				printwriter.close();
					
				
				
			} catch (IOException ex ) {
				//have error code ready if something bad happens.
				System.out.println("Error writing to " + outputFile + ": " + ex.getMessage());
				System.exit(1);
			}
			
			
			
	}
	
	
	
	
}
