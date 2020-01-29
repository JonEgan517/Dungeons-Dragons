import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AllStats 
{
	public static void allStats(ArrayList<Character> stats)
	{
		JFrame frame = new JFrame();

		for(Character abilities: stats)
		{
			JOptionPane.showMessageDialog(frame,
			"Strength: "+abilities.getStrength()
			+"\nIntelligence: "+ abilities.getIntelligence() 
			+"\nDexterity: "+ abilities.getDexterity() 
			+"\nWisdom: "+ abilities.getWisdom() 
			+"\nCharisma: "+ abilities.getCharisma() 
			+"\nConstitution: "+ abilities.getConstitution()
			+"\nHitPoints: "+ abilities.getHitPoints()+ "\n");
		}
	}
}
