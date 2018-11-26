import javax.swing.JOptionPane;

public class Uppg2Moment_3 {

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
		public static int minihandler(int x, int mini) { //prevents mini from becoming smaller it was before.
			if (x > mini) {
				return x;
			} else {
				return mini;
			}
		}
		public static int maxihandler(int x, int maxi) { //prevents maxi becoming larger than it was before.
			if (x < maxi) {
				return x;
			} else {
				return maxi;
			}
		}
		
		public static void main(String[] args) {
			int compChoise = 5; //initial guess is 5, to minimise total amount of guesses
			int playerChoise = getInt("Chose a number between 1 and 10 that you want the computer to guess!"); //Flavour text. just cosmetic, to make the player feel better about this little game.
			int mini = 1;
			int maxi = 11;
			int times = 0;
			String playerClaim = "!";
			while (!playerClaim.equals("=")) {
				playerClaim = "!"; //to reset variable playerClaim.
				while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) { //Require user to type correctly.
					playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nIs "+compChoise+" <, > or = your choise?");
				}
				times ++;
				if (playerClaim.equals("<")) {
					mini = minihandler(compChoise, mini);
					compChoise = (mini+maxi)/2; //takes average (int) of mini and maxi.
				}
				else if (playerClaim.equals(">")) {
					maxi = maxihandler(compChoise, maxi);
					compChoise = (maxi+mini)/2; //takes average (int) of mini and maxi.
				}
				else if (playerClaim.equals("=")) {
					JOptionPane.showMessageDialog(null, "computer: 'Yay! i am good at this game!!!\n\nYour original number was "+playerChoise+
														" and you let the computer win by it saying "+compChoise+
														".\nThis took the computer "+times+" tries.", "Winrar", 1);
				}
			}
		}

}
