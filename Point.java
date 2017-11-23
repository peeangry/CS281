package Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import View.UiScoreG;

public class Point {
	static ArrayList<Double> score = new ArrayList<>();
	
	public static boolean checkPoint() {
		if (UiScoreG.getA1() <= UiScoreG.getA0()) {
			UiScoreG.setA1();
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if (UiScoreG.getBp1() <= UiScoreG.getBp0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setBp1();
			return false;
		}
		if (UiScoreG.getB1() <= UiScoreG.getB0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setB1();
			return false;
		}
		if (UiScoreG.getCp1() <= UiScoreG.getCp0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setCp1();
			return false;
		}
		if (UiScoreG.getC1() <= UiScoreG.getC0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setC1();
			return false;
		}
		if (UiScoreG.getBp1() <= UiScoreG.getBp0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setBp1();
			return false;
		}
		if (UiScoreG.getB1() <= UiScoreG.getB0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setB1();
			return false;
		}
		if (UiScoreG.getA1() <= UiScoreG.getA0()) {
			JOptionPane.showMessageDialog(null, "Plese Input Right box more than Left box ", "Invalid Number ",
					JOptionPane.ERROR_MESSAGE);
			UiScoreG.setF1();
			return false;
		}
		return true;
	}

	public static void keepPoint() {
		score = new ArrayList<>();
		score.add(UiScoreG.getA1());
		score.add(UiScoreG.getA0());
		score.add(UiScoreG.getBp1());
		score.add(UiScoreG.getBp0());
		score.add(UiScoreG.getB1());
		score.add(UiScoreG.getB0());
		score.add(UiScoreG.getCp1());
		score.add(UiScoreG.getCp0());
		score.add(UiScoreG.getC1());
		score.add(UiScoreG.getC0());
		score.add(UiScoreG.getDp1());
		score.add(UiScoreG.getDp0());
		score.add(UiScoreG.getD1());
		score.add(UiScoreG.getD0());
		score.add(UiScoreG.getF1());
		score.add(UiScoreG.getF0());
		String str = "";
		for (int i = 0; i < score.size(); i++) {
			str += score.get(i) + "\n";
		}
		if(FileConection.saveScoreToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to save score to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static double getPoint(int i) {
		return score.get(i);
	}

}
