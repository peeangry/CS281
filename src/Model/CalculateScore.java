package Model;

import java.util.ArrayList;

import View.UiScoreTotal;

public class CalculateScore {
	public static ArrayList<Double> cal = new ArrayList<>();
	public CalculateScore() {
		for(int i=0;i<UiScoreTotal.rows;i++) {
			cal.add(Double.parseDouble(Point.getQuiz(i))+Double.parseDouble(Point.getMidterm(i))+Double.parseDouble(Point.getFinal(i)));
		}
		
	} 
	public static Double getCalculate(int i){
		return cal.get(i);
	}
}
