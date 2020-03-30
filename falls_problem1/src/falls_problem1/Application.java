package falls_problem1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		DuplicateRemover a = new DuplicateRemover();
		
		
		//remove words from text and put them into a variable
		a.remove("problem1.txt");
		
		
		//write the remaining words
		
		a.write("unique_Words.txt");
	}

}
