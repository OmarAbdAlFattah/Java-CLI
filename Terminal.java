import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.text.*;
public class Terminal {
	
	private String[] validCommands = { "clear", "cd", "ls", "cp", "mv", "rm", "mkdir", "rmdir", "cat", "more", "pwd"};
	private File currentPath;
	

	/*public static void cp(File sourcePath, File destinationPath){
		
		System.out.println(sourcePath);
		System.out.println(destinationPath);

	}*/
	
	
	public static void mv(String sourcePath, String destinationPath){
		
	}
	
	public static void rm(String sourcePath){
		
	}
	
	public static void cd(){
		String newDir = System.setProperty("e:\\College\\Sem1 2018\\Opertaing Systems\\Assignments\\Test A1", "/tmp");
		System.out.println("New Working Directory: " + newDir);
	}
	public static void knowCurrentDirectory(){
		System.out.println(System.getProperty("user.dir"));
	}
	
	public static void main(String[] args) {
		//should be empty as the main thread at the Parser class will be executed 
	}

}
