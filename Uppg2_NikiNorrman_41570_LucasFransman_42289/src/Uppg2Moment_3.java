import javax.swing.JOptionPane;

public class Uppg2Moment_3 {

		public static int getInt(String string) {
			String SInt = JOptionPane.showInputDialog(string);
			int amount = Integer.parseInt(SInt);
			return amount;
		}
		public static int minihandler(int x, int mini) {
			if (x > mini) {
				return x;
			} else {
				return mini;
			}
		}
		public static int maxihandler(int x, int maxi) {
			if (x < maxi) {
				return x;
			} else {
				return maxi;
			}
		}
		
		public static void main(String[] args) {
			int compChoise = 5;
			int playerChoise = getInt("Chose a number between 1 and 10 that you want the computer to guess!");
			int mini = 1;
			int maxi = 10;
			String playerClaim = "!";
			while (!playerClaim.equals("=")) {
				playerClaim = "!";
				while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) {
					playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nIs "+compChoise+" <, > or = your choise?");
				}
				if (playerClaim.equals("<")) {
					mini = minihandler(compChoise, mini);
					compChoise = (mini+maxi)/2;
				}
				else if (playerClaim.equals(">")) {
					maxi = maxihandler(compChoise, maxi);
					compChoise = (maxi+mini)/2;
				}
				else if (playerClaim.equals("=")) {
					JOptionPane.showMessageDialog(null, "computer: 'Yay! i am good at this game!!!\n\nYour original number was "+playerChoise+" and you let the computer win by it saying "+compChoise+".", "Winrar", 1);
				}
			}
			//JOptionPane.showMessageDialog(null, "Correct! the anserw was "+compChoise+"!", "Yass", 1);
		}

}
