import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.function.DoublePredicate;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.FileConection;
import Model.Point;
import View.UiGradingCriteria;

class TestCriteria {
	private ArrayList<Double> cri;
	private static double x, y, z;
	
	@BeforeEach
	protected void setUp() {
		x = 20;
		y = 40;
		z = 40;
		cri = new ArrayList<>();
		cri.add(x);
		cri.add(y);
		cri.add(z);
		String str = "";
		for (int i = 0; i < cri.size(); i++) {
			str += cri.get(i) + "\n";
		}
		FileConection.saveCriteriaToFile(str);
	}
	
	@AfterEach
	protected void tearDown() {
		x = 20;
		y = 40;
		z = 40;
		cri = new ArrayList<>();
		cri.add(x);
		cri.add(y);
		cri.add(z);
		String str = "";
		for (int i = 0; i < cri.size(); i++) {
			str += cri.get(i) + "\n";
		}
		FileConection.saveCriteriaToFile(str);
	}
	
	@Test
	void testNegativeNumber() {
		double a = -20, b = -40, c = -40;
		cri = new ArrayList<>();
		cri.add(a);
		cri.add(b);
		cri.add(c);
		if(a > -1 && b > -1 && c >-1) {
			String str = "";
			for (int i = 0; i < cri.size(); i++) {
				str += cri.get(i) + "\n";
			}
			if(FileConection.saveCriteriaToFile(str)) {
				JOptionPane.showMessageDialog(null, "Success to save Criteria to server", "Success",
				JOptionPane.INFORMATION_MESSAGE);	
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please insert positive value!");
		}
	}
	
	@Test
	void testDecimal() {
		double a = 10.50, b = 30.00, c = 50.50;
		cri = new ArrayList<>();
		cri.add(a);
		cri.add(b);
		cri.add(c);
		if(a > -1 && b > -1 && c >-1) {
			String str = "";
			for (int i = 0; i < cri.size(); i++) {
				str += cri.get(i) + "\n";
			}
			if(FileConection.saveCriteriaToFile(str)) {
				JOptionPane.showMessageDialog(null, "Success to save Criteria to server", "Success",
				JOptionPane.INFORMATION_MESSAGE);	
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please insert positive value!");
		}
	}
	
	@Test
	void testAllZero() {
		double a = 0, b = 0, c = 0;
		assertFalse(Point.CheckCriteria(a, b, c));
	}
	
	@Test
	void testEmpty() {
		String r = "", m = "", f = "";
		assertFalse(Point.CheckEmptyCriteria(r, m, f));	
	}

}
