package practice;


import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Files in /src/main/resources will be added to the root of 
 * the classpath when the project is compiled. Runtime resources can
 * then be accessed using the Object returned by getClass()
 */
public enum Resources {
	ProjectDescription("/ProjectDescription.txt");
	
	private String path;

	Resources(String path){
		this.path = path;
	}
	
	//TODO: Add null check and error handling
	public URL getResource(){
		return getClass().getResource(path);
	}
	
	public Path getPath(){
		return Paths.get(getResource().getPath());
	}
}
