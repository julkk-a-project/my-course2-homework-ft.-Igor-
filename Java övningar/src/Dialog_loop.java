import javax.swing.JOptionPane;

public class Dialog_loop {

	public static void main(String[] args) {
		String x = "bob";
		while (x != null) {
			x = JOptionPane.showInputDialog("Type something");
			
		};
		
		
	}

}
