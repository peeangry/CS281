package Control;

import javax.swing.JFrame;
import javax.swing.JPanel;

import View.UiExport;
import View.UiShowGrade;
import View.UiHomepage;
import View.UiList;
import View.UiScoreG;

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
		UiShowGrade ug = new UiShowGrade();//Fill
	}

}
