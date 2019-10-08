
public class Class 
{
	private static int strength;
	private static int intelligence;
	private static int dexterity;
	private static int wisdom;
	private static int charisma;
	private static int constitution;
	
	public Class(int s, int i, int d, int w, int ch, int con)
	{
		setStrength(s);
		setIntelligence(i);
		setDexterity(d);
		setWisdom(w);
		setCharisma(ch);
		setConstitution(con);
	}

	public static int getStrength() 
	{
		return strength;
	}

	public static void setStrength(int strength) 
	{
		Class.strength = strength;
	}

	public static int getIntelligence()
	{
		return intelligence;
	}

	public static void setIntelligence(int intelligence) 
	{
		Class.intelligence = intelligence;
	}

	public static int getDexterity() 
	{
		return dexterity;
	}

	public static void setDexterity(int dexterity) 
	{
		Class.dexterity = dexterity;
	}

	public static int getWisdom() 
	{
		return wisdom;
	}

	public static void setWisdom(int wisdom) 
	{
		Class.wisdom = wisdom;
	}

	public static int getCharisma() 
	{
		return charisma;
	}

	public static void setCharisma(int charisma) 
	{
		Class.charisma = charisma;
	}

	public static int getConstitution() 
	{
		return constitution;
	}

	public static void setConstitution(int constitution) 
	{
		Class.constitution = constitution;
	}
}
