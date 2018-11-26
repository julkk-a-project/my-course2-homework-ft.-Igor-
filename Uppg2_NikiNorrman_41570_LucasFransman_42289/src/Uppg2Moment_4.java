import javax.swing.JOptionPane;

//Om koden ser bekant ut beror det på att jag har funderad tillsammans med nån annan på denna moment.


public class Uppg2Moment_4 {

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
		public static int minihandler(int x, int mini) { //handels how mini variable is changed.
			if (mini == x) {
				return mini;
			}
			if (x > mini) {
				return x;
			} else {
				return -1; //-1 leads to break
			}
		}
		public static int maxihandler(int x, int maxi) { //handels how maxi variable is changed.
			if (maxi == x) {
				return maxi;
			}
			if (x < maxi) {
				return x;
			} else {
				return -1; //-1 leads to break
			}
		}
		public static boolean testMinMax(int mini, int maxi) { //if returns true, loop ends.
			if (maxi == 1) {
				return true; //when user says the number is smaller than 1, then we know he's lying
			}
			else if ((maxi - mini) <= 1) {
				return true; //if say the number is smaller than 3 and larger than 4, and it has to be an integer, then there are no more options.
			}
			if ((maxi-mini) <= 1) {
				return true; //if say the number is smaller than 3 and larger than 4, and it has to be an integer, then there are no more options.
			} else {
				return false; //...else, user is not cheating.
			}
		}
		
		public static void main(String[] args) {
			boolean breaker = false; //used to break the loop if a cheat is noticed.
			int times = 0; //used to count amount of guesses
			int compChoise = (int)(Math.random() * 10 + 1); //initial computer guess
			int playerChoise = getInt("Chose a number between 1 and 10 that you want the computer to guess!\n(This number is just to see if you remember what you originally picked.)"); //flavour text. no "real" function, appart from the number at the end to show if you actually remembered your own number.
			String playerClaim = "!";
			//mini and maxi have to be offset by one, so that the computer can guess 1 or 10, w/o claiming cheating. (could have also dealt with this in mini/maxi handler, but this method is lighter on computer resources.)
			int mini = 0;
			int maxi = 11; 
			while (!playerClaim.equals("=") && !breaker == true) { //loop until user says computer is right, or computer says user is cheating.
				playerClaim = "!"; //to reset variable playerClaim.
				while (!playerClaim.equals("<") && !playerClaim.equals(">") && !playerClaim.equals("=")) { //Require user to type correctly.
					playerClaim = JOptionPane.showInputDialog("The computer guessed "+compChoise+".\nWas it <, > or = your choise?");
				}
				times ++;
				if (playerClaim.equals("<")) { //handles < event.
					mini = minihandler(compChoise, mini);
					if (mini == maxi) {
						break;
					}
					if (mini == -1) { //so minihandler can break loop
						break;
					}
					compChoise = (int) (Math.random()*(maxi-mini-1) + mini+1);
					
				}
				else if (playerClaim.equals(">")) { //handles > event.
					maxi = maxihandler(compChoise, maxi);
					if (maxi == -1) { //so maxihandler can break loop
						break;
					}
					compChoise = (int) (Math.random()*(maxi-mini-1) + mini+1);
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
  