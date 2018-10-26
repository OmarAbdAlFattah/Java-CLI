//import java.nio.file.*;
//import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Parser {
	String[] args;
	String cmd;
	
	public static ArrayList<String> parse(String commandIn){

		ArrayList<String> cmd = new ArrayList<String>(1);
		String[] input = commandIn.split(" ");
		ArrayList<String> afterParsing = new ArrayList<String>(Arrays.asList(input));
		/*for(int i = 0 ; i < afterParsing.size(); i++){
			return afterParsing.get(i);
		}*/
		String command = afterParsing.get(0);
		/*if(command.equals("cd")){
			System.out.println("This will change directory");
		}
		else if(command.equals("cp")){
			System.out.println("This will copy directory from " + afterParsing.get(1) + " to " + afterParsing.get(2));
		}*/
		return afterParsing;
		
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String>cmd = new ArrayList<String>(1);
		
		String commandIn = reader.nextLine();

		System.out.println(parse(commandIn));
		System.out.println("Main Directory: ");
		Terminal.knowCurrentDirectory();
		Terminal.cd();
		
		reader.close();
	}

}
