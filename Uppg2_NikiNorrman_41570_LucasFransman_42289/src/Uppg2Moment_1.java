import javax.swing.JOptionPane;

public class Uppg2Moment_1 {

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
		int playerChoise = getInt("What do you think the computer chose?\nhint: it's something between 1 and 10!");
		int times = 0;
		while (playerChoise != compChoise) {
			playerChoise = getInt("Haahaa! wrong. try again!");
			times ++;
		}
		JOptionPane.showMessageDialog(null, "Correct! the anserw was "+compChoise+"!\ntook only as many guesses as "+times, "Yass", 1);

	}

}
