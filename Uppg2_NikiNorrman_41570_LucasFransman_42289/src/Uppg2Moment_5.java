
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Uppg2Moment_5 {
	
		private static int[] getLottoRad() { 
			
			 int[] numbers = new int[7]; // Skapar en ArrayList med talen 1-39
			 ArrayList<Integer> list = new ArrayList<Integer>();
		        for (int i = 1; i < 40; i++) {
		            list.add(new Integer(i));
		        }
		        Collections.shuffle(list); // Blandar listan och tar dom 7 första siffrorna och lägger dom i numbers
		        for (int i = 0; i < 7; i++) {
		            numbers[i] = list.get(i);
		        }
		        return numbers;
		    	}
		
		private static int[] getUserRad() {
			int[] numbers = new int[7];
			for (int i = 0; i < numbers.length; i++) { // Usern matar in sina 7 siffror
				try { // Ifall usern ger något annat än ett jämnt heltal
				numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Give 7 numbers from 1-39.\nnumber " + (i+1) + "."));
				if (numbers[i] < 1 || numbers[i] > 39) // Ifall userns input är mindre än 1 eller större än 39
					try {
						int exception = 1 / 0; //skapar en error
					} catch (Exception e) {
					 JOptionPane.showMessageDialog(null, "Give a number between 1-39.");
					 i -= 1;
					}
				} catch (Exception e) {
					 JOptionPane.showMessageDialog(null, "Give only integers.");
					 i -= 1;
				 }
			}
			return numbers;
		}
		private static ArrayList <Integer> compare(int[] real, int[] guess) { //Jämför userns siffror med dom rätta siffrorna 
			ArrayList <Integer> right = new ArrayList <Integer>();
			for (int num : guess) {
				for (int i = 0; i < real.length; i++) {
					if (real[i] == num) {
						right.add(num);
					}
				}
			}
			return right; // Returnerar en lista med dom siffrorna usern fått rätt
			}
		
		private static String getOutput(ArrayList <Integer> compare) { // Gör userns rätta gissningar till en sträng
			String rightStr = "";
			for (int i : compare) {
				rightStr += Integer.toString(i) + " ";
			}
			return rightStr;
		}
		/*
		 * Main()
		 * 
		 * getLottoRad() = Skapar en lista med 7 unika siffror mellan 1-39
		 * getUserRad() =  Skapar en lista med 7 gissningar från usern
		 * compare() = Jämför rätta listan med userns lista och skapar en lista med dom rätta gissningarna
		 * getOutput() = Tar listan från compare() och konverterar den till en sträng
		 *
		 *- While loopen körs ända tills compare listan har 7 element, 
		 *  alltså ända tills usern har 7 rätt gissningsar.
		 *
		 *- Varje gång loopen körs inkrementeras counter med 1 för att 
		 *  hålla reda på hur många försök usern behövde.
		 * 
		 */

		public static void main(String[] args) {
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
			String s = "s";
			if (counter == 1) { // Ifall usern lyckas få allt rätt på en gissning ändras outputten till singularis times -> time.
				s = "";
			}
			JOptionPane.showMessageDialog(null, "You've guessed " + counter + " time" + s + ".\nCorrect numbers: " + Arrays.toString(lottoRad).replace("[", "").replace("]", ""));
			}
		}




