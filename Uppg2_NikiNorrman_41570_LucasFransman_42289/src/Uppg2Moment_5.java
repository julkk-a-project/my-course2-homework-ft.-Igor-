
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
		        Collections.shuffle(list); // Blandar listan och tar dom 7 f�rsta siffrorna och l�gger dom i numbers
		        for (int i = 0; i < 7; i++) {
		            numbers[i] = list.get(i);
		        }
		        return numbers;
		    	}
		
		private static int[] getUserRad() {
			int[] numbers = new int[7];
			for (int i = 0; i < numbers.length; i++) { // Usern matar in sina 7 siffror
				try { // Ifall usern ger n�got annat �n ett j�mnt heltal
				numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Give 7 numbers from 1-39.\nnumber " + (i+1) + "."));
				if (numbers[i] < 1 || numbers[i] > 39) // Ifall userns input �r mindre �n 1 eller st�rre �n 39
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
		private static ArrayList <Integer> compare(int[] real, int[] guess) { //J�mf�r userns siffror med dom r�tta siffrorna 
			ArrayList <Integer> right = new ArrayList <Integer>();
			for (int num : guess) {
				for (int i = 0; i < real.length; i++) {
					if (real[i] == num) {
						right.add(num);
					}
				}
			}
			return right; // Returnerar en lista med dom siffrorna usern f�tt r�tt
			}
		
		private static String getOutput(ArrayList <Integer> compare) { // G�r userns r�tta gissningar till en str�ng
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
		 * getUserRad() =  Skapar en lista med 7 gissningar fr�n usern
		 * compare() = J�mf�r r�tta listan med userns lista och skapar en lista med dom r�tta gissningarna
		 * getOutput() = Tar listan fr�n compare() och konverterar den till en str�ng
		 *
		 *- While loopen k�rs �nda tills compare listan har 7 element, 
		 *  allts� �nda tills usern har 7 r�tt gissningsar.
		 *
		 *- Varje g�ng loopen k�rs inkrementeras counter med 1 f�r att 
		 *  h�lla reda p� hur m�nga f�rs�k usern beh�vde.
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
			if (counter == 1) { // Ifall usern lyckas f� allt r�tt p� en gissning �ndras outputten till singularis times -> time.
				s = "";
			}
			JOptionPane.showMessageDialog(null, "You've guessed " + counter + " time" + s + ".\nCorrect numbers: " + Arrays.toString(lottoRad).replace("[", "").replace("]", ""));
			}
		}




