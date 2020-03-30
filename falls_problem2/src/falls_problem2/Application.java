package falls_problem2;

public class Application {

	
	private static final String INPUT_FILE = "problem2.txt";
	private static final String OUTPUT_FILE = "unique_word_counts.txt";
	
	
	public static void main(String[] args) {
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		//count what is in file
		duplicateCounter.count(INPUT_FILE);
		
		//print results to user
		duplicateCounter.write(OUTPUT_FILE);
		
		
		

	}

}
