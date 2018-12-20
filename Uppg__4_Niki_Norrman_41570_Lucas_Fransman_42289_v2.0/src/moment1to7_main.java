
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class moment1to7_main {

	public static void main(String[] args) {
		int counter = 0;
		int z = 0;
		int y = 1;
		String [] x = null;
		ArrayList <fordon> list = new ArrayList <fordon>();
		fordon fordon = new fordon("","");
				for (int i = 0; i < list.size() + y; i++) {
					z = 0;
					int fordonInfo = fordon.buttons(counter, list);
					if(fordonInfo == -1) {
						System.exit(0);
					} else if(fordonInfo == 0) {
						x = fordon.register(0);
					} else if(fordonInfo == 1) {
						x = fordon.register(1);
					} else if(fordonInfo == 2) {
						fordon.utskrift(list, counter);
						break;
					} else if(fordonInfo == 3) {
						fordon.check(list);
						z = 1;
						y++;
					} else if(fordonInfo == 4) {
						int check = confirm();
						if(check == 0 || check == -1) {
							fordon.end();
						} else {
							z = 1;
							y++;
						}
					}
					if (x != null) {
					int checker = 1;
					while(checker == 1) {
						checker = 0;
						try {
							if (x.length == 9) {
								fordon = new personBil(x[0],x[1],x[2],x[3],Integer.parseInt(x[4]),Double.parseDouble(x[5]),Integer.parseInt(x[6]),Double.parseDouble(x[7]),Integer.parseInt(x[8]));
							}
								
							else if (x.length == 8) {
								fordon = new lastBil(x[0],x[1],x[2],x[3],x[4],Integer.parseInt(x[5]),x[6],x[7]);
							} 	
								
						} catch(Exception e) {
								JOptionPane.showMessageDialog(null, "Kolla inputen\nKom ihåg att fylla i all information och kommatecken emmellan\nse exemplet");
								if(fordonInfo == 0) {
									x = fordon.register(0);
									checker = 1;
								} else if(fordonInfo == 1) {
									x = fordon.register(1);
									checker = 1;
								}
						}
					}
					if (z == 0) {
						list.add(fordon);
						counter++;
					}
					}
				
				}
				
				}



	private static int confirm() {
		String[] mojligheter = new String [] {"ja", "nej"};
		int svar = JOptionPane.showOptionDialog(null,
				"Är du säker?"," ",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
				mojligheter, mojligheter[0]);
		return svar;
	}
	
}