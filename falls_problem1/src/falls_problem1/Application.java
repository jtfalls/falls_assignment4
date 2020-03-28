package falls_problem1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		DuplicateRemover a = new DuplicateRemover();
		
		a.remove("problem1.txt");
		a.write("unique_Words.txt");
	}

}
