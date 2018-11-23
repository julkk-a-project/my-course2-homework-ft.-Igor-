import javax.swing.JOptionPane;

//Om koden ser bekant ut beror det på att jag har funderad tillsammans med nån annan på denna moment.


public class Uppg2Moment_4 {

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
		public static int minihandler(int x, int mini) {
			if (mini == x) {
				return mini;
			}
			if (x > mini) {
				return x;
			} else {
				return -1;
			}
		}
		public static int maxihandler(int x, int maxi) {
			if (maxi == x) {
				return maxi;
			}
			if (x < maxi) {
				return x;
			} else {
				return -1;
			}
		}
		public static boolean testMinMax(int mini, int maxi) {
			if (maxi == 1) {
				return true;
			}
			else if ((maxi - mini) <= 1) {
				return true;
			}
			if ((maxi-mini) == 1) {
				return true;
			} else {
				return false;
			}
		}
		
		public static void main(String[] args) {
			boolean breaker = false; //used to break the loop if a cheat is noticed.
			int times = 0;
			int compChoise = (int)(Math.random() * 10 + 1);
			int playerChoise = getInt("Chose a number between 1 and 10 that you want the computer to guess!");
			String playerClaim = "!";
			int mini = 0;
			int maxi = 11;
			while (!playerClaim.equals("=") && !breaker == true) { //loop until user says computer is right.
				playerClaim = "!";
				while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) {
					playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nWas it <, > or = your choise?");
				}
				times ++;
				if (playerClaim.equals("<")) {
					mini = minihandler(compChoise, mini);
					while (compChoise == mini) {
						compChoise = (int) (Math.random()*(maxi-mini) + mini);
					}
				}
				else if (playerClaim.equals(">")) {
					maxi = maxihandler(compChoise, maxi);
					compChoise = (int) (Math.random()*(maxi-mini) + mini);
				}
				breaker = testMinMax(mini, maxi);
			}
			if (playerClaim.equals("=")) {
				JOptionPane.showMessageDialog(null, "computer: 'Yay! i am good at this game!!!\nYour original number was "+
						playerChoise+" and you let the computer win by it saying "+compChoise+
						".\nThis took the computer "+times+" tries.", "Winrar", 1);
			}
			else {
				JOptionPane.showMessageDialog(null, "Dirty cheater!");
			}
			

		}

}
  