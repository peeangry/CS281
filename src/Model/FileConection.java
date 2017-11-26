package Model;

import java.awt.List;
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
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import View.UiExport;

public class FileConection {
	static JFileChooser jf = new JFileChooser(".");
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
			FileWriter fw = new FileWriter(f,false);
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
			Point.arScore = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				if (str.equals("")) {
					return false;
				}
				Point.arScore.add(Double.parseDouble(str));
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean saveCriteriaToFile(String a) {
		try (FileWriter fw = new FileWriter("Criteria.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	public static boolean getCriteria() {
		try (Scanner sc = new Scanner(new File("Criteria.txt"))) {
			Point.arCri = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				if (str.equals("")) {
					return false;
				}
				Point.arCri.add(Double.parseDouble(str));
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean getScoreJtable() {
		try (Scanner sc = new Scanner(new File("ScoreTable.txt"))) {
			Point.arScore = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				if (str.equals("")) {
					return false;
				}
				Point.arScore.add(Double.parseDouble(str));
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean GetId() {
		try (Scanner sc = new Scanner(new File("List.txt"))) {
			Point.arLis = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Point.arLis.add(str);
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean GetMidterm() {
		try (Scanner sc = new Scanner(new File("Midterm.txt"))) {
			Point.arMid = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Point.arMid.add(str);
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean GetFinal() {
		try (Scanner sc = new Scanner(new File("Final.txt"))) {
			Point.arFin = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Point.arFin.add(str);
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean GetQuiz() {
		try (Scanner sc = new Scanner(new File("Quiz.txt"))) {
			Point.arQuiz = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Point.arQuiz.add(str);
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean GetTotal() {
		try (Scanner sc = new Scanner(new File("Total.txt"))) {
			Point.arTotal = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Point.arTotal.add(str);
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean GetGrade() {
		try (Scanner sc = new Scanner(new File("Grade.txt"))) {
			Point.arGrade = new ArrayList<>();
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Point.arGrade.add(str);
			}
			return true;
		} catch (FileNotFoundException | NumberFormatException e) {
			return false;
		}
	}
	public static boolean saveMidtermToFile(String a) {
		try (FileWriter fw = new FileWriter("Midterm.txt", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	public static boolean saveFinalToFile(String a) {
		try (FileWriter fw = new FileWriter("Final.txt", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	public static boolean saveQuizToFile(String a) {
		try (FileWriter fw = new FileWriter("Quiz.txt", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
		
	}

	public static boolean saveTotalToFile(String a) {
		try (FileWriter fw = new FileWriter("Total.txt", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	public static boolean saveGradeToFile(String a) {
		try (FileWriter fw = new FileWriter("Grade.txt", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(a);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

}