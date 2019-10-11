import java.util.ArrayList;

public class GameRun 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> stats = new ArrayList<Character>();
		
		stats.add(new Character((((int)(Math.random()*20))+1) //Strength
		,(((int)(Math.random()*20))+1)//Intelligence
		,(((int)(Math.random()*20))+1) //Dexterity
		,(((int)(Math.random()*20))+1)//Wisdom
		,(((int)(Math.random()*20))+1)//Charisma
		,(((int)(Math.random()*20))+1)//Constitution
		,0)); //Hit Points
		
		Intro.intro(stats);
		Modifiers.modifier(stats);
		Race.pickRace(stats);
		Class.pickClass(stats);
		AllStats.allStats(stats);
	}
}
