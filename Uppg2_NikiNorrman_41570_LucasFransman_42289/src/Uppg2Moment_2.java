import java.util.Random;

import javax.swing.JOptionPane;

public class Uppg2Moment_2 {

	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);
		int amount = Integer.parseInt(SInt);
		return amount;
	}
	
	public static void main(String[] args) {
		int compChoise = (int)(Math.random() * 10 + 1);
		int playerChoise = getInt("Chose a number that you want the computer to guess!\nhint: the computer will only guess numbers from 1 to 10 :))))");
		String playerClaim = "!";
		while (!playerClaim.equals("=")) {
			playerClaim = "!";
			System.out.println(playerClaim);
			while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) {
				playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nWas it >, < or = your choise?");
			}
			System.out.println("lol");
			if (playerClaim.equals(">")) {
				System.out.println("lollol");
				compChoise = (int)(Math.random() * (10 - compChoise)) + compChoise+1;
			}
			else if (playerClaim.equals("<")) {
				compChoise = (int)(Math.random() * (compChoise - 1)) + 1;
			}
			else if (playerClaim.equals("=")) {
				JOptionPane.showMessageDialog(null, "computer: 'Yay! i am good at this game!!!\nYour original number was "+playerChoise+" and you let the computer win by it saying "+compChoise+".", "Winrar", 1);
			}
		}
		JOptionPane.showMessageDialog(null, "Correct! the anserw was "+compChoise+"!", "Yass", 1);

	}
}
