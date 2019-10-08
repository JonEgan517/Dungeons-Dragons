import java.util.ArrayList;

public class GameRun 
{
	public static void main(String[] args) 
	{
		ArrayList<Class> stats = new ArrayList<Class>();
		
		stats.add(new Class((((int)(Math.random()*6))+12) //Strength
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6) //Intelligence
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6) //Dexterity
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+8) //Wisdom
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6) //Charisma 
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6))); //Constitution
		
		for (Class character: stats)
		{
			System.out.println(character.getStrength()+ character.getIntelligence() + character.getDexterity() 
			+ character.getWisdom() + character.getCharisma() + character.getConstitution());
		}
	}
}
