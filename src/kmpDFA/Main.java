package kmpDFA;
import  java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		File file = new File(
				"C:\\Users\\glenm\\eclipse-workspace\\Knuth-Morris-Pratt\\test1.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//read in the text from the first line
		String text = br.readLine();
		//read in the pattern from the second line
		String pattern = br.readLine();
		
		System.out.println(text);
		System.out.println(pattern);
	}
	
	/*	
	public static int[] buildDFAGraph(String pattern)
	{
		
	}
	*/
}
