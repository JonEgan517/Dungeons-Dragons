import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Intro 
{	
	public static void intro(ArrayList<Character> stats) 
	{
		String name;
		JFrame frame = new JFrame();
		
		ImageIcon titalIcon = new ImageIcon(("D&D.png"));
		JOptionPane.showMessageDialog(frame,
				"Welcome to Dungeons & Dragons Character Generator.",
				"Dungeons & Dragons Character Generator",
				JOptionPane.QUESTION_MESSAGE,
				titalIcon);
		
		name = JOptionPane.showInputDialog(
				 "Name Your Character");
		JOptionPane.showMessageDialog(frame,
				"Hello, " + name);
	}
}
