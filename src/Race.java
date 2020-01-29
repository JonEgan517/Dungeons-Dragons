import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Race 
{
	public static void pickRace(ArrayList<Character> stats)
	{
		int race = 0;
		JFrame frame = new JFrame();
		
		Object[] raceChoice = {"Human", "Dwarf", "Elf", "Halfling", "Gnome", "Half-Orc"};
		race = JOptionPane.showOptionDialog(frame,
				"What Race would you like to play as?",
				"Your Race",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, raceChoice, raceChoice[5]);
	
		switch(race) //Choosing your race 
		{
			case 0: //Human
				
				int human = 0;
				Object[] humanHouse = {"House of Vadalis", "House of Cannith", "House of Orien", "House of Deneith"};
				human = JOptionPane.showOptionDialog(frame,
						"What human house are you from?",
						"Human House",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, humanHouse, humanHouse[3]);
				
				if(human == 0) //House of Vadalis
				{
					ImageIcon	humanIcon = new ImageIcon(("Human.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Human everything is +1.\n"
							+ "You are from the House of Vadalis you gain +1 Dexterity, +1 Wisdom.\n",
							"Human",
							JOptionPane.QUESTION_MESSAGE,
							humanIcon);
					
					int vadalisBonus = 0;
					Object[] vadalisChoice = {"Strength", "Intelligence", "Dexterity", "Wisdom", "Charisma", "Constitution"};
					vadalisBonus = JOptionPane.showOptionDialog(frame,
							"Also you get to choose any ability score to be increased +1.",
							"Vadalis Bonus", 
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							null, vadalisChoice, vadalisChoice[5]);
					
					for (Character vadalis: stats)
					{
						
						if(vadalisBonus == 0)
						{
							vadalis.setStrength(vadalis.getStrength()+1);
						}
						else if(vadalisBonus == 1)
						{
							vadalis.setIntelligence(vadalis.getIntelligence()+1);
						}
						else if(vadalisBonus == 2)
						{
							vadalis.setDexterity(vadalis.getDexterity()+1);
						}
						else if(vadalisBonus == 3)
						{
							vadalis.setWisdom(vadalis.getWisdom()+1);
						}
						else if(vadalisBonus == 4)
						{
							vadalis.setCharisma(vadalis.getCharisma()+1);
						}
						else if(vadalisBonus == 5)
						{
							vadalis.setConstitution(vadalis.getConstitution()+1);
						}
						
						vadalis.setStrength(vadalis.getStrength()+1);
						vadalis.setIntelligence(vadalis.getIntelligence()+1);
						vadalis.setDexterity(vadalis.getDexterity()+2);
						vadalis.setWisdom(vadalis.getWisdom()+2);
						vadalis.setCharisma(vadalis.getCharisma()+1);
						vadalis.setConstitution(vadalis.getConstitution()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+vadalis.getStrength()
								+"\nIntelligence: "+ vadalis.getIntelligence() 
								+"\nDexterity: "+ vadalis.getDexterity() 
								+"\nWisdom: "+ vadalis.getWisdom() 
								+"\nCharisma: "+ vadalis.getCharisma() 
								+"\nConstitution: "+ vadalis.getConstitution() + "\n");
					}	
				}
				
				else if(human == 1) //House of Cannith
				{
					ImageIcon	humanIcon = new ImageIcon(("Human.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Human everything is +1.\n"
							+ "You are from the House of Cannith you gain +1 Dexterity, +1 Wisdom.\n"
							,"Human",
							JOptionPane.QUESTION_MESSAGE,
							humanIcon);
					
					int cannithBonus = 0;
					Object[] cannithChoice = {"Intelligence","Dexterity"};
					cannithBonus = JOptionPane.showOptionDialog(frame,
							"Also you get to increase either Intelligence or Dexterity.",
							"Cannith Bonus", 
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							null, cannithChoice, cannithChoice[1]);
					
					for (Character cannith: stats)
					{	
						if(cannithBonus == 0)
						{
							cannith.setIntelligence(cannith.getIntelligence()+1);
						}
						else if(cannithBonus == 1)
						{
							cannith.setDexterity(cannith.getDexterity()+1);
						}
						
						cannith.setStrength(cannith.getStrength()+1);
						cannith.setIntelligence(cannith.getIntelligence()+2);
						cannith.setDexterity(cannith.getDexterity()+2);
						cannith.setWisdom(cannith.getWisdom()+1);
						cannith.setCharisma(cannith.getCharisma()+1);
						cannith.setConstitution(cannith.getConstitution()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+cannith.getStrength()
								+"\nIntelligence: "+ cannith.getIntelligence() 
								+"\nDexterity: "+ cannith.getDexterity() 
								+"\nWisdom: "+ cannith.getWisdom() 
								+"\nCharisma: "+ cannith.getCharisma() 
								+"\nConstitution: "+ cannith.getConstitution() + "\n");
					}	
				}
				
				else if(human == 2) //House of Orien
				{
					ImageIcon	humanIcon = new ImageIcon(("Human.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Human everything is +1.\n"
							+ "You are from the House of Orien you gain +2 Dexterity.\n"
							,"Human",
							JOptionPane.QUESTION_MESSAGE,
							humanIcon);
					
					int orienBonus = 0;
					Object[] orienChoice = {"Strength", "Intelligence", "Dexterity", "Wisdom", "Charisma", "Constitution"};
					orienBonus = JOptionPane.showOptionDialog(frame,
							"Also you get to choose any ability score to be increased +1.",
							"Orien Bonus", 
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							null, orienChoice, orienChoice[5]);
					
					for (Character orien: stats)
					{
						
						if(orienBonus == 0)
						{
							orien.setStrength(orien.getStrength()+1);
						}
						else if(orienBonus == 1)
						{
							orien.setIntelligence(orien.getIntelligence()+1);
						}
						else if(orienBonus == 2)
						{
							orien.setDexterity(orien.getDexterity()+1);
						}
						else if(orienBonus == 3)
						{
							orien.setWisdom(orien.getWisdom()+1);
						}
						else if(orienBonus == 4)
						{
							orien.setCharisma(orien.getCharisma()+1);
						}
						else if(orienBonus == 5)
						{
							orien.setConstitution(orien.getConstitution()+1);
						}
						
						orien.setStrength(orien.getStrength()+1);
						orien.setIntelligence(orien.getIntelligence()+1);
						orien.setDexterity(orien.getDexterity()+3);
						orien.setWisdom(orien.getWisdom()+1);
						orien.setCharisma(orien.getCharisma()+1);
						orien.setConstitution(orien.getConstitution()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+orien.getStrength()
								+"\nIntelligence: "+ orien.getIntelligence() 
								+"\nDexterity: "+ orien.getDexterity() 
								+"\nWisdom: "+ orien.getWisdom() 
								+"\nCharisma: "+ orien.getCharisma() 
								+"\nConstitution: "+ orien.getConstitution() + "\n");
					}	
				}
				
				else if(human == 3) //House of Deneith
				{
					ImageIcon	humanIcon = new ImageIcon(("Human.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Human everything is +1.\n"
							+ "You are from the House of Deneith you gain +1 Strength and +1 Wisdom.\n"
							,"Human",
							JOptionPane.QUESTION_MESSAGE,
							humanIcon);
					
					int deneithBonus = 0;
					Object[] deneithChoice = {"Strength", "Intelligence", "Dexterity", "Wisdom", "Charisma", "Constitution"};
					deneithBonus = JOptionPane.showOptionDialog(frame,
							"Also you get to choose any ability score to be increased +1.",
							"Deneith Bonus", 
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							null, deneithChoice, deneithChoice[5]);
					
					for (Character deneith: stats)
					{	
						if(deneithBonus == 0)
						{
							deneith.setStrength(deneith.getStrength()+1);
						}
						else if(deneithBonus == 1)
						{
							deneith.setIntelligence(deneith.getIntelligence()+1);
						}
						else if(deneithBonus == 2)
						{
							deneith.setDexterity(deneith.getDexterity()+1);
						}
						else if(deneithBonus == 3)
						{
							deneith.setWisdom(deneith.getWisdom()+1);
						}
						else if(deneithBonus == 4)
						{
							deneith.setCharisma(deneith.getCharisma()+1);
						}
						else if(deneithBonus == 5)
						{
							deneith.setConstitution(deneith.getConstitution()+1);
						}
						
						deneith.setStrength(deneith.getStrength()+2);
						deneith.setIntelligence(deneith.getIntelligence()+1);
						deneith.setDexterity(deneith.getDexterity()+1);
						deneith.setWisdom(deneith.getWisdom()+2);
						deneith.setCharisma(deneith.getCharisma()+1);
						deneith.setConstitution(deneith.getConstitution()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+deneith.getStrength()
								+"\nIntelligence: "+ deneith.getIntelligence() 
								+"\nDexterity: "+ deneith.getDexterity() 
								+"\nWisdom: "+ deneith.getWisdom() 
								+"\nCharisma: "+ deneith.getCharisma() 
								+"\nConstitution: "+ deneith.getConstitution() + "\n");
					}	
				}
				break;
				
			case 1: //Dwarf
				
				int dwarf = 0;
				Object[] typeOfDwarf = {"Mountain Dwarf", "Hill Dwarf"};
				dwarf = JOptionPane.showOptionDialog(
						frame,
						"What kind of dwarf?",
						"Type of Dwarf",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, typeOfDwarf, typeOfDwarf[1]);

				if(dwarf == 0) //Mountain Dwarf
				{
					ImageIcon	dwarfIcon = new ImageIcon(("Dwarf.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Dwarf +2 Constitution, and you are a Mountain Dwarf you gain +2 Strength.\n"
							,"Dwarf",
							JOptionPane.QUESTION_MESSAGE,
							dwarfIcon);
					
					for (Character mountain: stats) 
					{
						mountain.setStrength(mountain.getStrength()+2);
						mountain.setConstitution(mountain.getConstitution()+2);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+mountain.getStrength()
								+"\nIntelligence: "+ mountain.getIntelligence() 
								+"\nDexterity: "+ mountain.getDexterity() 
								+"\nWisdom: "+ mountain.getWisdom() 
								+"\nCharisma: "+ mountain.getCharisma() 
								+"\nConstitution: "+ mountain.getConstitution() + "\n");
					}
				}
				else if(dwarf == 1) //Hill Dwarf
				{
					ImageIcon	dwarfIcon = new ImageIcon(("Dwarf.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Dwarf +2 Constitution, and you are a Hill Dwarf you gain +1 Wisdom."
							+ "\nYou also gain +1 hitpoint.\n"
							,"Dwarf",
							JOptionPane.QUESTION_MESSAGE,
							dwarfIcon);
					
					for (Character hill: stats) 
					{
						hill.setWisdom(hill.getWisdom()+1);
						hill.setConstitution(hill.getConstitution()+2);
						hill.setHitPoints(hill.getHitPoints()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+hill.getStrength()
								+"\nIntelligence: "+ hill.getIntelligence() 
								+"\nDexterity: "+ hill.getDexterity() 
								+"\nWisdom: "+ hill.getWisdom() 
								+"\nCharisma: "+ hill.getCharisma() 
								+"\nConstitution: "+ hill.getConstitution() + "\n");
					}
				}
				break;
				
			case 2: //Elf
				
				int elf = 0;
				Object[] typeOfElf = {"High Elf", "Wood Elf"};
				elf = JOptionPane.showOptionDialog(
						frame,
						"What kind of elf?",
						"Type of Elf",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, typeOfElf, typeOfElf[1]);
				
				if(elf == 0) //High Elf
				{
					ImageIcon HighElfIcon = new ImageIcon(("HighElf.jpeg"));
					JOptionPane.showMessageDialog(frame,"Here are your race bonuses becuase you are a Elf +2 Dexterity, and you are a High Elf you gain +1 Intelligence.\n"
							,"High Elf",
							JOptionPane.QUESTION_MESSAGE,
							HighElfIcon);
					
					for (Character highElf: stats)
					{
						highElf.setIntelligence(highElf.getIntelligence()+1);
						highElf.setDexterity(highElf.getDexterity()+2);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+highElf.getStrength()
								+"\nIntelligence: "+ highElf.getIntelligence() 
								+"\nDexterity: "+ highElf.getDexterity() 
								+"\nWisdom: "+ highElf.getWisdom() 
								+"\nCharisma: "+ highElf.getCharisma() 
								+"\nConstitution: "+ highElf.getConstitution() + "\n");
					}					
				}
				
				else if(elf == 1) //Wood Elf
				{
					ImageIcon WoodElfIcon = new ImageIcon(("WoodElf.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Elf +2 Dexterity, and you are a Wood Elf you gain +1 Wisdom.\n"
							,"Wood Elf",
							JOptionPane.QUESTION_MESSAGE,
							WoodElfIcon);
					
					for (Character woodElf: stats)
					{
						woodElf.setDexterity(woodElf.getDexterity()+2);
						woodElf.setWisdom(woodElf.getWisdom()+1);
						
						JOptionPane.showMessageDialog(frame,
								"Strength: "+woodElf.getStrength()
								+"\nIntelligence: "+ woodElf.getIntelligence() 
								+"\nDexterity: "+ woodElf.getDexterity() 
								+"\nWisdom: "+ woodElf.getWisdom() 
								+"\nCharisma: "+ woodElf.getCharisma() 
								+"\nConstitution: "+ woodElf.getConstitution() + "\n");
					}
				}
				break;
			
			case 3: //Halfling
				
				int halfling = 0;
				Object[] typeOfHalfling = {"Lighfoot", "Stout"};
				halfling = JOptionPane.showOptionDialog(
						frame,
						"What kind of Halfling?",
						"Type of Elf",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, typeOfHalfling, typeOfHalfling[1]);
				
				if(halfling == 0) //Lightfoot Halfling
				{
					ImageIcon HalflingIcon = new ImageIcon(("Halfling.jpg"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Halfling +2 Dexterity, and you are a Lightfoot Halfling you gain +1 Charisma.\n"
							,"Halfling",
							JOptionPane.QUESTION_MESSAGE,
							HalflingIcon);
					
					for (Character lightfoot: stats)
					{
						lightfoot.setDexterity(lightfoot.getDexterity()+2);
						lightfoot.setCharisma(lightfoot.getCharisma()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+lightfoot.getStrength()
								+"\nIntelligence: "+ lightfoot.getIntelligence() 
								+"\nDexterity: "+ lightfoot.getDexterity() 
								+"\nWisdom: "+ lightfoot.getWisdom() 
								+"\nCharisma: "+ lightfoot.getCharisma() 
								+"\nConstitution: "+ lightfoot.getConstitution() + "\n");
					}
				}
				
				else if(halfling == 1) //Stout Halfling
				{
					ImageIcon HalflingIcon = new ImageIcon(("Halfling.jpg"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Halfling +2 Dexterity, and you are a Stout Halfling you gain +1 Constitution.\n"
							,"Halfling",
							JOptionPane.QUESTION_MESSAGE,
							HalflingIcon);
					
					for (Character stout: stats)
					{
						stout.setDexterity(stout.getDexterity()+2);
						stout.setConstitution(stout.getConstitution()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+stout.getStrength()
								+"\nIntelligence: "+ stout.getIntelligence() 
								+"\nDexterity: "+ stout.getDexterity() 
								+"\nWisdom: "+ stout.getWisdom() 
								+"\nCharisma: "+ stout.getCharisma() 
								+"\nConstitution: "+ stout.getConstitution() + "\n");
					}
				}
				break;
				
			case 4: //Gnome
				
				int gnome = 0;
				Object[] typeOfGnome = {"Rock Gnome", "Forest Gnome"};
				gnome = JOptionPane.showOptionDialog(
						frame,
						"What kind of Gnome?",
						"Type of Gnome",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, typeOfGnome, typeOfGnome[1]);
				
				if(gnome == 0) //Rock Gnome
				{
					ImageIcon GnomeIcon = new ImageIcon(("Gnome.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Gnome +2 Intelligence, and you are a Rock Gnome you gain +1 Constitution.\n"
							,"Gnome",
							JOptionPane.QUESTION_MESSAGE,
							GnomeIcon);
					
					for (Character rock: stats)
					{
						rock.setIntelligence(rock.getIntelligence()+2);
						rock.setConstitution(rock.getConstitution()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+rock.getStrength()
								+"\nIntelligence: "+ rock.getIntelligence() 
								+"\nDexterity: "+ rock.getDexterity() 
								+"\nWisdom: "+ rock.getWisdom() 
								+"\nCharisma: "+ rock.getCharisma() 
								+"\nConstitution: "+ rock.getConstitution() + "\n");
					}
				}
				
				else if(gnome == 1) //Forest Gnome
				{
					ImageIcon GnomeIcon = new ImageIcon(("Gnome.png"));
					JOptionPane.showMessageDialog(frame,
							"Here are your race bonuses becuase you are a Gnome +2 Intelligence, and you are a Forest Gnome you gain +1 Dexterity.\n"
							,"Gnome",
							JOptionPane.QUESTION_MESSAGE,
							GnomeIcon);
					
					for (Character forest: stats)
					{
						//race bonuses because you are a Gnome +2 Intelligence and +1 Dexterity
						forest.setIntelligence(forest.getIntelligence()+2);
						forest.setDexterity(forest.getDexterity()+1);
					
						JOptionPane.showMessageDialog(frame,
								"Strength: "+forest.getStrength()
								+"\nIntelligence: "+ forest.getIntelligence() 
								+"\nDexterity: "+ forest.getDexterity() 
								+"\nWisdom: "+ forest.getWisdom() 
								+"\nCharisma: "+ forest.getCharisma() 
								+"\nConstitution: "+ forest.getConstitution() + "\n");
					}
				}
				break;
				
			case 5: //Half-Orc
				
				ImageIcon HalfOrcIcon = new ImageIcon(("Half-orc.jpg"));
				JOptionPane.showMessageDialog(frame,
						"Here are your race bonuses becuase you are a Half-Orc +2 Strength and +1 Constitution.\n"
						,"Half-Orc",
						JOptionPane.QUESTION_MESSAGE,
						HalfOrcIcon);
				
				for (Character character: stats)
				{
					character.setStrength(character.getStrength()+2);
					character.setConstitution(character.getConstitution()+1);
					
					JOptionPane.showMessageDialog(frame,"Strength: "+character.getStrength()
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
