package Model;

import java.util.ArrayList;

import View.UiScoreTotal;

public class CalculateGrade {
	public static ArrayList<String> Grade = new ArrayList<>();

	public CalculateGrade() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < UiScoreTotal.rows; i++) {
			// Grade.add(arScore.)
			if (FileConection.getPoint()) {
				if (CalculateScore.getCalculate(i) <= Point.getPoint(0)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(1)) {
					Grade.add("A");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(2)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(3)) {
					Grade.add("B+");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(4)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(5)) {
					Grade.add("B");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(6)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(7)) {
					Grade.add("C+");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(8)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(9)) {
					Grade.add("C");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(10)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(11)) {
					Grade.add("D+");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(12)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(13)) {
					Grade.add("D");
				}
				if (CalculateScore.getCalculate(i) <= Point.getPoint(14)
						&& CalculateScore.getCalculate(i) >= Point.getPoint(15)) {
					Grade.add("F");
				}
			}
		}
	}

	public static String getGrade(int i) {
		return Grade.get(i);
	}
}
