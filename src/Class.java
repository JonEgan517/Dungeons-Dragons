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
					System.out.println("You choose to be a Barbarian your Hit Points: " + barbarian.getHitPoints() + "\n"); 
				}
				break;
			case 2: //Bard
				for(Character bard: stats)
				{
					bard.setHitPoints(bard.getHitPoints() + bard.getConstitution()+8);
					System.out.println("You choose to be a Bard your Hit Points: " + bard.getHitPoints() + "\n");
				}
				break;
			case 3: //Cleric
				for(Character cleric: stats)
				{
					cleric.setHitPoints(cleric.getHitPoints() + cleric.getConstitution()+8);
					System.out.println("You choose to be a Cleric your Hit Points: " + cleric.getHitPoints() + "\n");
				}
				break;
			case 4: //Druid
				for(Character druid: stats)
				{
					druid.setHitPoints(druid.getHitPoints() + druid.getConstitution()+8);
					System.out.println("You choose to be a Druid your Hit Points: " + druid.getHitPoints() + "\n");
				}
				break;
			case 5: //Fighter
				for(Character fighter: stats)
				{
					fighter.setHitPoints(fighter.getHitPoints() + fighter.getConstitution()+10);
					System.out.println("You choose to be a Fighter your Hit Points: " + fighter.getHitPoints() + "\n");
				}
				break;
			case 6: //Monk
				for(Character monk: stats)
				{
					monk.setHitPoints(monk.getHitPoints() + monk.getConstitution()+8);
					System.out.println("You choose to be a Monk your Hit Points: " + monk.getHitPoints() + "\n");
				}
				break;
			case 7: //Paladin
				for(Character paladin: stats)
				{
					paladin.setHitPoints(paladin.getHitPoints() + paladin.getConstitution()+10);
					System.out.println("You choose to be a Paladin your Hit Points: " + paladin.getHitPoints() + "\n");
				}
				break;
			case 8: //Ranger
				for(Character ranger: stats)
				{
					ranger.setHitPoints(ranger.getHitPoints() + ranger.getConstitution()+10);
					System.out.println("You choose to be a Ranger your Hit Points: " + ranger.getHitPoints() + "\n");
				}
				break;
			case 9: //Rouge
				for(Character rouge: stats)
				{
					rouge.setHitPoints(rouge.getHitPoints() + rouge.getConstitution()+8);
					System.out.println("You choose to be a Rouge your Hit Points: " + rouge.getHitPoints() + "\n");
				}
				break;
			case 10: //Sorcerer
				for(Character sorcerer: stats)
				{
					sorcerer.setHitPoints(sorcerer.getHitPoints() + sorcerer.getConstitution()+6);
					System.out.println("You choose to be a Sorcerer your Hit Points: " + sorcerer.getHitPoints() + "\n");
				}
				break;
			case 11: //Warlock
				for(Character warlock: stats)
				{
					warlock.setHitPoints(warlock.getHitPoints() + warlock.getConstitution()+8);
					System.out.println("You choose to be a Warlock your Hit Points: " + warlock.getHitPoints() + "\n");
				}
				break;
			case 12: //Wizard
				for(Character wizard: stats)
				{
					wizard.setHitPoints(wizard.getHitPoints() + wizard.getConstitution()+6);
					System.out.println("You choose to be a Wizard your Hit Points: " + wizard.getHitPoints() + "\n");
				}
				break;
		}
	}
}
