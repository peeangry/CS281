package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class FileConection {
	static JFileChooser jf ;

	public static void openFile(JTextArea a) {
		jf = new JFileChooser("C:\\Users\\User\\Desktop");
		int win = jf.showOpenDialog(null);
		if (win == JFileChooser.APPROVE_OPTION) {
			try {
				File f = jf.getSelectedFile();
				FileReader fr = new FileReader(f);
				BufferedReader reader = new BufferedReader(fr);
				String so;
				do{
					so = reader.readLine();
					if(so!=null) {
						a.append(so + "\n");
					}
				}while (so != null);
				reader.close();
				fr.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
		}
	}
	public static void saveFile(JTextArea a) {

		
		int win = jf.showSaveDialog(null);
		if (win == JFileChooser.APPROVE_OPTION) {
			try {
				File f = jf.getSelectedFile();
				FileWriter fw = new FileWriter(f);
				PrintWriter writer = new PrintWriter(fw);

				writer.println(a.getText());

				writer.close();
				fw.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
		}

	}
}
