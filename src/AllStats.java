import java.util.ArrayList;

public class AllStats 
{
	public static void allStats(ArrayList<Character> stats)
	{
		System.out.println("Here are all of your stats: ");
		for(Character abilities: stats)
		{
			System.out.println("Strength: "+abilities.getStrength()
			+"\nIntelligence: "+ abilities.getIntelligence() 
			+"\nDexterity: "+ abilities.getDexterity() 
			+"\nWisdom: "+ abilities.getWisdom() 
			+"\nCharisma: "+ abilities.getCharisma() 
			+"\nConstitution: "+ abilities.getConstitution()
			+"\nHitPoints: "+ abilities.getHitPoints()+ "\n");
		}
	}
}
