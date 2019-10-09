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
		System.out.println("What Race would you like to be?\n1. Human\n2. Dwarf\n3. Elf\n4. Halfling\n5. Gnome\n6. Half-Orc\n");
		int race = intInput.nextInt();
	
		switch(race) //Choosing your race 
		{
			case 1: //Human
				
				System.out.println("What human house are you from?");
				int humanHouse = intInput.nextInt();
				
				if(humanHouse == 1) //House Vadalis
				{
					for (Character human: stats)
					{
						//race bonuses
						human.setStrength(human.getStrength());
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
				}
				break;
				
			case 2: //Dwarf
				
				System.out.println("What kind of dwarf?\n1. Mountain Dwarf\n2. Hill Dwarf\n");
				int typeOfDwarf = intInput.nextInt();
				
				if(typeOfDwarf == 1) //Mountain Dwarf
				{
					System.out.println("You choose mountain dwarf.\n");
					
					for (Character mountain: stats) 
					{
						//race bonuses +2 Strength, +2 Constitution
						mountain.setStrength(mountain.getStrength()+2);
						mountain.setConstitution(mountain.getConstitution()+2);
					
						System.out.println("Strength: "+mountain.getStrength()
						+"\nIntelligence: "+ mountain.getIntelligence() 
						+"\nDexterity: "+ mountain.getDexterity() 
						+"\nWisdom: "+ mountain.getWisdom() 
						+"\nCharisma: "+ mountain.getCharisma() 
						+"\nConstitution: "+ mountain.getConstitution());
					}
				}
				else if(typeOfDwarf == 2) //Hill Dwarf
				{
					System.out.println("You choose hill dwarf.");
					for (Character hill: stats) 
					{
						//race bonuses +1 Wisdom, +2 Constitution
						hill.setWisdom(hill.getWisdom()+1);
						hill.setConstitution(hill.getConstitution()+2);
					
						System.out.println("Strength: "+hill.getStrength()
						+"\nIntelligence: "+ hill.getIntelligence() 
						+"\nDexterity: "+ hill.getDexterity() 
						+"\nWisdom: "+ hill.getWisdom() 
						+"\nCharisma: "+ hill.getCharisma() 
						+"\nConstitution: "+ hill.getConstitution());
					}
				}
				break;
				
			case 3: //Elf
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
			
			case 4: //Halfling
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
				
			case 5: //Gnome
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
				
			case 6: //Half-Orc
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

	private static void Switch(int typeOfDwarf) {
		// TODO Auto-generated method stub
		
	}
}
