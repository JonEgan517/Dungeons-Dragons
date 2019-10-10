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
				
				System.out.println("What human house are you from?\n1. House of Vadalis\n2. House of Cannith\n3. House of Orien\n4. House of Deneith\n");
				int humanHouse = intInput.nextInt();
				
				if(humanHouse == 1) //House of Vadalis
				{
					System.out.println("You choose to be a Human from the House of Vadalis.\n");
					for (Character vadalis: stats)
					{
						//race bonuses becuase you are Human everything +1, +1 Dexterity, +1 Wisdom, and any one ability score increased by 1 
						vadalis.setStrength(vadalis.getStrength()+1);
						vadalis.setIntelligence(vadalis.getIntelligence()+1);
						vadalis.setDexterity(vadalis.getDexterity()+2);
						vadalis.setWisdom(vadalis.getWisdom()+2);
						vadalis.setCharisma(vadalis.getCharisma()+1);
						vadalis.setConstitution(vadalis.getConstitution()+1);
					
						System.out.println("Strength: "+vadalis.getStrength()
						+"\nIntelligence: "+ vadalis.getIntelligence() 
						+"\nDexterity: "+ vadalis.getDexterity() 
						+"\nWisdom: "+ vadalis.getWisdom() 
						+"\nCharisma: "+ vadalis.getCharisma() 
						+"\nConstitution: "+ vadalis.getConstitution());
					}	
				}
				
				else if(humanHouse == 2) //House of Cannith
				{
					System.out.println("You choose to be a Human from the House of Cannith.\n");
					for (Character cannith: stats)
					{
						//race bonuses becuase you are a Human everything +1, +1 Intelligence, +1 Dexterity, and increase either Intelligence or Dextery by 1 
						cannith.setStrength(cannith.getStrength()+1);
						cannith.setIntelligence(cannith.getIntelligence()+2);
						cannith.setDexterity(cannith.getDexterity()+2);
						cannith.setWisdom(cannith.getWisdom()+1);
						cannith.setCharisma(cannith.getCharisma()+1);
						cannith.setConstitution(cannith.getConstitution()+1);
					
						System.out.println("Strength: "+cannith.getStrength()
						+"\nIntelligence: "+ cannith.getIntelligence() 
						+"\nDexterity: "+ cannith.getDexterity() 
						+"\nWisdom: "+ cannith.getWisdom() 
						+"\nCharisma: "+ cannith.getCharisma() 
						+"\nConstitution: "+ cannith.getConstitution());
					}	
				}
				
				else if(humanHouse == 3) //House of Orien
				{
					System.out.println("You choose to be a Human from the House of Orien.\n");
					for (Character orien: stats)
					{
						//race bonuses becuase you are a Human everything +1, +2 Dexterity, and any one ability score increase by 1
						orien.setStrength(orien.getStrength()+1);
						orien.setIntelligence(orien.getIntelligence()+1);
						orien.setDexterity(orien.getDexterity()+3);
						orien.setWisdom(orien.getWisdom()+1);
						orien.setCharisma(orien.getCharisma()+1);
						orien.setConstitution(orien.getConstitution()+1);
					
						System.out.println("Strength: "+orien.getStrength()
						+"\nIntelligence: "+ orien.getIntelligence() 
						+"\nDexterity: "+ orien.getDexterity() 
						+"\nWisdom: "+ orien.getWisdom() 
						+"\nCharisma: "+ orien.getCharisma() 
						+"\nConstitution: "+ orien.getConstitution());
					}	
				}
				
				else if(humanHouse == 4) //House of Deneith
				{
					System.out.println("You choose to be a Human from the House of Deneith.\n");
					for (Character deneith: stats)
					{
						//race bonuses becuase you are a Human everything +1, +1 Strength, +1 Wisdom, and any one ability score increase by 1
						deneith.setStrength(deneith.getStrength()+2);
						deneith.setIntelligence(deneith.getIntelligence()+1);
						deneith.setDexterity(deneith.getDexterity()+1);
						deneith.setWisdom(deneith.getWisdom()+2);
						deneith.setCharisma(deneith.getCharisma()+1);
						deneith.setConstitution(deneith.getConstitution()+1);
					
						System.out.println("Strength: "+deneith.getStrength()
						+"\nIntelligence: "+ deneith.getIntelligence() 
						+"\nDexterity: "+ deneith.getDexterity() 
						+"\nWisdom: "+ deneith.getWisdom() 
						+"\nCharisma: "+ deneith.getCharisma() 
						+"\nConstitution: "+ deneith.getConstitution());
					}	
				}
				break;
				
			case 2: //Dwarf
				
				System.out.println("What kind of dwarf?\n1. Mountain Dwarf\n2. Hill Dwarf\n");
				int typeOfDwarf = intInput.nextInt();
				
				if(typeOfDwarf == 1) //Mountain Dwarf
				{
					System.out.println("You choose to be a Mountain Dwarf.\n");
					
					for (Character mountain: stats) 
					{
						//race bonuses becuase you are a Dwarf +2 Constitution and +2 Strength
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
					System.out.println("You choose to be a Hill Dwarf.\n");
					
					for (Character hill: stats) 
					{
						//race bonuses becuase you are a Dwarf +2 Constitution and +1 Wisdom
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
				System.out.println("What kind of elf?\n1. High Elf\n2. Wood Elf\n");
				int typeOfElf = intInput.nextInt();
				
				if(typeOfElf == 1) //High Elf
				{
					System.out.println("You choose to be a High Elf.\n");
					
					for (Character highElf: stats)
					{
						//race bonuses becuase you are a Elf +2 Dexterity and +1 Intellgence
						highElf.setIntelligence(highElf.getIntelligence()+1);
						highElf.setDexterity(highElf.getDexterity()+2);
					
						System.out.println("Strength: "+highElf.getStrength()
						+"\nIntelligence: "+ highElf.getIntelligence() 
						+"\nDexterity: "+ highElf.getDexterity() 
						+"\nWisdom: "+ highElf.getWisdom() 
						+"\nCharisma: "+ highElf.getCharisma() 
						+"\nConstitution: "+ highElf.getConstitution());
					}					
				}
				else if(typeOfElf == 2) //Wood Elf
				{
					System.out.println("You choose to be a Wood Elf.\n");
					for (Character woodElf: stats)
					{
						//race bonuses becuase you are a Elf +2 Dexterity and +1 Wisdom
						woodElf.setDexterity(woodElf.getDexterity()+2);
						woodElf.setWisdom(woodElf.getWisdom()+1);
						
						System.out.println("Strength: "+woodElf.getStrength()
						+"\nIntelligence: "+ woodElf.getIntelligence() 
						+"\nDexterity: "+ woodElf.getDexterity() 
						+"\nWisdom: "+ woodElf.getWisdom() 
						+"\nCharisma: "+ woodElf.getCharisma() 
						+"\nConstitution: "+ woodElf.getConstitution());
					}
				}
				break;
			
			case 4: //Halfling
				System.out.println("What kind of halfling?\n1. Lightfoot\n2. Stout\n");
				int typeOfHalfling = intInput.nextInt();
				
				if(typeOfHalfling == 1)
				{
					System.out.println("You choose to be a Lightfoot Halfling.\n");
					
					for (Character lightfoot: stats) //Lightfoot Halfling
					{
						//race bonuses because you are a Halfling +2 Dexterity and +1 Charisma
						lightfoot.setDexterity(lightfoot.getDexterity()+2);
						lightfoot.setCharisma(lightfoot.getCharisma()+1);
					
						System.out.println("Strength: "+lightfoot.getStrength()
						+"\nIntelligence: "+ lightfoot.getIntelligence() 
						+"\nDexterity: "+ lightfoot.getDexterity() 
						+"\nWisdom: "+ lightfoot.getWisdom() 
						+"\nCharisma: "+ lightfoot.getCharisma() 
						+"\nConstitution: "+ lightfoot.getConstitution());
					}
				}
				
				else if(typeOfHalfling == 2) //Stout Halfling
				{
					System.out.println("You choose to be a Stout Halfling.\n");
					
					for (Character stout: stats)
					{
						//race bonuses because you are a Halfling +2 Dexterity and +1 Constitution
						stout.setDexterity(stout.getDexterity()+2);
						stout.setConstitution(stout.getConstitution()+1);
					
						System.out.println("Strength: "+stout.getStrength()
						+"\nIntelligence: "+ stout.getIntelligence() 
						+"\nDexterity: "+ stout.getDexterity() 
						+"\nWisdom: "+ stout.getWisdom() 
						+"\nCharisma: "+ stout.getCharisma() 
						+"\nConstitution: "+ stout.getConstitution());
					}
				}
				break;
				
			case 5: //Gnome
				System.out.println("What kind of Gnome?\n1. Rock Gnome \n2. Forest Gnome.\n");
				int typeOfGnome = intInput.nextInt();
				
				if(typeOfGnome == 1)
				{
					System.out.println("You choose to be a Rock Gnome.\n");
					
					for (Character rock: stats) //Rock Gnome
					{
						//race bonuses becuase you are a Gnome +2 Intelligence and +1 Constitution
						rock.setIntelligence(rock.getIntelligence()+2);
						rock.setConstitution(rock.getConstitution()+1);
					
						System.out.println("Strength: "+rock.getStrength()
						+"\nIntelligence: "+ rock.getIntelligence() 
						+"\nDexterity: "+ rock.getDexterity() 
						+"\nWisdom: "+ rock.getWisdom() 
						+"\nCharisma: "+ rock.getCharisma() 
						+"\nConstitution: "+ rock.getConstitution());
					}
				}
				
				else if(typeOfGnome == 2) //Forest Gnome
				{
					System.out.println("You choose to be a Forest Gnome.\n");
					
					for (Character forest: stats)
					{
						//race bonuses because you are a Gnome +2 Intelligence and +1 Dexterity
						forest.setIntelligence(forest.getIntelligence()+2);
						forest.setDexterity(forest.getDexterity()+1);
					
						System.out.println("Strength: "+forest.getStrength()
						+"\nIntelligence: "+ forest.getIntelligence() 
						+"\nDexterity: "+ forest.getDexterity() 
						+"\nWisdom: "+ forest.getWisdom() 
						+"\nCharisma: "+ forest.getCharisma() 
						+"\nConstitution: "+ forest.getConstitution());
					}
				}
				break;
				
			case 6: //Half-Orc
				System.out.println("You choose to be a Half-Orc.\n");
				int typeOfHalfOrc = intInput.nextInt();
				
				for (Character character: stats)
				{
					//race bonuses you are a Half-Orc +2 Strength and +1 Constitution
					character.setStrength(character.getStrength()+2);
					character.setConstitution(character.getConstitution()+1);
					
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
