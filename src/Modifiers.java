import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Modifiers 
{
	public static void modifier(ArrayList<Character> stats)
	{
		JFrame frame = new JFrame();
		
		JOptionPane.showMessageDialog(
				frame,
				"Rolling for the stats.");
		
		for(Character rolls: stats)
		{
			JOptionPane.showMessageDialog(
					frame,
					"Strength: "+rolls.getStrength()
					+"\nIntelligence: "+ rolls.getIntelligence() 
					+"\nDexterity: "+ rolls.getDexterity() 
					+"\nWisdom: "+ rolls.getWisdom() 
					+"\nCharisma: "+ rolls.getCharisma() 
					+"\nConstitution: "+ rolls.getConstitution() + "\n");
		}
		
		System.out.println("Modifiers: ");
		for(Character strengthMod: stats) //Strength Modifier 
		{	
			if(strengthMod.getStrength() == 20)
			{
				strengthMod.setStrength(strengthMod.getStrength()+5);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with +5 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 19 || strengthMod.getStrength() == 18)
			{
				strengthMod.setStrength(strengthMod.getStrength()+4);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with +4 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 17 || strengthMod.getStrength() == 16)
			{
				strengthMod.setStrength(strengthMod.getStrength()+3);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with +3 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 15 || strengthMod.getStrength() == 14)
			{
				strengthMod.setStrength(strengthMod.getStrength()+2);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with +2 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 13 || strengthMod.getStrength() == 12)
			{
				strengthMod.setStrength(strengthMod.getStrength()+1);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with +1 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 11 || strengthMod.getStrength() == 10)
			{
				JOptionPane.showMessageDialog(
						frame,
						"Strength with 0 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 9 || strengthMod.getStrength() == 8)
			{
				strengthMod.setStrength(strengthMod.getStrength()-1);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with -1 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 7 || strengthMod.getStrength() == 6)
			{
				strengthMod.setStrength(strengthMod.getStrength()-2);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with -2 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 5 || strengthMod.getStrength() == 4)
			{
				strengthMod.setStrength(strengthMod.getStrength()-3);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with -3 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 3 || strengthMod.getStrength() == 2)
			{
				strengthMod.setStrength(strengthMod.getStrength()-4);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with -4 modifier: "+ strengthMod.getStrength());
			}
			
			else if(strengthMod.getStrength() == 1)
			{
				strengthMod.setStrength(strengthMod.getStrength()-5);
				JOptionPane.showMessageDialog(
						frame,
						"Strength with -5 modifier: "+ strengthMod.getStrength());
			}
		}
			
		for(Character intelligenceMod: stats) //Intelligence Modifier
		{
			if(intelligenceMod.getIntelligence() == 20)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()+5);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with +5 modifier: "+ intelligenceMod.getIntelligence());
			}
			
			else if(intelligenceMod.getIntelligence() == 19 || intelligenceMod.getIntelligence() == 18)
			{
			intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()+4);
			JOptionPane.showMessageDialog(
					frame,
					"Intelligence with +4 modifier: "+ intelligenceMod.getIntelligence());
			}
			
			else if(intelligenceMod.getIntelligence() == 17 || intelligenceMod.getIntelligence() == 16)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()+3);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with +3 modifier: "+ intelligenceMod.getIntelligence());
			}
				
			else if(intelligenceMod.getIntelligence() == 15 || intelligenceMod.getIntelligence() == 14)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()+2);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with +2 modifier: "+ intelligenceMod.getIntelligence());
			}
				
			else if(intelligenceMod.getIntelligence() == 13 || intelligenceMod.getIntelligence() == 12)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()+1);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with +1 modifier: "+ intelligenceMod.getIntelligence());
			}
			
			else if(intelligenceMod.getIntelligence() == 11 || intelligenceMod.getIntelligence() == 10)
			{
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with 0 modifier: "+ intelligenceMod.getIntelligence());
			}
				
			else if(intelligenceMod.getIntelligence() == 9 || intelligenceMod.getIntelligence() == 8)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()-1);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with -1 modifier: "+ intelligenceMod.getIntelligence());
			}
			
			else if(intelligenceMod.getIntelligence() == 7 || intelligenceMod.getIntelligence() == 6)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()-2);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with -2 modifier: "+ intelligenceMod.getIntelligence());
			}
		
			else if(intelligenceMod.getIntelligence() == 5 || intelligenceMod.getIntelligence() == 4)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()-3);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with -3 modifier:"+ intelligenceMod.getIntelligence());				
			}
			else if(intelligenceMod.getIntelligence() == 3 || intelligenceMod.getIntelligence() == 2)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()-4);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with -4 modifier:"+ intelligenceMod.getIntelligence());				
			}
			else if(intelligenceMod.getIntelligence() == 1)
			{
				intelligenceMod.setIntelligence(intelligenceMod.getIntelligence()-5);
				JOptionPane.showMessageDialog(
						frame,
						"Intelligence with -5 modifier:"+ intelligenceMod.getIntelligence());				
			}
		}
		
		for(Character dexterityMod: stats) //Dexterity Modifier
		{
			if(dexterityMod.getDexterity() == 20)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()+5);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with +5 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 19 || dexterityMod.getDexterity() == 18)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()+4);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with +4 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 17 || dexterityMod.getDexterity() == 16)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()+3);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with +3 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 15 || dexterityMod.getDexterity() == 14)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()+2);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with +2 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 13 || dexterityMod.getDexterity() == 12)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()+1);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with +1 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 11 || dexterityMod.getDexterity() == 10)
			{
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with 0 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 9 || dexterityMod.getDexterity() == 8)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()-1);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with -1 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 7 || dexterityMod.getDexterity() == 6)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()-2);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with -2 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 5 || dexterityMod.getDexterity() == 4)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()-3);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with -3 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 2 || dexterityMod.getDexterity() == 3)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()-4);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with -4 modifier: "+ dexterityMod.getDexterity());
			}
			
			else if(dexterityMod.getDexterity() == 1)
			{
				dexterityMod.setDexterity(dexterityMod.getDexterity()-5);
				JOptionPane.showMessageDialog(
						frame,
						"Dexterity with -5 modifier: "+ dexterityMod.getDexterity());
			}
		}	
		
		for(Character wisdomMod: stats) //Wisdom Modifier
		{
			if(wisdomMod.getWisdom() == 20)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()+5);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with +5 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 19 || wisdomMod.getWisdom() == 18)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()+4);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with +4 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 17 || wisdomMod.getWisdom() == 16)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()+3);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with +3 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 15 || wisdomMod.getWisdom() == 14)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()+2);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with +2 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 13 || wisdomMod.getWisdom() == 12)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()+1);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with +1 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 10 || wisdomMod.getWisdom() == 11)
			{
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with 0 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 9 || wisdomMod.getWisdom() == 8)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()-1);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with -1 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 7 || wisdomMod.getWisdom() == 6)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()-2);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with -2 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 5 || wisdomMod.getWisdom() == 4)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()-3);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with -3 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 3 || wisdomMod.getWisdom() == 2)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()-4);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with -4 modifier: "+ wisdomMod.getWisdom());
			}
			
			else if(wisdomMod.getWisdom() == 1)
			{
				wisdomMod.setWisdom(wisdomMod.getWisdom()-5);
				JOptionPane.showMessageDialog(
						frame,
						"Wisdom with -5 modifier: "+ wisdomMod.getWisdom());
			}
		}
		for(Character charismaMod: stats) //Charisma Modifier
		{
			if(charismaMod.getCharisma() == 20)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()+5);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with +5 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 19 || charismaMod.getCharisma() == 18)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()+4);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with +4 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 17 || charismaMod.getCharisma() == 16)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()+3);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with +3 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 15 || charismaMod.getCharisma() == 14)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()+2);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with +2 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 13 || charismaMod.getCharisma() == 12)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()+1);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with +1 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 11 || charismaMod.getCharisma() == 10)
			{
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with 0 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 9 || charismaMod.getCharisma() == 8)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()-1);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with -1 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 7 || charismaMod.getCharisma() == 6)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()-2);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with -2 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 5 || charismaMod.getCharisma() == 4)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()-3);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with -3 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 3 || charismaMod.getCharisma() == 2)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()-4);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with -4 modifier: "+ charismaMod.getCharisma());
			}
			
			else if(charismaMod.getCharisma() == 1)
			{
				charismaMod.setCharisma(charismaMod.getCharisma()-5);
				JOptionPane.showMessageDialog(
						frame,
						"Charisma with -5 modifier: "+ charismaMod.getCharisma());
			}
		}	
		
		for(Character constitutionMod: stats) //Constitution Modifier
		{	
			if(constitutionMod.getConstitution() == 20)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()+5);
				JOptionPane.showMessageDialog(
						frame,
						"Constitution with +5 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 19 || constitutionMod.getConstitution() == 18)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()+4);
				System.out.println("Constitution with +4 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 17 || constitutionMod.getConstitution() == 16)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()+3);
				System.out.println("Constitution with +3 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 15 || constitutionMod.getConstitution() == 14)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()+2);
				System.out.println("Constitution with +2 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 13 || constitutionMod.getConstitution() == 12)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()+1);
				System.out.println("Constitution with +1 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 11 || constitutionMod.getConstitution() == 10)
			{
				System.out.println("Constitution with 0 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 9 || constitutionMod.getConstitution() == 8)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()-1);
				System.out.println("Constitution with -1 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 7 || constitutionMod.getConstitution() == 6)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()-2);
				System.out.println("Constitution with -2 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 5 || constitutionMod.getConstitution() == 4)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()-3);
				System.out.println("Constitution with -3 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 3 || constitutionMod.getConstitution() == 2)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()-4);
				System.out.println("Constitution with -4 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
			
			else if(constitutionMod.getConstitution() == 1)
			{
				constitutionMod.setConstitution(constitutionMod.getConstitution()-5);
				System.out.println("Constitution with -5 modifier: "+ constitutionMod.getConstitution() + "\n");
			}
		}	
	}
}
