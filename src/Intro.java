import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Intro 
{	
	public static void intro(ArrayList<Character> stats) 
	{
		String name;
		JFrame frame = new JFrame();
		
		JOptionPane.showMessageDialog(
				frame,
				"Welcome to Dungeons and Dragons Character Generator.");
		name = JOptionPane.showInputDialog(
				 "Name Your Character");
		JOptionPane.showMessageDialog(
				frame,
				"Hello, " + name);
	}
}
