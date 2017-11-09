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

import View.UiExport;

public class FileConection {
	static JFileChooser jf 	= new JFileChooser("C:\\Users\\User\\Desktop");
	
	static File f ;
	static UiExport ue = new UiExport();
	public static boolean openFile(JTextArea a) {
		int win = jf.showOpenDialog(null);
		if (win == JFileChooser.APPROVE_OPTION) {
			try {
				f = jf.getSelectedFile();
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
				return true;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
		}
		return false;
	}
	public static boolean saveFile() {
		
		
		int win = jf.showSaveDialog(null);
		if (win == JFileChooser.APPROVE_OPTION) {
			try {
				f = jf.getSelectedFile();
				FileWriter fw = new FileWriter(f);
				PrintWriter writer = new PrintWriter(fw);

				writer.println(ue.getTextArea().getText());

				writer.close();
				fw.close();
				return true;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
		}
		return false;
	}
	
	public static String getPath(){
		if(f==null) {
			return null;
		}
		return f.getPath();
	}
}
