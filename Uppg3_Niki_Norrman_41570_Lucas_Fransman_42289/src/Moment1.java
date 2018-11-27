

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

public class Moment1 {

	public static void main(String[] args) {
		int playCounter = 0;
		int winCounter = 0;
		int lostCounter = 0;
		int choice = playing("Do you wanna play?\nType Y if yes or N if no.");
		while (choice == 1) {
			playCounter++;
			String word = getWord();
			int compare = hangMan(word);
			if (compare == 1) {
				winCounter++;
			} else if (compare == 0) {
				lostCounter++;
			}
			choice = playing("Do you wanna play again?\nType Y if yes or N if no.");
			}
			getOutput(playCounter, winCounter, lostCounter);
		}
	
	private static int playing(String question) {
		String play = "";
		try {
			play = JOptionPane.showInputDialog(question);
			if (!play.equals("y") && !play.equals("Y") && !play.equals("n") && !play.equals("N")) {
				int z = 1 / 0;	
			}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Type Y or N.");
				playing(question);
			}
		if (play.equals("y") || play.equals("Y") ) {
			return 1;
		} else {
			return 0;
		}
	}

	private static void getOutput(int times, int win ,int lost) {
		JOptionPane.showMessageDialog(null, "You played " + times + " x.\nYou won " + win + " x.\nYou lost " + lost + " x.");
	}

	private static int hangMan(String correct) {
		String list = "";
		for(int i = 0; i < correct.length(); i++) {
			list += "-";
		}
		
		list.toCharArray();
		int counter = 7;
		int checker = 0;
		while (counter > 0) {
		
			checker = 0;	
			String guess = getUserGuess(counter);
			
			for (int i = 0; i < correct.length(); i++) {
				
				String correctChar = Character.toString(correct.charAt(i));
				
				if (guess.equals(correctChar)) {
					
					checker = 1;
					
					for (int i1 = 0; i1 < list.length(); i1++) {
						char replaceChar = correctChar.charAt(0);
						char[] newList = list.toCharArray();
						newList[i] = replaceChar;
						list = new String(newList);
					}
				} 
				if (list.contains("-") == false) {
					JOptionPane.showMessageDialog(null, "Well done " + correct + " is the right word.");
					return 1;
				}
			}
			JOptionPane.showMessageDialog(null, list);
			if (checker == 0) {
			counter--;
			}
			if (counter <= 0) {
				JOptionPane.showMessageDialog(null, "You lost.\nRight word: " + correct + ".");
				return 0;
		}
			if (list.contains("-") == false) {
				return 1;
			}
		}
		return 2;
	}
	private static String getUserGuess(int x) {
		String letter = "";
		
		try {
			if (x == 1) {
			letter = JOptionPane.showInputDialog("Input letter\nYou have " + x + " guess left.").toLowerCase();
			} else {
				letter = JOptionPane.showInputDialog("Input letter\nYou have " + x + " guesses left.").toLowerCase();
			}
		if (letter.length() != 1 || letter.equals("1") || letter.equals("2") || letter.equals("3") || letter.equals("4") || letter.equals("5") || letter.equals("6") || letter.equals("7") || letter.equals("8") || letter.equals("9")) {
			int z = 1 / 0;
		} 
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Input only one letter, no numbers etc.");
			getUserGuess(x);
		}
		return letter;
		}
		
	
	
	public static String getWord() {
		ArrayList <String> list = new ArrayList <> ();
		try {
			FileInputStream x = new FileInputStream("words.txt");
			BufferedReader y = new BufferedReader(new InputStreamReader(x));
		 
		
		String word;
		while((word = y.readLine())!= null) {
			list.add(word);
		}
		y.close();
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
		String finalWord = list.get((int) (Math.random() * 465) + 1);
		return finalWord;
	}
}
