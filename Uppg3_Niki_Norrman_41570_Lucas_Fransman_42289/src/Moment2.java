
import javax.swing.JOptionPane;

public class Moment2 {

	public static void main(String[] args) {
		String[][] array = fillArray();
		display(array);

	}

	private static void display(String[][] array) {
		String finalStr = "";
		for (int rad = 0; rad < array.length; rad++) {
			for (int col = 0; col < array[rad].length; col++) {
				finalStr += array[rad][col] + "       ";
			}
			finalStr += "\n";
		}
		JOptionPane.showMessageDialog(null,finalStr.replaceAll("null", ""), "Namn och Socialsignum", 1);
	}

	private static String [][] fillArray() {
		String[][] nameArray = new String[5][2];
		for (int i = 0; i < 5; i++) {
			String name = getNameAndSoc();
			if (name == null) {
				break;
			}
			try {
				String[] parts = name.split(",");
				String part1 = parts[0]; 
				String part2 = parts[1];
				for (int i1 = 0; i1 < 5; i1++) {
					nameArray[i][0] = part1;
					nameArray[i][1] = part2;
				} 
			} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Check input.");
					i--;
				}
				}
				return nameArray;
			}
		
	

	private static String getNameAndSoc() {
		String nameAndSoc = "Error";
		try {
			nameAndSoc =  JOptionPane.showInputDialog("Skriv in namn och socialsignum separerat med , tecken  \nex. Kalle Karlsson, 280295367H");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Check input.");
			getNameAndSoc();
		}
		return nameAndSoc;
	}

}
