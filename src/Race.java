import java.util.ArrayList;
import java.util.Scanner;

public class Race 
{
	static ArrayList<Character> stats = new ArrayList<Character>();
	
	public static void pickRace()
	{
		stats.add(new Character((((int)(Math.random()*6))+12) //Strength
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6) //Intelligence
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6) //Dexterity
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+8) //Wisdom
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6) //Charisma
		,(((int)(Math.random()*6)))+(((int)(Math.random()*6))+6))); //Constitution
		
		Scanner intInput = new Scanner(System.in); 
		System.out.println("What Race would you like to be?\n1. Human\n2. Dwarf\n3. Elf\n4. Halfling\n5. Gnome\n6. Half-Orc");
		int race = intInput.nextInt();
	
		switch(race) //Choosing your race 
		{
			case 1: //human
				System.out.println("You selected to be a human.");
				for (Character human: stats)
				{
					//race bonuses
					human.setStrength(human.getStrength()+2);
					human.setIntelligence(human.getIntelligence());
					human.setDexterity(human.getDexterity());
					human.setWisdom(human.getWisdom());
					human.setCharisma(human.getCharisma());
					human.setConstitution(human.getConstitution());
					
					System.out.println("Strength: "+human.getStrength()
					+"\nIntelligence: "+ human.getIntelligence() 
					+"\nDexterity: "+ human.getDexterity() 
					+"\nWisdom: "+ human.getWisdom() 
					+"\nCharisma: "+ human.getCharisma() 
					+"\nConstitution: "+ human.getConstitution());
				}
				break;
				
			case 2: //dwarf
				System.out.println("You selected to be a dwarf.");
				for (Character dwarf: stats)
				{
					//race bonuses
					dwarf.setStrength(dwarf.getStrength());
					dwarf.setIntelligence(dwarf.getIntelligence());
					dwarf.setDexterity(dwarf.getDexterity());
					dwarf.setWisdom(dwarf.getWisdom());
					dwarf.setCharisma(dwarf.getCharisma());
					dwarf.setConstitution(dwarf.getConstitution());
					
					System.out.println("Strength: "+dwarf.getStrength()
					+"\nIntelligence: "+ dwarf.getIntelligence() 
					+"\nDexterity: "+ dwarf.getDexterity() 
					+"\nWisdom: "+ dwarf.getWisdom() 
					+"\nCharisma: "+ dwarf.getCharisma() 
					+"\nConstitution: "+ dwarf.getConstitution()+2);
				}
				break;
				
			case 3: //elf
				System.out.println("You selected to be a elf.");
				for (Character elf: stats)
				{
					//race bonuses
					elf.setStrength(elf.getStrength()+2);
					elf.setIntelligence(elf.getIntelligence());
					elf.setDexterity(elf.getDexterity());
					elf.setWisdom(elf.getWisdom());
					elf.setCharisma(elf.getCharisma());
					elf.setConstitution(elf.getConstitution());
					
					System.out.println("Strength: "+elf.getStrength()
					+"\nIntelligence: "+ elf.getIntelligence() 
					+"\nDexterity: "+ elf.getDexterity() 
					+"\nWisdom: "+ elf.getWisdom() 
					+"\nCharisma: "+ elf.getCharisma() 
					+"\nConstitution: "+ elf.getConstitution());
				}
				break;
			
			case 4: //halfling
				System.out.println("You selected to be a halfling.");
				for (Character halfling: stats)
				{
					//race bonuses
					halfling.setStrength(halfling.getStrength()+2);
					halfling.setIntelligence(halfling.getIntelligence());
					halfling.setDexterity(halfling.getDexterity());
					halfling.setWisdom(halfling.getWisdom());
					halfling.setCharisma(halfling.getCharisma());
					halfling.setConstitution(halfling.getConstitution());
					
					System.out.println("Strength: "+halfling.getStrength()
					+"\nIntelligence: "+ halfling.getIntelligence() 
					+"\nDexterity: "+ halfling.getDexterity() 
					+"\nWisdom: "+ halfling.getWisdom() 
					+"\nCharisma: "+ halfling.getCharisma() 
					+"\nConstitution: "+ halfling.getConstitution());
				}
				break;
				
			case 5: //gnome
				System.out.println("You selected to be a gnome.");
				for (Character gnome: stats)
				{
					//race bonuses
					gnome.setStrength(gnome.getStrength()+2);
					gnome.setIntelligence(gnome.getIntelligence());
					gnome.setDexterity(gnome.getDexterity());
					gnome.setWisdom(gnome.getWisdom());
					gnome.setCharisma(gnome.getCharisma());
					gnome.setConstitution(gnome.getConstitution());
					
					System.out.println("Strength: "+gnome.getStrength()
					+"\nIntelligence: "+ gnome.getIntelligence() 
					+"\nDexterity: "+ gnome.getDexterity() 
					+"\nWisdom: "+ gnome.getWisdom() 
					+"\nCharisma: "+ gnome.getCharisma() 
					+"\nConstitution: "+ gnome.getConstitution());
				}
				break;
				
			case 6: //half-orc
				System.out.println("You selected to be a half-orc.");
				for (Character character: stats)
				{
					//race bonuses
					character.setStrength(character.getStrength()+2);
					character.setIntelligence(character.getIntelligence());
					character.setDexterity(character.getDexterity());
					character.setWisdom(character.getWisdom());
					character.setCharisma(character.getCharisma());
					character.setConstitution(character.getConstitution());
					
					System.out.println("Strength: "+character.getStrength()
					+"\nIntelligence: "+ character.getIntelligence() 
					+"\nDexterity: "+ character.getDexterity() 
					+"\nWisdom: "+ character.getWisdom() 
					+"\nCharisma: "+ character.getCharisma() 
					+"\nConstitution: "+ character.getConstitution());
				}
				break;
		}
	}
}
