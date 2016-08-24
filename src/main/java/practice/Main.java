package practice;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
	
	public static void main(String[] args) throws IOException  {
		printProjectDescription();
		printTechnologiesUsed();
	}

	private static void printProjectDescription() throws IOException {
		Path path = Resources.ProjectDescription.getPath();
		Files.lines(path).forEach(System.out::println);
	}
	
	private static void printTechnologiesUsed() {
		System.out.println();
		System.out.println("The following technologies were used in this project:");
		for (Technologies technology : Technologies.values()){
			System.out.println(technology);
		}
	}
}