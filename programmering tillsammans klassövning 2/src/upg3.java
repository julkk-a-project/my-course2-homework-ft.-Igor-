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
		}
		boolean sorted = false;
		int snortsnort = amount;
		while (sorted == false) {
//			for (int i=0;i<amount;i++) {
//				System.out.println(nameArray[i]+": "+ageArray);
//			}
			for (int i=0;(i+1)<amount;i++) {
//				for (int u=0;u<amount;u++) {
//					System.out.println(nameArray[u]+": "+ageArray[u]);
//				}
				int sortsort = amount;
				if (ageArray[i] > ageArray[i+1]) {
					int intMem = ageArray[i];
					String strMem = nameArray[i];
					ageArray[i] = ageArray[i+1];
					nameArray[i] = nameArray[i+1];
					ageArray[i+1] = intMem;
					nameArray[i+1] = strMem;
					sortsort -= 1;
				}
				snortsnort -= 1;
				if (snortsnort == 0) {
					if (sortsort == amount) {
						sorted = true;
					}
				}
				
			}
		}
		for (int i=0;i<amount;i++) {
			System.out.println(nameArray[i]+": "+ageArray[i]);
		}


	}

}
