package Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import View.UiGradingCriteria;
import View.UiScoreG;
import View.UiScoreTotal;

public class Point {
	public static ArrayList<Double> arScore = new ArrayList<>();
	public static ArrayList<Double> arCri = new ArrayList<>();
	public static ArrayList<String> arLis = new ArrayList<>();
	public static ArrayList<String> arMid = new ArrayList<>();
	public static ArrayList<String> arFin = new ArrayList<>();
	public static ArrayList<String> arQuiz = new ArrayList<>();
	public static ArrayList<String> arTotal = new ArrayList<>();
	public static ArrayList<String> arGrade = new ArrayList<>();
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
		arScore = new ArrayList<>();
		arScore.add(UiScoreG.getA1());
		arScore.add(UiScoreG.getA0());
		arScore.add(UiScoreG.getBp1());
		arScore.add(UiScoreG.getBp0());
		arScore.add(UiScoreG.getB1());
		arScore.add(UiScoreG.getB0());
		arScore.add(UiScoreG.getCp1());
		arScore.add(UiScoreG.getCp0());
		arScore.add(UiScoreG.getC1());
		arScore.add(UiScoreG.getC0());
		arScore.add(UiScoreG.getDp1());
		arScore.add(UiScoreG.getDp0());
		arScore.add(UiScoreG.getD1());
		arScore.add(UiScoreG.getD0());
		arScore.add(UiScoreG.getF1());
		arScore.add(UiScoreG.getF0());
		String str = "";
		for (int i = 0; i < arScore.size(); i++) {
			str += arScore.get(i) + "\n";
		}
		if(FileConection.saveScoreToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to save score to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static void keepCriteria() {
		//arCri = new ArrayList<>();
		arCri.add(UiGradingCriteria.getRe());
		arCri.add(UiGradingCriteria.getFin());
		arCri.add(UiGradingCriteria.getMid());
		String str = "";
		for (int i = 0; i < arCri.size(); i++) {
			str += arCri.get(i) + "\n";
		}
		if(FileConection.saveCriteriaToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to save Criteria to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static void keepListId() {
	//	arLis = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arLis.size(); i++) {
			str += arLis.get(i) + "\n";
		}
		if(FileConection.saveCriteriaToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to Save Id by server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static void keepMidterm() {
	//	arMid = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arMid.size(); i++) {
			str += arMid.get(i) + "\n";
		}
		if(FileConection.saveMidtermToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to Save Midterm Score by server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static void keepFinal() {
	//	arFin = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arFin.size(); i++) {
			str += arFin.get(i) + "\n";
		}if(FileConection.saveFinalToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to Save Final Score by server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
			}
	public static void keepQuiz() {
		//arQuiz = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arQuiz.size(); i++) {
			str += arQuiz.get(i) + "\n";
			
		}
		if(FileConection.saveQuizToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to Save Quiz Score to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);
//			System.out.println("Success to Save Quiz Score to server");
		}		
	}
	public static void keepTotal() {
		//arTotal = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arTotal.size(); i++) {
			str += arTotal.get(i) + "\n";
		}
		if(FileConection.saveTotalToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to Save Total Score to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static void keepGrade() {
		//arGrade = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arGrade.size(); i++) {
			str += arGrade.get(i) + "\n";
		}
		if(FileConection.saveGradeToFile(str)) {
			JOptionPane.showMessageDialog(null, "Success to Save Grade to server", "Success",
					JOptionPane.INFORMATION_MESSAGE);	
		}
	}
	public static double getCri(int i) {
		return arCri.get(i);
	}
	public static String getMidterm(int i) {
		return arMid.get(i);
	}
	public static String getFinal(int i) {
		return arFin.get(i);
	}
	public static String getListId(int i) {
		return arLis.get(i);
	}
	public static String getQuiz(int i) {
		return arQuiz.get(i);
	}
	public static String getTotal(int i) {
		return arTotal.get(i);
	}
	public static String getGrade(int i) {
		return arGrade.get(i);
	}
	public static double getPoint(int i) {
		return arScore.get(i);
	}
}