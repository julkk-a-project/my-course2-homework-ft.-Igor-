import java.util.StringJoiner;

import javax.swing.JOptionPane;

public class GratulationsMaskin {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is ur name");
		String gag = JOptionPane.showInputDialog("How many times");
			try {
				int gag2 = Integer.parseInt(gag);
				String gag3 = "";
				for (int i = 0; gag2>i; i++) {
					gag3 += "\nGratulerar "+name;
				};
				JOptionPane.showMessageDialog(null, gag3, "Lol", 1);
			}
			catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Wow, ur dumb, try a number w/o those dots", "ERROR", 0);
			};
	}

}
