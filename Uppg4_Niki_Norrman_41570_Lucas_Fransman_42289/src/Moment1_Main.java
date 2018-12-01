import javax.swing.JOptionPane;

public class Moment1_Main {



	
	public static void main(String[] args) {
		AbstractFordon[] fordonar = new AbstractFordon[10];
		AbstractFordon fordonlol = new Fordon("Pappaman","Pappa");
		fordonar[0] = fordonlol;
		int max = getInt("how many cars do you want to register? (max 10);");
		for (int i = 0; i < max; i++) {
			itemAdder(fordonar, i);
		}
		itemReader(fordonar, max);
	}
	
	public static AbstractFordon[] itemAdder(AbstractFordon[] fordonar, int i) {
		AbstractFordon newItem = createItem();
		fordonar[i] = newItem;
		return fordonar;
	}
	
	public static AbstractFordon createItem(){
		//create cars n' shieet here
		AbstractFordon fordonlol = new Fordon("Pappaman","Pappa");
		return fordonlol;
	}
	
	public static void itemReader(AbstractFordon[] fordonar, int max) {
		String buf = "";
		String carBuf = "";
		for (int i = 0; i < max; i++) {
			carBuf = "";
			String regNr = fordonar[i].getRegNr();
			String owner = fordonar[i].getOwner();
			
			carBuf += owner + regNr;
			buf += carBuf + "\n";
		}
		JOptionPane.showMessageDialog(null, buf);
	}
	
	
	
	
	
	
	
	//Tools:
	
	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);
		int amount = -1;
		try {
			amount = Integer.parseInt(SInt);
		} catch (NumberFormatException ex ) {
			JOptionPane.showMessageDialog(null, "Try an integer...");
			amount = getInt(string);
		}
		if (amount < 1 || amount > 10) {
			JOptionPane.showMessageDialog(null, "Try a value between 1 and 10...");
			return getInt(string);
		} else {
			return amount;
		}
	}

}
