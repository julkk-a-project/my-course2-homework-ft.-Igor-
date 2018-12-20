import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class tableMaker extends JFrame {

	/*
	 * Skapar en tabell
	 */
	
	JTable table;
	int counter;
	ArrayList <fordon> list;
	
	public tableMaker(int counter, ArrayList <fordon> list) {
		this.counter = counter;
		this.list = list;
	}
	
	
	public void create () {
		setLayout(new FlowLayout());
		
		String [] column = {"regNr", "ägare", "märke", "modell", "säten", "last", "kapacitet", "start", "destination", "motor volym", "hk", "forbrukning", "km"};
		Object [][] data = new Object [counter][13];
		
		for(int i = 0; i < 13; i++) { //skapar en 2d array med all data 
			for(int x = 0; x < counter; x++) {
				if(i == 0)
					data [x][i] = list.get(x).getRegNr(); 
				else if(i == 1)
					data [x][i] = list.get(x).getOwner();
				else if(i == 2)
					data [x][i] = list.get(x).getMarke();
				else if(i == 3)
					data [x][i] = list.get(x).getModell();
				else if(i == 4)
					data [x][i] = list.get(x).getSaten();
				else if(i == 5)
					data [x][i] = list.get(x).getLoad();
				else if(i == 6)
					data [x][i] = list.get(x).getCapacity();
				else if(i == 7)
					data [x][i] = list.get(x).getDepart();
				else if(i == 8)
					data [x][i] = list.get(x).getDestination();
				else if(i == 9)
					data [x][i] = list.get(x).getMotorVol();
				else if(i == 10)
					data [x][i] = list.get(x).getHk();
				else if(i == 11)
					data [x][i] = list.get(x).getForbrukning();
				else if(i == 12)
					data [x][i] = list.get(x).getKm();
			}
		}
		
		table = new JTable(data, column);
		table.setPreferredScrollableViewportSize(new Dimension(1200,list.size() * 16));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		
	}
}
