import javax.swing.JOptionPane;

public class delarejamnt {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("input number");
		double org = Double.parseDouble(input1); 
		for (double cry = org; cry > 0; cry--) {
			if ((org % cry) == 0) {
				System.out.println(cry);
			}
		}

	}

}
