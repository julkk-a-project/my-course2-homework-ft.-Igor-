import java.util.Random;

import javax.swing.JOptionPane;

public class Uppg2Moment_2 {

	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);
		int amount = -1;
		try {
			amount = Integer.parseInt(SInt);
		} catch (NumberFormatException ex ) {
			JOptionPane.showMessageDialog(null, "Try an integer...");
			amount = getInt(string);
		}
		if (amount < 1 || amount > 10) {
			JOptionPane.showMessageDialog(null, "Try a value between 1 and 10...");
			return getInt(string);
		} else {
			return amount;
		}
	}
	
	public static void main(String[] args) {
		int compChoise = (int)(Math.random() * 10 + 1);
		int playerChoise = getInt("Chose a number between 1 and 10 that you want the computer to guess!"); //Flavourtext. just cosmetic, to make the player feel better about this little game.
		int times = 0;
		String playerClaim = "!";
		while (!playerClaim.equals("=")) {
			playerClaim = "!";
			while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) {
				playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nWas it <, > or = your choise?");
			}
			times ++;
			if (playerClaim.equals("<")) {
				compChoise = (int)(Math.random() * (10 - compChoise)) + compChoise+1;
			}
			else if (playerClaim.equals(">")) {
				compChoise = (int)(Math.random() * (compChoise - 1)) + 1;
			}
			else if (playerClaim.equals("=")) {
				JOptionPane.showMessageDialog(null, "computer: 'Yay! i am good at this game!!!\nYour original number was "+
													playerChoise+" and you let the computer win by it saying "+compChoise+
													".\nThis took the computer "+times+" tries.", "Winrar", 1);
			}
		}

	}
}
