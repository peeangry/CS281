package Model;

import javax.swing.JOptionPane;

import View.UiScoreG;

public class Point {
	public static void checkPoint() {
		if(UiScoreG.getA1()>=UiScoreG.getA0() ) {
			UiScoreG.setA1();
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
		}
		if(UiScoreG.getBp1()>=UiScoreG.getBp0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setBp1();
		}
		if(UiScoreG.getB1()>=UiScoreG.getB0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setB1();
		}
		if(UiScoreG.getCp1()>=UiScoreG.getCp0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setCp1();
		}
		if(UiScoreG.getC1()>=UiScoreG.getC0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setC1();
		}
		if(UiScoreG.getBp1()>=UiScoreG.getBp0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setBp1();
		}
		if(UiScoreG.getB1()>=UiScoreG.getB0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setB1();
		}
		if(UiScoreG.getA1()>=UiScoreG.getA0() ) {
			JOptionPane.showMessageDialog(null,"Plese Input Left box more than Right box ","Invalid Number ",JOptionPane.ERROR_MESSAGE);
			UiScoreG.setF1();
		}
	}
}
