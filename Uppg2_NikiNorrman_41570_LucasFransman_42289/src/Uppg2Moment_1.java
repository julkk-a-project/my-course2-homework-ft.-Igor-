import javax.swing.JOptionPane;

public class Uppg2Moment_1 {

	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);
		int amount = Integer.parseInt(SInt);
		return amount;
	}
	
	public static void main(String[] args) {
		int compChoise = (int)(Math.random() * 10 + 1);
		int playerChoise = getInt("What do you think the computer chose?\nhint: it's something between 1 and 10!");
		while (playerChoise != compChoise) {
			playerChoise = getInt("Haahaa! wrong. try again!");
		}
		JOptionPane.showMessageDialog(null, "Correct! the anserw was "+compChoise+"!", "Yass", 1);

	}

}
