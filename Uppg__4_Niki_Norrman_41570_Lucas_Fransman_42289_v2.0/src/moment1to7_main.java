
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class moment1to7_main {

	public static void main(String[] args) {
		int counter = 0;
		int z = 0; //för att skippa add
		int y = 1; //för att 1+ till for loopen
		String [] x = null;
		ArrayList <fordon> list = new ArrayList <fordon>();//lista för fordon
		fordon fordon = new fordon("","");
				for (int i = 0; i < list.size() + y; i++) { 
					z = 0;
					int fordonInfo = fordon.buttons(counter, list); //returnerar 0,2,3 eller 4 beroende på vilken knapp
					if(fordonInfo == -1) {
						System.exit(0);
					} else if(fordonInfo == 0) {
						x = fordon.register(0); //register personbil
					} else if(fordonInfo == 1) {
						x = fordon.register(1);//register lastbil
					} else if(fordonInfo == 2) {
						fordon.utskrift(list, counter);//skriv ut alla fordon
						z = 1;
						y++;
					} else if(fordonInfo == 3) {
						fordon.check(list);//sök efter fordon mha registernummer
						z = 1; //ingenting addas till listan
						y++;  //list.size() + 1
					} else if(fordonInfo == 4) {
						int check = confirm();// dubbelcheck
						if(check == 0 || check == -1) {
							fordon.end();// avsluta programmet
						} else {
							z = 1; //ifall usern ångrar sig så gör z så att ingenting addas till listan
							y++; //list.size() + 1
						}
					}
					if (x != null) {
					int checker = 1;
					while(checker == 1) {
						checker = 0;
						try {
							if (x.length == 9) { //Skapar personBil objektet
								fordon = new personBil(x[0],x[1],x[2],x[3],Integer.parseInt(x[4]),Double.parseDouble(x[5]),Integer.parseInt(x[6]),Double.parseDouble(x[7]),Integer.parseInt(x[8]));
							}
								
							else if (x.length == 8) { //skapar lastbil objektet
								fordon = new lastBil(x[0],x[1],x[2],x[3],x[4],Integer.parseInt(x[5]),x[6],x[7]);
							} 
							else if (x.length == 2) { //om man trycker på avbryt eller krysset
								z = 1;
								y++;
							}
								
						} catch(Exception e) { //if exception register pånytt och wile loopen hålls true mha checker
								JOptionPane.showMessageDialog(null, "Kolla inputen\nKom ihåg att fylla i all information och kommatecken emmellan\nse exemplet");
								if(fordonInfo == 0) {
									x = fordon.register(0);
									checker = 1; //keeps the while loop going
									
								} else if(fordonInfo == 1) {
									x = fordon.register(1);
									checker = 1; //keeps the while loop going
								}
						}
					}
					if (z == 0) { //endast true vid registrering
						list.add(fordon); //add to list
						counter++;
					}
					}
				
				}
			
				}



	private static int confirm() { // kollar att usern säkert vill avsluta
		String[] mojligheter = new String [] {"ja", "nej"};
		int svar = JOptionPane.showOptionDialog(null,
				"Är du säker?"," ",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
				mojligheter, mojligheter[0]);
		return svar;
	}
	
}