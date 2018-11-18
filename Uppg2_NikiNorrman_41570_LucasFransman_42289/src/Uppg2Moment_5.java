
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Uppg2Moment_5 {
	
		private static int[] getLottoRad() {
			
			 int[] numbers = new int[7];
			 ArrayList<Integer> list = new ArrayList<Integer>();
		        for (int i=1; i < 40; i++) {
		            list.add(new Integer(i));
		        }
		        Collections.shuffle(list);
		        for (int i=0; i < 7; i++) {
		            numbers[i] = list.get(i);
		        }
		        return numbers;
		    	}
		
		private static int[] getUserRad() {
			int[] numbers = new int[7];
			for (int i = 0; i < numbers.length; i++) {
				try {
				numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Give 7 numbers from 1-39.\nnumber " + i + "."));
				if (numbers[i] < 1 || numbers[i] > 39)
					try {
						int exception = 1 / 0;
					}
				catch (Exception e) {
					 JOptionPane.showMessageDialog(null, "Give a number between 1-39.");
				 }
				}
				 catch (Exception e) {
					 JOptionPane.showMessageDialog(null, "Give only integers.");
				 }
			}
			return numbers;
		}
		private static ArrayList <Integer> compare(int[] real, int[] guess) {
			ArrayList <Integer> right = new ArrayList <Integer>();
			for (int num : guess) {
				for (int i = 0; i < real.length; i++) {
					if (real[i] == num) {
						right.add(num);
					}
				}
			}
			return right;
			}
		
		private static String getOutput(ArrayList <Integer> compare) {
			String right = "";
			for (int i : compare) {
				right += Integer.toString(i) + " ";
			}
			return right;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] lottoRad = getLottoRad();
			int counter = 0;
			while (true) {
				counter ++;
				int[] userRad = getUserRad();
				ArrayList <Integer> compare = compare(lottoRad, userRad);
				String output = getOutput(compare);
				JOptionPane.showMessageDialog(null, "You've got " + compare.size() + " right.\n" + "Correct numbers: " + output);
				if (compare.size() == 7) {
					break;
				}
				
			}
			if (counter == 1) {
				JOptionPane.showMessageDialog(null, "You've guessed " + counter + " time.\nCorrect numbers: " + Arrays.toString(lottoRad).replace("[", "").replace("]", ""));
			}
			else {
			JOptionPane.showMessageDialog(null, "You've guessed " + counter + " times.\nCorrect numbers: " + Arrays.toString(lottoRad).replace("[", "").replace("]", ""));
			}
			}
		}




