import javax.swing.JOptionPane;

public class upg3 {

	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);
		int amount = Integer.parseInt(SInt);
		return amount;
	}
	
	public static void main(String[] args) {
		int amount = getInt("How many people do you want to sort?");
		String [] nameArray = new String[amount];
		int [] ageArray = new int[amount];
		for (int i=0;i<amount;i++) {
			nameArray[i] = JOptionPane.showInputDialog("Name number "+(i+1));
			ageArray[i] = getInt("Age number "+(i+1));
			System.out.println(ageArray[i]);
		}
		System.out.println(nameArray);
		System.out.println(ageArray);

	}

}
