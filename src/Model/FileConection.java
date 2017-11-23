package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import View.UiExport;

public class FileConection {
	static JFileChooser jf = new JFileChooser("C:\\Users\\User\\Desktop");
	static File f;

	public static boolean openFile(JTextArea a) {
		int win = jf.showOpenDialog(null);
		if (win == JFileChooser.APPROVE_OPTION) {
			try {
				f = jf.getSelectedFile();
				FileReader fr = new FileReader(f);
				BufferedReader reader = new BufferedReader(fr);
				String so;
				do {
					so = reader.readLine();
					if (so != null) {
						a.append(so + "\n");
					}
				} while (so != null);
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

	public static boolean saveFileToServer(JTextArea a) {

		try {
			f = new File("List.txt");
			FileWriter fw = new FileWriter(f);
			PrintWriter writer = new PrintWriter(fw);
			writer.println(a.getText());
			writer.close();
			fw.close();
			JOptionPane.showMessageDialog(null, "Success to save file to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);
			return true;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
			return false;
		}

	}

	public static boolean OPENFileToServer(JTextArea a) {

		try {
			f = new File("List.txt");
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);

			String so;
			do {
				so = reader.readLine();
				if (so != null) {
					a.append(so + "\n");
				}
			} while (so != null);
			reader.close();
			fr.close();
			return true;

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
			return false;
		}

	}

	public static boolean saveScoreToFile(String a) {
		try (FileWriter fw = new FileWriter("Score.txt", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public static boolean getPoint() {
		try (Scanner sc = new Scanner(new File("Score.txt"))) {
			Point.score = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				if (str.equals("")) {
					return false;
				}
				Point.score.add(Double.parseDouble(str));
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}

	public static boolean saveFileExport() {

		int win = jf.showSaveDialog(null);
		jf.setFileFilter(new FileNameExtensionFilter("Data File", "txt", "jpg", "png"));
		jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
		UiExport ue = new UiExport();
		ue.dispose();
		if (win == JFileChooser.APPROVE_OPTION) {
			try {
				File f = jf.getSelectedFile();
				FileWriter fw = new FileWriter(f, true);
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

	public static String getPath() {
		if (f == null) {
			return null;
		}
		return f.getPath();
	}

	public static int getSize(JTextArea a) {
		return a.getLineCount() - 1;
	}

	public static boolean saveTable(JTextArea a) {

		try {
			f = new File("Table.txt");
			FileWriter fw = new FileWriter(f);
			PrintWriter writer = new PrintWriter(fw);
			writer.println(FileConection.getSize(a));
			writer.close();
			fw.close();
			return true;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
			return false;
		}

	}

	public static String getTable() {
		f = new File("Table.txt");
		FileReader fr;
		String so = null;
		try {
			fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			so = reader.readLine();
			return so;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return so;
	}
}