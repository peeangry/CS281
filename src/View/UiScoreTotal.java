package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Control.HomePage;
import Model.CalculateGrade;
import Model.CalculateScore;
import Model.FileConection;
import Model.Point;

public class UiScoreTotal extends JFrame {
	JPanel panel11;
	JPanel panel12;
	JPanel panel13;
	JPanel panel2;
	JPanel panel3;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel mainPanel1;
	JPanel mainPanel1p;
	JPanel mainPanel3;
	JLabel head;
	JLabel thammasat;
	JLabel picLabel;
	JLabel total;

	ImageIcon img;
	JButton back;
	JButton save;
	JButton load;
	JButton reset;
	JButton Calculate;
	String roll;
	public static int rows;
	static ArrayList<String> stQuiz1 = new ArrayList<>();
	static ArrayList<String> stMid = new ArrayList<>();
	static ArrayList<String> stFinal = new ArrayList<>();
	static ArrayList<String> stTotal = new ArrayList<>();

	public UiScoreTotal() {
		this.setLayout(new BorderLayout());
		mainPanel1p = new JPanel(new BorderLayout());
		mainPanel1p.setBackground(new Color(255, 193, 37));
		mainPanel1 = new JPanel(new GridLayout(2, 1));
		mainPanel1.setBackground(new Color(255, 193, 37));
		mainPanel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panel11 = new JPanel();
		panel11.setBackground(new Color(255, 193, 37));
		panel12 = new JPanel();
		panel12.setBackground(new Color(255, 193, 37));
		panel13 = new JPanel();
		panel13.setBackground(new Color(255, 193, 37));
		panel13.setBorder(BorderFactory.createEmptyBorder(1, 10, 1, 10));
		head = new JLabel("OFFICE OF THE REGISTRAION");
		head.setForeground(Color.WHITE);
		head.setFont(new Font("tahoma", Font.BOLD, 42));
		thammasat = new JLabel("THAMMASAT UNIVERSITY");
		thammasat.setForeground(Color.WHITE);
		thammasat.setFont(new Font("tahoma", Font.BOLD, 28));
		img = new ImageIcon("Thammasat.png");
		picLabel = new JLabel(img);
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel2.setBackground(new Color(255, 236, 139));
		back = new JButton("BACK");
		back.setPreferredSize(new Dimension(175, 50));
		back.setBackground(new Color(255, 127, 0));
		back.setFont(new Font("tahoma", Font.BOLD, 16));
		mainPanel3 = new JPanel();
		mainPanel3.setBackground(Color.WHITE);
		panel31 = new JPanel(new BorderLayout());
		panel31.setBackground(Color.WHITE);
		panel32 = new JPanel(new BorderLayout());
		panel32.setBackground(Color.WHITE);
		roll = FileConection.getTable();
		total = new JLabel("Score Total");
		total.setFont(new Font("tahoma", Font.BOLD, 28));
		panel33 = new JPanel(new FlowLayout());
		panel33.setBackground(Color.WHITE);
		save = new JButton("SAVE");
		load = new JButton("LOAD");
		reset = new JButton("Reset");
		Calculate = new JButton("Calculate");

		String[] column = { "ID STUDENT", "Quiz SCORE"+"("+UiGradingCriteria.getRe()+")", "MIDTERM"+"("+UiGradingCriteria.getMid()+")", "FINAL"+"("+UiGradingCriteria.getFin()+")", "TOTAL" };

		Object[][] data = { {
				// "01", "85", "A"
				}, {
				// "02", "54", "C"
				} };

		rows = Integer.parseInt(roll);
		// JTable table = new JTable(rows,3);
		// table.setTableHeader(tableHeader);
		JTable table;
		DefaultTableModel table_model;
		table_model = new DefaultTableModel(column, rows);
		table = new JTable(table_model);
		JScrollPane tableScroll = new JScrollPane(table);

		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11, BorderLayout.CENTER);
		mainPanel1.add(panel12, BorderLayout.SOUTH);
		mainPanel1p.add(panel13, BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);

		panel2.add(back);

		mainPanel3.setLayout(new BorderLayout());
		panel31.add(total);
		panel32.add(table.getTableHeader(), BorderLayout.PAGE_START);
		panel32.add(tableScroll);
		panel33.add(load);
		panel33.add(save);
		panel33.add(reset);
		panel33.add(Calculate);
		mainPanel3.add(panel31, BorderLayout.NORTH);
		mainPanel3.add(panel32, BorderLayout.CENTER);
		mainPanel3.add(panel33, BorderLayout.SOUTH);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.back();
			}
		});
		load.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Calculate.setEnabled(true);
				for (int i = 0; i < rows; i++) {
					// System.out.println(FileConection.GetId());
					if (FileConection.GetId()) {
						table.setValueAt(Point.getListId(i), i, 0);
						if (FileConection.GetQuiz()) {
							table.setValueAt(Point.getQuiz(i), i, 1);
							if (FileConection.GetMidterm()) {
								table.setValueAt(Point.getMidterm(i), i, 2);
								if (FileConection.GetFinal()) {
									table.setValueAt(Point.getFinal(i), i, 3);
									if (FileConection.GetTotal()) {
										table.setValueAt(Point.getTotal(i), i, 4);
									}
								}
							}
						}
					}
				}
//				if(FileConection.getPoint()) {
//					for (int i = 0; i <= Point.arScore.size(); i++) {
//						System.out.println(Point.getPoint(i));
//					}
//				}
			}
		});
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				load.setEnabled(true);
				// TODO Auto-generated method stub
				for (int i = 0; i < rows; i++) {
					stQuiz1.add(table.getValueAt(i, 1)+"");
					Point.arQuiz.add(stQuiz1.get(i));
					stMid.add(table.getValueAt(i, 2)+"");
					Point.arMid.add(stMid.get(i));
					stFinal.add(table.getValueAt(i, 3)+"");
					Point.arFin.add(stFinal.get(i));
					stTotal.add(table.getValueAt(i, 4)+"");
					Point.arTotal.add(stTotal.get(i));
				}
				Point.keepQuiz();
				Point.keepMidterm();
				Point.keepFinal();
				Point.keepTotal();
			}

		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for (int i = 0; i < rows; i++) {
					table.setValueAt(Point.getListId(i), i, 0);
					table.setValueAt(i, i, 1);
					table.setValueAt(i, i, 2);
					table.setValueAt(i, i, 3);
					table.setValueAt(0, i, 4);
				}
			}
		});
		for (int i = 0; i < rows; i++) {
			if (FileConection.GetId()) {
				table.setValueAt(Point.getListId(i), i, 0);
			}
			table.setValueAt(i, i, 1);
			table.setValueAt(i, i, 2);
			table.setValueAt(i, i, 3);
			table.setValueAt(0, i, 4);
		}
		Calculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new CalculateScore();
				for (int i = 0; i < rows; i++) {
					table.setValueAt(CalculateScore.getCalculate(i), i, 4);
					
				}
			
			}
		});
		Calculate.setEnabled(false);
		load.setEnabled(false);
		this.setBackground(new Color(255, 236, 139));
		this.add(mainPanel1p, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		this.add(mainPanel3, BorderLayout.CENTER);
		this.setResizable(false);
		setTitle("THAMMASAT UNIVERSITY");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiScoreTotal ust = new UiScoreTotal();
	}

}
