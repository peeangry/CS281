package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import Control.HomePage;
import Model.FileConection;

public class UiGradeShow extends JFrame{
	
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
	JLabel grade;
	ImageIcon img;
	JButton back;
	JButton edit;
	JButton save;
	String roll;
	int rows;
	public UiGradeShow(){
		this.setLayout(new BorderLayout());
		
		mainPanel1p = new JPanel(new BorderLayout());
		mainPanel1p.setBackground(new Color(255,193,37));
		mainPanel1 = new JPanel(new GridLayout(2, 1));
		mainPanel1.setBackground(new Color(255,193,37));
		mainPanel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panel11 = new JPanel();
		panel11.setBackground(new Color(255,193,37));
		panel12 = new JPanel();
		panel12.setBackground(new Color(255,193,37));
		panel13 = new JPanel();
		panel13.setBackground(new Color(255,193,37));
		panel13.setBorder(BorderFactory.createEmptyBorder(1, 10, 1, 10));
		head = new JLabel("OFFICE OF THE REGISTRAION");
		head.setForeground(Color.WHITE);
		head.setFont(new Font("tahoma",Font.BOLD,42));
		thammasat = new JLabel("THAMMASAT UNIVERSITY");
		thammasat.setForeground(Color.WHITE);
		thammasat.setFont(new Font("tahoma",Font.BOLD,28));
		img = new ImageIcon("Thammasat.png");
		picLabel = new JLabel(img);
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel2.setBackground(new Color(255,236,139));
		back = new JButton("BACK");
		back.setPreferredSize(new Dimension(175, 50));
		back.setBackground(new Color(255,127,0));
		back.setFont(new Font("tahoma",Font.BOLD,16));
		mainPanel3 = new JPanel(new BorderLayout());
		mainPanel3.setBackground(Color.WHITE);
		panel31 = new JPanel();
		panel31.setBackground(Color.WHITE);
		panel32 = new JPanel(new BorderLayout());
		panel32.setBackground(Color.WHITE);
		panel33 = new JPanel();
		panel33.setBackground(Color.WHITE);
		grade = new JLabel("Grade : ");
		grade.setFont(new Font("tahoma",Font.BOLD,28));
		edit = new JButton("EDIT");
		save = new JButton("SAVE");
		roll = FileConection.getTable();
		
		String[] column = {"ID STUDENT", "SCORE", "GRADE"};
		
		Object[][] data = {
				{
					//"01", "85", "A"
				},
				{
					//"02", "54", "C"
				}
		};
		
		rows = Integer.parseInt(roll);
		//JTable table = new JTable(rows,3);
		//table.setTableHeader(tableHeader);
		JTable table ;
		DefaultTableModel table_model;
		table_model = new DefaultTableModel(column,rows);
		table = new JTable(table_model);
		JScrollPane tableScroll = new JScrollPane ( table );
		
		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11,BorderLayout.CENTER);
		mainPanel1.add(panel12,BorderLayout.SOUTH);
		mainPanel1p.add(panel13,BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);
		
		panel2.add(back);
		
		//mainPanel3.setLayout(new BorderLayout());
		panel31.add(grade);
		panel32.add(table.getTableHeader(), BorderLayout.PAGE_START );
		panel32.add(tableScroll);
		panel33.add(edit);
		panel33.add(save);
		mainPanel3.add(panel31,BorderLayout.NORTH);
		mainPanel3.add(panel32,BorderLayout.CENTER);
		mainPanel3.add(panel33,BorderLayout.SOUTH);
		back.addActionListener(new ActionListener() {
			//test gitHub
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.back();
			}
		});
		
		this.setBackground(new Color(255,236,139));
		this.add(mainPanel1p,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.WEST);
		this.add(mainPanel3,BorderLayout.CENTER);
		this.setResizable(false);
		setTitle("THAMMASAT UNIVERSITY");
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiGradeShow ugs = new UiGradeShow();
	}

}
