import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class upg7 {

	//NOTE! the files must pre-exist in the locations defined in code.
	
	public static void writer(String Sline) {
		String [] line = Sline.split("\\|");
		try {
			FileWriter writer = new FileWriter("C:\\bob\\enNyTextFil.txt");
			BufferedWriter buf = new BufferedWriter(writer);
			for (int i = 0;i<3;i++) {
				buf.write(line[i]);
				buf.newLine();
			}
			buf.close();
		} catch (IOException e) {
			System.out.println("WRITEFAULT");
		}
	}
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\enTextFil.txt");
			BufferedReader buf = new BufferedReader(reader);
			String line;
			String Sline = "";
			while ((line = buf.readLine()) != null) {
				System.out.print(line+"\n");
				Sline += (line+"|");
			}
			buf.close();
			writer(Sline);
		} catch (IOException e) {
			//buf.close();
			
		}


	}

}
