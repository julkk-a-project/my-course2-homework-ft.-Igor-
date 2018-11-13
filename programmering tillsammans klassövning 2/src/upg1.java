import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class upg1 {
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public static void main(String[] args) {
		int compTal = getRandomNumberInRange(0, 9);
		String playerString = JOptionPane.showInputDialog("What do you think the computer chose?\nhe chose a number between 0 and 9.");
		int playerInt = Integer.parseInt(playerString);
	 	
		List<Integer> l=new ArrayList<Integer>();
		l.add(playerInt);
		while (playerInt != compTal) {
			playerString = JOptionPane.showInputDialog("You guessed wrong. try again. it's still a number between 0 and 9.");
			playerInt = Integer.parseInt(playerString);
			l.add(playerInt);
		}
		JOptionPane.showMessageDialog(null, "You guessed correctly!\nit was "+compTal+"\nyou tried to guess: "+l, "Heyyy!!!", 1);

	}

}
