import java.util.ArrayList;
import java.util.Scanner;

public class Race 
{
	public static void pickRace(ArrayList<Character> stats)
	{
		Scanner intInput = new Scanner(System.in); 
		
		System.out.println("What Race would you like to play as?\n1. Human\n2. Dwarf\n3. Elf\n4. Halfling\n5. Gnome\n6. Half-Orc\n");
		int race = intInput.nextInt();
	
		switch(race) //Choosing your race 
		{
			case 1: //Human
				
				System.out.println("What human house are you from?\n1. House of Vadalis\n2. House of Cannith\n3. House of Orien\n4. House of Deneith\n");
				int humanHouse = intInput.nextInt();
				
				if(humanHouse == 1) //House of Vadalis
				{
					System.out.println("Here are your race bonuses becuase you are a Human everything is +1.\n"
					+ "You are from the House of Vadalis you gain +1 Dexterity, +1 Wisdom.\n");
					
					System.out.println("Also you get to choose any ability score to be increased +1."
					+ "\n1. Strength\n2. Intelligence \n3. Dexterity \n4. Wisdom \n5. Charisma \n6. Constitution\n");
					
					for (Character vadalis: stats)
					{
						int bonus = intInput.nextInt();
						
						if(bonus == 1)
						{
							vadalis.setStrength(vadalis.getStrength()+1);
						}
						else if(bonus == 2)
						{
							vadalis.setIntelligence(vadalis.getIntelligence()+1);
						}
						else if(bonus == 3)
						{
							vadalis.setDexterity(vadalis.getDexterity()+1);
						}
						else if(bonus == 4)
						{
							vadalis.setWisdom(vadalis.getWisdom()+1);
						}
						else if(bonus == 5)
						{
							vadalis.setCharisma(vadalis.getCharisma()+1);
						}
						else if(bonus == 6)
						{
							vadalis.setConstitution(vadalis.getConstitution()+1);
						}
						
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
						+"\nConstitution: "+ vadalis.getConstitution() + "\n");
					}	
				}
				
				else if(humanHouse == 2) //House of Cannith
				{
					System.out.println("Here are your race bonuses becuase you are a Human everything is +1.\n"
					+ "You are from the House of Cannith you gain +1 Dexterity, +1 Wisdom.\n");
					
					System.out.println("Also you get to increase either Intelligence or Dexterity +1.\n1. Intelligence\n2. Dexterity\n");
					
					for (Character cannith: stats)
					{
						int bonus = intInput.nextInt();
						
						if(bonus == 1)
						{
							cannith.setIntelligence(cannith.getIntelligence()+1);
						}
						else if(bonus == 2)
						{
							cannith.setDexterity(cannith.getDexterity()+1);
						}
						
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
						+"\nConstitution: "+ cannith.getConstitution() + "\n");
					}	
				}
				
				else if(humanHouse == 3) //House of Orien
				{
					System.out.println("Here are your race bonuses becuase you are a Human everything is +1.\n"
					+ "You are from the House of Orien you gain +2 Dexterity.\n");
					
					System.out.println("Also you get to choose any ability score to be increased +1."
					+ "\n1. Strength\n2. Intelligence \n3. Dexterity \n4. Wisdom \n5. Charisma \n6. Constitution\n");
					
					for (Character orien: stats)
					{
						int bonus = intInput.nextInt();
						
						if(bonus == 1)
						{
							orien.setStrength(orien.getStrength()+1);
						}
						else if(bonus == 2)
						{
							orien.setIntelligence(orien.getIntelligence()+1);
						}
						else if(bonus == 3)
						{
							orien.setDexterity(orien.getDexterity()+1);
						}
						else if(bonus == 4)
						{
							orien.setWisdom(orien.getWisdom()+1);
						}
						else if(bonus == 5)
						{
							orien.setCharisma(orien.getCharisma()+1);
						}
						else if(bonus == 6)
						{
							orien.setConstitution(orien.getConstitution()+1);
						}
						
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
						+"\nConstitution: "+ orien.getConstitution() + "\n");
					}	
				}
				
				else if(humanHouse == 4) //House of Deneith
				{
					System.out.println("Here are your race bonuses becuase you are a Human everything is +1.\n"
					+ "You are from the House of Deneith you gain +1 Strength and +1 Wisdom.\n");
					
					System.out.println("Also you get to choose any ability score to be increased +1."
					+ "\n1. Strength\n2. Intelligence \n3. Dexterity \n4. Wisdom \n5. Charisma \n6. Constitution\n");
					
					for (Character deneith: stats)
					{
						int bonus = intInput.nextInt();
						
						if(bonus == 1)
						{
							deneith.setStrength(deneith.getStrength()+1);
						}
						else if(bonus == 2)
						{
							deneith.setIntelligence(deneith.getIntelligence()+1);
						}
						else if(bonus == 3)
						{
							deneith.setDexterity(deneith.getDexterity()+1);
						}
						else if(bonus == 4)
						{
							deneith.setWisdom(deneith.getWisdom()+1);
						}
						else if(bonus == 5)
						{
							deneith.setCharisma(deneith.getCharisma()+1);
						}
						else if(bonus == 6)
						{
							deneith.setConstitution(deneith.getConstitution()+1);
						}
						
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
						+"\nConstitution: "+ deneith.getConstitution() + "\n");
					}	
				}
				break;
				
			case 2: //Dwarf
				
				System.out.println("What kind of dwarf?\n1. Mountain Dwarf\n2. Hill Dwarf\n");
				int typeOfDwarf = intInput.nextInt();
				
				if(typeOfDwarf == 1) //Mountain Dwarf
				{
					System.out.println("Here are your race bonuses becuase you are a Dwarf +2 Constitution, and you are a Mountain Dwarf you gain +2 Strength.\n");
					
					for (Character mountain: stats) 
					{
						mountain.setStrength(mountain.getStrength()+2);
						mountain.setConstitution(mountain.getConstitution()+2);
					
						System.out.println("Strength: "+mountain.getStrength()
						+"\nIntelligence: "+ mountain.getIntelligence() 
						+"\nDexterity: "+ mountain.getDexterity() 
						+"\nWisdom: "+ mountain.getWisdom() 
						+"\nCharisma: "+ mountain.getCharisma() 
						+"\nConstitution: "+ mountain.getConstitution() + "\n");
					}
				}
				else if(typeOfDwarf == 2) //Hill Dwarf
				{
					System.out.println("Here are your race bonuses becuase you are a Dwarf +2 Constitution, and you are a Hill Dwarf you gain +1 Wisdom."
							+ "\nYou also gain +1 hitpoint.\n");
					
					for (Character hill: stats) 
					{
						hill.setWisdom(hill.getWisdom()+1);
						hill.setConstitution(hill.getConstitution()+2);
						hill.setHitPoints(hill.getHitPoints()+1);
					
						System.out.println("Strength: "+hill.getStrength()
						+"\nIntelligence: "+ hill.getIntelligence() 
						+"\nDexterity: "+ hill.getDexterity() 
						+"\nWisdom: "+ hill.getWisdom() 
						+"\nCharisma: "+ hill.getCharisma() 
						+"\nConstitution: "+ hill.getConstitution() + "\n");
					}
				}
				break;
				
			case 3: //Elf
				System.out.println("What kind of elf?\n1. High Elf\n2. Wood Elf\n");
				int typeOfElf = intInput.nextInt();
				
				if(typeOfElf == 1) //High Elf
				{
					System.out.println("Here are your race bonuses becuase you are a Dwarf +2 Dexterity, and you are a High Elf you gain +1 Intelligence.\n");
					
					for (Character highElf: stats)
					{
						highElf.setIntelligence(highElf.getIntelligence()+1);
						highElf.setDexterity(highElf.getDexterity()+2);
					
						System.out.println("Strength: "+highElf.getStrength()
						+"\nIntelligence: "+ highElf.getIntelligence() 
						+"\nDexterity: "+ highElf.getDexterity() 
						+"\nWisdom: "+ highElf.getWisdom() 
						+"\nCharisma: "+ highElf.getCharisma() 
						+"\nConstitution: "+ highElf.getConstitution() + "\n");
					}					
				}
				
				else if(typeOfElf == 2) //Wood Elf
				{
					System.out.println("Here are your race bonuses becuase you are a Elf +2 Dexterity, and you are a Mountain Dwarf you gain +1 Wisdom.\n");
					for (Character woodElf: stats)
					{
						woodElf.setDexterity(woodElf.getDexterity()+2);
						woodElf.setWisdom(woodElf.getWisdom()+1);
						
						System.out.println("Strength: "+woodElf.getStrength()
						+"\nIntelligence: "+ woodElf.getIntelligence() 
						+"\nDexterity: "+ woodElf.getDexterity() 
						+"\nWisdom: "+ woodElf.getWisdom() 
						+"\nCharisma: "+ woodElf.getCharisma() 
						+"\nConstitution: "+ woodElf.getConstitution() + "\n");
					}
				}
				break;
			
			case 4: //Halfling
				System.out.println("What kind of halfling?\n1. Lightfoot\n2. Stout\n");
				int typeOfHalfling = intInput.nextInt();
				
				if(typeOfHalfling == 1) //Lightfoot Halfling
				{
					System.out.println("Here are your race bonuses becuase you are a Halfling +2 Dexterity, and you are a Lightfoot Halfling you gain +1 Charisma.\n");
					
					for (Character lightfoot: stats)
					{
						lightfoot.setDexterity(lightfoot.getDexterity()+2);
						lightfoot.setCharisma(lightfoot.getCharisma()+1);
					
						System.out.println("Strength: "+lightfoot.getStrength()
						+"\nIntelligence: "+ lightfoot.getIntelligence() 
						+"\nDexterity: "+ lightfoot.getDexterity() 
						+"\nWisdom: "+ lightfoot.getWisdom() 
						+"\nCharisma: "+ lightfoot.getCharisma() 
						+"\nConstitution: "+ lightfoot.getConstitution() + "\n");
					}
				}
				
				else if(typeOfHalfling == 2) //Stout Halfling
				{
					System.out.println("Here are your race bonuses becuase you are a Halfling +2 Dexterity, and you are a Stout Halfling you gain +1 Constitution.\n");
					
					for (Character stout: stats)
					{
						stout.setDexterity(stout.getDexterity()+2);
						stout.setConstitution(stout.getConstitution()+1);
					
						System.out.println("Strength: "+stout.getStrength()
						+"\nIntelligence: "+ stout.getIntelligence() 
						+"\nDexterity: "+ stout.getDexterity() 
						+"\nWisdom: "+ stout.getWisdom() 
						+"\nCharisma: "+ stout.getCharisma() 
						+"\nConstitution: "+ stout.getConstitution() + "\n");
					}
				}
				break;
				
			case 5: //Gnome
				System.out.println("What kind of Gnome?\n1. Rock Gnome \n2. Forest Gnome.\n");
				int typeOfGnome = intInput.nextInt();
				
				if(typeOfGnome == 1) //Rock Gnome
				{
					System.out.println("Here are your race bonuses becuase you are a Gnome +2 Intelligence, and you are a Rock Gnome you gain +1 Constitution.\n");
					
					for (Character rock: stats)
					{
						rock.setIntelligence(rock.getIntelligence()+2);
						rock.setConstitution(rock.getConstitution()+1);
					
						System.out.println("Strength: "+rock.getStrength()
						+"\nIntelligence: "+ rock.getIntelligence() 
						+"\nDexterity: "+ rock.getDexterity() 
						+"\nWisdom: "+ rock.getWisdom() 
						+"\nCharisma: "+ rock.getCharisma() 
						+"\nConstitution: "+ rock.getConstitution() + "\n");
					}
				}
				
				else if(typeOfGnome == 2) //Forest Gnome
				{
					System.out.println("Here are your race bonuses becuase you are a Gnome +2 Intelligence, and you are a Forest Gnome you gain +1 Dexterity.\n");
					
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
						+"\nConstitution: "+ forest.getConstitution() + "\n");
					}
				}
				break;
				
			case 6: //Half-Orc
				System.out.println("Here are your race bonuses becuase you are a Half-Orc +2 Strength and +1 Constitution.\n");
				
				for (Character character: stats)
				{
					character.setStrength(character.getStrength()+2);
					character.setConstitution(character.getConstitution()+1);
					
					System.out.println("Strength: "+character.getStrength()
					+"\nIntelligence: "+ character.getIntelligence() 
					+"\nDexterity: "+ character.getDexterity() 
					+"\nWisdom: "+ character.getWisdom() 
					+"\nCharisma: "+ character.getCharisma() 
					+"\nConstitution: "+ character.getConstitution() + "\n");
				}
				break;
		}
	}
}
