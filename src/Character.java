public class Character 
{
	private static int strength;
	private static int intelligence;
	private static int dexterity;
	private static int wisdom;
	private static int charisma;
	private static int constitution;
	private static int hitPoints;
	
	public Character(int s, int i, int d, int w, int ch, int con, int hp)
	{
		setStrength(s);
		setIntelligence(i);
		setDexterity(d);
		setWisdom(w);
		setCharisma(ch);
		setConstitution(con);
		setHitPoints(hp);
	}

	public static int getStrength() 
	{
		return strength;
	}

	public static void setStrength(int strength) 
	{
		Character.strength = strength;
	}

	public static int getIntelligence()
	{
		return intelligence;
	}

	public static void setIntelligence(int intelligence) 
	{
		Character.intelligence = intelligence;
	}

	public static int getDexterity() 
	{
		return dexterity;
	}

	public static void setDexterity(int dexterity) 
	{
		Character.dexterity = dexterity;
	}

	public static int getWisdom() 
	{
		return wisdom;
	}

	public static void setWisdom(int wisdom) 
	{
		Character.wisdom = wisdom;
	}

	public static int getCharisma() 
	{
		return charisma;
	}

	public static void setCharisma(int charisma) 
	{
		Character.charisma = charisma;
	}

	public static int getConstitution() 
	{
		return constitution;
	}

	public static void setConstitution(int constitution) 
	{
		Character.constitution = constitution;
	}

	public static int getHitPoints() {
		return hitPoints;
	}

	public static void setHitPoints(int hitPoints) {
		Character.hitPoints = hitPoints;
	}
}
