import java.util.ArrayList;
import java.util.Scanner;

public class Intro 
{
	public static void intro(ArrayList<Character> stats) 
	{
		Scanner stringInput = new Scanner(System.in);
		
		System.out.println("Welcome to Dungeons and Dragons Character Generator.\n"
				+ "Name Your Character");
		
		String name = stringInput.nextLine();
		System.out.println("Hello, " + name + "\n");
	}
}
