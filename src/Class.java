import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Class 
{
	public static void pickClass(ArrayList<Character> stats)
	{
		int classes = 0;
		JFrame frame = new JFrame();
		
		Object[] classChoice = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer" , "Warlock", "Wizard"};
		classes = JOptionPane.showOptionDialog(frame,
				"What class would you like to play as?",
				"Your Class",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, classChoice, classChoice[5]);
		
		switch(classes) //Choosing your Class
		{
			case 0: //Barbarian
				for(Character barbarian: stats)
				{
					barbarian.setHitPoints(barbarian.getHitPoints() + barbarian.getConstitution()+12);
					ImageIcon BarbIcon = new ImageIcon(("Barb.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Barbarian here are your Hit Points: " + barbarian.getHitPoints()
							,"Barbarian",
							JOptionPane.QUESTION_MESSAGE,
							BarbIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d12.\n");
				}
				break;
			case 1: //Bard
				for(Character bard: stats)
				{
					bard.setHitPoints(bard.getHitPoints() + bard.getConstitution()+8);
					ImageIcon BardIcon = new ImageIcon(("Bard.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Bard here are your Hit Points: " + bard.getHitPoints()
							,"Bard",
							JOptionPane.QUESTION_MESSAGE,
							BardIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d8.\n");
				}
				break;
			case 2: //Cleric
				for(Character cleric: stats)
				{
					cleric.setHitPoints(cleric.getHitPoints() + cleric.getConstitution()+8);
					ImageIcon ClericIcon = new ImageIcon(("Cleric.jpg"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Cleric here are your Hit Points: " + cleric.getHitPoints()
							,"Cleric",
							JOptionPane.QUESTION_MESSAGE,
							ClericIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d8.\n");
				}
				break;
			case 3: //Druid
				for(Character druid: stats)
				{
					druid.setHitPoints(druid.getHitPoints() + druid.getConstitution()+8);
					ImageIcon DruidIcon = new ImageIcon(("Druid.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Druid here are your Hit Points: " + druid.getHitPoints()
							,"Druid",
							JOptionPane.QUESTION_MESSAGE,
							DruidIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d8.\n");
				}
				break;
			case 4: //Fighter
				for(Character fighter: stats)
				{
					fighter.setHitPoints(fighter.getHitPoints() + fighter.getConstitution()+10);
					ImageIcon FighterIcon = new ImageIcon(("Fighter.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Fighter here are your Hit Points: " + fighter.getHitPoints()
							,"Fighter",
							JOptionPane.QUESTION_MESSAGE,
							FighterIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d10.\n");
				}
				break;
			case 5: //Monk
				for(Character monk: stats)
				{
					monk.setHitPoints(monk.getHitPoints() + monk.getConstitution()+8);
					ImageIcon MonkIcon = new ImageIcon(("Monk.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Monk here are your Hit Points: " + monk.getHitPoints()
							,"Monk",
							JOptionPane.QUESTION_MESSAGE,
							MonkIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d8.\n");
				}
				break;
			case 6: //Paladin
				for(Character paladin: stats)
				{
					paladin.setHitPoints(paladin.getHitPoints() + paladin.getConstitution()+10);
					ImageIcon PaladinIcon = new ImageIcon(("Paladin.jpg"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Paladin here are your Hit Points: " + paladin.getHitPoints()
							,"Paladin",
							JOptionPane.QUESTION_MESSAGE,
							PaladinIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d10.\n");
				}
				break;
			case 7: //Ranger
				for(Character ranger: stats)
				{
					ranger.setHitPoints(ranger.getHitPoints() + ranger.getConstitution()+10);
					ImageIcon RangerIcon = new ImageIcon(("Ranger.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Ranger here are your Hit Points: " + ranger.getHitPoints()
							,"Ranger",
							JOptionPane.QUESTION_MESSAGE,
							RangerIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d10.\n");
				}
				break;
			case 8: //Rogue
				for(Character rogue: stats)
				{
					rogue.setHitPoints(rogue.getHitPoints() + rogue.getConstitution()+8);
					ImageIcon RogueIcon = new ImageIcon(("Rogue.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Rogue here are your Hit Points: " + rogue.getHitPoints()
							,"Rogue",
							JOptionPane.QUESTION_MESSAGE,
							RogueIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d8.\n");
				}
				break;
			case 9: //Sorcerer
				for(Character sorcerer: stats)
				{
					sorcerer.setHitPoints(sorcerer.getHitPoints() + sorcerer.getConstitution()+6);
					ImageIcon SorcererIcon = new ImageIcon(("Sorcerer.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Sorcerer here are your Hit Points: " + sorcerer.getHitPoints()
							,"Sorcerer",
							JOptionPane.QUESTION_MESSAGE,
							SorcererIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d6.\n");
				}
				break;
			case 10: //Warlock
				for(Character warlock: stats)
				{
					warlock.setHitPoints(warlock.getHitPoints() + warlock.getConstitution()+8);
					ImageIcon WarlockIcon = new ImageIcon(("Warlock.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Warlock here are your Hit Points: " + warlock.getHitPoints()
							,"Warlock",
							JOptionPane.QUESTION_MESSAGE,
							WarlockIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d8.\n");
				}
				break;
			case 11: //Wizard
				for(Character wizard: stats)
				{
					wizard.setHitPoints(wizard.getHitPoints() + wizard.getConstitution()+6);
					ImageIcon WizIcon = new ImageIcon(("Wizard.png"));
					JOptionPane.showMessageDialog(frame,
							"You choose to be a Wizard here are your Hit Points: " + wizard.getHitPoints()
							,"Wizard",
							JOptionPane.QUESTION_MESSAGE,
							WizIcon);
					JOptionPane.showMessageDialog(frame,
							"Your hit die is d6.\n");
				}
				break;
		}
	}
}
