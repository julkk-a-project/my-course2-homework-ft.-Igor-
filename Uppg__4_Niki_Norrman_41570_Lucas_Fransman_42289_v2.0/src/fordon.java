import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fordon extends abstractFordon {
	
	IEgenskaper x = new LastBilEgenskaper();
	IEgenskaper y = new PersonBilEgenskaper();
	
	public fordon(String regNr, String owner) {
		this.regNr = regNr;
		this.owner = owner;
	}
	
	public int buttons(int counter, ArrayList <fordon> list) { // usern väljer action
		
		String[] mojligheter = new String [] {"registrera person bil", "registrera last bil", "skriv ut","skriv ut en bils uppgifter" ,"avsluta"};
		int svar = JOptionPane.showOptionDialog(null,
				"du har registrerat " + counter + " fordon. \nVad vill du göra?"," ",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
				mojligheter, mojligheter[0]);

		return svar;
		
	}
	
	public String [] register(int x) { //skapar en lista med all data
		String [] info = new String[0];
		String infa = "x";
		if (x == 0) { //if personbil
			try {
				infa = JOptionPane.showInputDialog("Mata in register nummer, ägare, märke, modell, antal säten, motorvolym, hästkrafter, förbrukning och km\nex abc-123,stina,lexus,i200,5,2.2,201,8.3,20000");
				if(infa == null) { //om man trycker på avbryt eller krysset
					String z = "x,x";
					return z.split(","); 
				}
				info = infa.split(",");
				if(info.length != 9) {
					int z = 1 / 0; //thwrows exception
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Kolla inputen\nKom ihåg att fylla i all information och kommatecken emmellan\nse exemplet");
				return register(x);
			}
		} else if (x == 1) { //if lastbil
			try {
				infa = JOptionPane.showInputDialog("Mata in register nummer, ägare, märke, modell, last, kapacitet, start och mål\nex abc-129,Stigu,Volvo,truck,tomater,15,Närpes,Helsingfors ");
				
				if(infa == null) { //om man trycker på avbryt eller krysset
					String z = "x,x";
					return z.split(","); 
				}
				info = infa.split(",");
				if(info.length != 8) {
					int z = 1 / 0; //thwrows exception
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Kolla inputen\nKom ihåg att fylla i all information och kommatecken emmellan\nse exemplet");
				 return register(x);
			}
		}
		return info;
	}
	
	public void utskrift(ArrayList <fordon> list, int counter) { //skriver ut tabell
		tableMaker table = new tableMaker(counter, list); // skapar tabell
		table.create();
		table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table.setSize(1300,list.size() * 16 + 100);
		table.setVisible(true);
		table.setTitle("List");
		
	}
	
	public void end() { //avslutar programmet
		System.exit(0);
	}

	public void check(ArrayList <fordon> list) { //kollar om ett angivet register nummer finns i listan och displayar all data som tillhör det nummret
		String reg = " ";
		int x = 1;
		ArrayList <fordon> checkList = new ArrayList <fordon>(); 
		while(x == 1) {
			x = 0;
			reg = JOptionPane.showInputDialog("Ange registernummer\nex abc-123");
			if(reg == null) {
				reg = " ";
			}
			if(reg.length() != 7 || reg.contains("-") == false) {
				JOptionPane.showMessageDialog(null, "Kolla att du gett registernummret i rätt format");
				x = 1;
			}
		}
		int y = 0;
		for(int i = 0; i < list.size(); i++) {
			if(reg.equals(list.get(i).getRegNr())) {
				y = 1;
				checkList.add(list.get(i));
				tableMaker checkOut = new tableMaker(1, checkList); //displayas i en tabell
				checkOut.create();
				checkOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				checkOut.setSize(1300,100);
				checkOut.setVisible(true);
				checkOut.setTitle(list.get(i).getRegNr());
			}
		}
		if (y == 0) { //if registernummret inte fanns angivet
			JOptionPane.showMessageDialog(null, "fordonet du söker finns ej");
		}
	}
		
	}

