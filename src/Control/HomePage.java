package Control;

import javax.swing.JFrame;
import javax.swing.JPanel;

import View.UiExport;
import View.UiGradingCriteria;
import View.UiShowGrade;
import View.UiHomepage;
import View.UiList;
import View.UiScoreG;
import View.UiScoreTotal;

public class HomePage  {
	public static void back() {
		UiHomepage ui = new UiHomepage();
		
	}
	public static void editGrade() {
		UiScoreG us = new UiScoreG();//Score
	}
	public static void Export() {
		UiExport ue = new UiExport();//Export
	}
	public static void List() {
		UiList ul = new UiList();//List
	}
	public static void Fill() {
		UiShowGrade ug = new UiShowGrade();//show
	}
	public static void Total() {
		UiScoreTotal ut = new UiScoreTotal();//fill
	}
	public static void Criteria() {
		UiGradingCriteria ug = new UiGradingCriteria();//criteria
	}
}
