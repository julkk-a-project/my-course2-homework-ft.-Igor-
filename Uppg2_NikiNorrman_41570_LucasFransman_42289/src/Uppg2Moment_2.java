import javax.swing.JOptionPane;

public class Uppg2Moment_2 {

	public static int getInt(String string) { //legacy code
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
		int compChoise = (int)(Math.random() * 10 + 1); //first guess
		int playerChoise = getInt("Chose a number between 1 and 10 that you want the computer to guess!"); //Flavourtext. just cosmetic, to make the player feel better about this little game.
		int times = 0; //to count amount of tries.
		String playerClaim = "!";
		while (!playerClaim.equals("=")) {
			playerClaim = "!"; //to reset variable playerClaim.
			while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) { //Require user to type correctly.
				playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nWas it <, > or = your choise?");
			}
			times ++;
			
			//
			// Notice, computer has a very short term memory. it only remembers it's last guess. this could be fixed with a "mini" and "maxi" variable, as i did in §3 and §4.
			// ...but as you said face to face, §2 isn't meant to be effective.
			//
			
			if (playerClaim.equals("<")) { //handels < event
				compChoise = (int)(Math.random() * (10 - compChoise)) + compChoise+1;
			}
			else if (playerClaim.equals(">")) { //handels > event
				compChoise = (int)(Math.random() * (compChoise - 1)) + 1;
			}
			else if (playerClaim.equals("=")) { //handels = event
				JOptionPane.showMessageDialog(null, "computer: 'Yay! i am good at this game!!!\nYour original number was "+
													playerChoise+" and you let the computer win by it saying "+compChoise+
													".\nThis took the computer "+times+" tries.", "Winrar", 1);
			}
		}

	}
}
