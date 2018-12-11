import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Car Car1 = new Car(0, 10, 2, 0, "Car1", 90);
		Car Car2 = new Car(0, 10, 2.1, 0, "Car2", 120);
		
		
		
		while (true) { //carRunner
			//if ()
			Car1.runMe(Car2);
			Car2.runMe(Car1);
			double pos1 = Math.round(Car1.calculateLocation());
			double pos2 = Math.round(Car2.calculateLocation());
			double dif = pos1 - pos2;
			JOptionPane.showMessageDialog(null, "car1 "+pos1+", car2 "+pos2+"\ndif "+dif);
		}
	}

}
