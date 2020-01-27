import java.util.ArrayList;
import java.util.Scanner;

public class Class 
{
	public static void pickClass(ArrayList<Character> stats)
	{
		Scanner intInput = new Scanner(System.in);
		System.out.println("What class would you like to play as?"
		+ "\n1. Barbarian\n2. Bard\n3. Cleric\n4. Druid\n5. Fighter\n6. Monk"
		+ "\n7. Paladin\n8. Ranger\n9. Rogue\n10. Sorcerer\n11. Warlock\n12. Wizard\n");
		int classes = intInput.nextInt();
		
		switch(classes) //Choosing your Class
		{
			case 1: //Barbarian
				for(Character barbarian: stats)
				{
					barbarian.setHitPoints(barbarian.getHitPoints() + barbarian.getConstitution()+12);
					System.out.println("You choose to be a Barbarian here are your Hit Points: " + barbarian.getHitPoints());
					System.out.println("Your hit die is d12.\n");
				}
				break;
			case 2: //Bard
				for(Character bard: stats)
				{
					bard.setHitPoints(bard.getHitPoints() + bard.getConstitution()+8);
					System.out.println("You choose to be a Bard here are your Hit Points: " + bard.getHitPoints());
					System.out.println("Your hit die is d8.\n");
				}
				break;
			case 3: //Cleric
				for(Character cleric: stats)
				{
					cleric.setHitPoints(cleric.getHitPoints() + cleric.getConstitution()+8);
					System.out.println("You choose to be a Cleric here are your Hit Points: " + cleric.getHitPoints());
					System.out.println("Your hit die is d8.\n");
				}
				break;
			case 4: //Druid
				for(Character druid: stats)
				{
					druid.setHitPoints(druid.getHitPoints() + druid.getConstitution()+8);
					System.out.println("You choose to be a Druid here are your Hit Points: " + druid.getHitPoints());
					System.out.println("Your hit die is d8.\n");
				}
				break;
			case 5: //Fighter
				for(Character fighter: stats)
				{
					fighter.setHitPoints(fighter.getHitPoints() + fighter.getConstitution()+10);
					System.out.println("You choose to be a Fighter here are your Hit Points: " + fighter.getHitPoints());
					System.out.println("Your hit die is d10.\n");
				}
				break;
			case 6: //Monk
				for(Character monk: stats)
				{
					monk.setHitPoints(monk.getHitPoints() + monk.getConstitution()+8);
					System.out.println("You choose to be a Monk here are your Hit Points: " + monk.getHitPoints());
					System.out.println("Your hit die is d8.\n");
				}
				break;
			case 7: //Paladin
				for(Character paladin: stats)
				{
					paladin.setHitPoints(paladin.getHitPoints() + paladin.getConstitution()+10);
					System.out.println("You choose to be a Paladin here are your Hit Points: " + paladin.getHitPoints());
					System.out.println("Your hit die is d10.\n");
				}
				break;
			case 8: //Ranger
				for(Character ranger: stats)
				{
					ranger.setHitPoints(ranger.getHitPoints() + ranger.getConstitution()+10);
					System.out.println("You choose to be a Ranger here are your Hit Points: " + ranger.getHitPoints());
					System.out.println("Your hit die is d10.\n");
				}
				break;
			case 9: //Rouge
				for(Character rouge: stats)
				{
					rouge.setHitPoints(rouge.getHitPoints() + rouge.getConstitution()+8);
					System.out.println("You choose to be a Rouge here are your Hit Points: " + rouge.getHitPoints());
					System.out.println("Your hit die is d8.\n");
				}
				break;
			case 10: //Sorcerer
				for(Character sorcerer: stats)
				{
					sorcerer.setHitPoints(sorcerer.getHitPoints() + sorcerer.getConstitution()+6);
					System.out.println("You choose to be a Sorcerer here are your Hit Points: " + sorcerer.getHitPoints());
					System.out.println("Your hit die is d6.\n");
				}
				break;
			case 11: //Warlock
				for(Character warlock: stats)
				{
					warlock.setHitPoints(warlock.getHitPoints() + warlock.getConstitution()+8);
					System.out.println("You choose to be a Warlock here are your Hit Points: " + warlock.getHitPoints());
					System.out.println("Your hit die is d8.\n");
				}
				break;
			case 12: //Wizard
				for(Character wizard: stats)
				{
					wizard.setHitPoints(wizard.getHitPoints() + wizard.getConstitution()+6);
					System.out.println("You choose to be a Wizard here are your Hit Points: " + wizard.getHitPoints());
					System.out.println("Your hit die is d6.\n");
				}
				break;
		}
	}
}
