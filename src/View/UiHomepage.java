package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import Control.HomePage;
import Model.FileConection;

public class UiHomepage extends JFrame {
	JPanel panel11;
	JPanel panel12;
	JPanel panel13;
	JPanel panel21;
	JPanel panel22;
	JPanel panel23;
	JPanel panel24;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel panel34;
	JPanel panel35;
	JPanel panel36;
	JPanel panel37;
	JPanel panel38;
	JPanel panel39;
	JPanel mainPanel1;
	JPanel mainPanel1p;
	JPanel mainPanel2;
	JPanel mainPanel3;
	JLabel head;
	JLabel id;
	JLabel txt;
	JLabel idShow;
	JLabel toturial;
	JLabel one;
	JLabel two;
	JLabel three;
	JLabel four;
	JLabel five;
	JLabel six;
	JLabel thammasat;
	JLabel picLabel;
	JButton tea;
	JButton TotalScore;
	JButton editG;
	JButton exportG;
	JButton Criteria;
	JButton FillScore;
	JTextPane pic;
	ImageIcon img;
	
	public UiHomepage() {
		this.setLayout(new BorderLayout());
		mainPanel1 = new JPanel();
		mainPanel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		mainPanel1.setBackground(new Color(255,193,37));
		mainPanel1p = new JPanel(new BorderLayout());
		mainPanel1p.setBackground(new Color(255,193,37));
		panel11 = new JPanel();
		panel11.setBackground(new Color(255,193,37));
		panel12 = new JPanel();
		panel12.setBackground(new Color(255,193,37));
		panel13 = new JPanel();
		panel13.setBackground(new Color(255,193,37));
		panel13.setBorder(BorderFactory.createEmptyBorder(1, 10, 1, 10));
		img = new ImageIcon("Thammasat.png");
		picLabel = new JLabel(img);
		head = new JLabel("OFFICE OF THE REGISTRAION");
		head.setForeground(Color.WHITE);
		head.setFont(new Font("tahoma",Font.BOLD,42));
		thammasat = new JLabel("THAMMASAT UNIVERSITY");
		thammasat.setForeground(Color.WHITE);
		thammasat.setFont(new Font("tahoma",Font.BOLD,28));
		mainPanel2 = new JPanel(new GridLayout(10, 1, 15, 15));
		mainPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel2.setBackground(new Color(255, 236, 139));
		panel21 = new JPanel();
		panel21.setBackground(new Color(255, 236, 139));
		panel22 = new JPanel();
		panel22.setBackground(new Color(255, 236, 139));
		panel23 = new JPanel();
		panel23.setBackground(new Color(255, 236, 139));
		panel24 = new JPanel();
		panel24.setBackground(new Color(255, 236, 139));
		tea = new JButton("LIST");
		tea.setBackground(new Color(255, 127, 0));
		tea.setFont(new Font("tahoma",Font.BOLD,16));
		TotalScore = new JButton("Total Score");
		TotalScore.setBackground(new Color(255, 127, 0));
		TotalScore.setFont(new Font("tahoma",Font.BOLD,16));
		editG = new JButton("EDIT GRADE");
		editG.setBackground(new Color(255, 127, 0));
		editG.setFont(new Font("tahoma",Font.BOLD,16));
		FillScore = new JButton("Fill Score");
		FillScore.setBackground(new Color(255, 127, 0));
		FillScore.setFont(new Font("tahoma",Font.BOLD,16));
		Criteria = new JButton("Grading Criteria");
		Criteria.setBackground(new Color(255, 127, 0));
		Criteria.setFont(new Font("tahoma",Font.BOLD,16));
		exportG = new JButton("EXPORT GRADE");
		exportG.setBackground(new Color(255, 127, 0));
		exportG.setFont(new Font("tahoma",Font.BOLD,16));
		panel31 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel31.setBackground(Color.WHITE);
		id = new JLabel("ID : ");
		id.setFont(new Font("tahoma", Font.BOLD, 24));
		idShow = new JLabel("Student ID : ");
		idShow.setFont(new Font("tahoma", Font.BOLD, 26));
		toturial = new JLabel("Toturial : Plese follow the process");
		toturial.setFont(new Font("tahoma", Font.BOLD, 26));
		one = new JLabel("1.List");
		one.setFont(new Font("tahoma",Font.BOLD, 18));
		two = new JLabel("2.Edit Grade");
		two.setFont(new Font("tahoma", Font.BOLD, 18));
		three = new JLabel("3.Grading Criteria");
		three.setFont(new Font("tahoma", Font.BOLD, 18));
		four = new JLabel("4.Fill Score");
		four.setFont(new Font("tahoma", Font.BOLD, 18));
		five = new JLabel("5.Total Score");
		five.setFont(new Font("tahoma", Font.BOLD, 18));
		six = new JLabel("6.Export");
		six.setFont(new Font("tahoma", Font.BOLD, 18));
		txt = new JLabel("Welcome! To EDUCATIONAL SERVICE SYSTEM ");
		txt.setFont(new Font("tahoma",Font.BOLD,16));
		mainPanel3 = new JPanel(new GridLayout(15, 1));
		panel32 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel32.setBackground(Color.WHITE);
		panel33 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel33.setBackground(Color.WHITE);
		panel34 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel34.setBackground(Color.WHITE);
		panel35 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel35.setBackground(Color.WHITE);
		panel36 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel36.setBackground(Color.WHITE);
		panel37 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel37.setBackground(Color.WHITE);
		panel38 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel38.setBackground(Color.WHITE);
		panel39 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel39.setBackground(Color.WHITE);
		
		
		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11,BorderLayout.CENTER);
		mainPanel1.add(panel12,BorderLayout.SOUTH);
		mainPanel1p.add(panel13,BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);

		mainPanel2.add(tea);
		mainPanel2.add(editG);
		mainPanel2.add(Criteria);
		mainPanel2.add(FillScore);
		mainPanel2.add(TotalScore);
		mainPanel2.add(exportG);
		this.add(mainPanel2, BorderLayout.WEST);
		;

		panel31.add(id);
		panel32.add(txt);
		panel33.add(toturial);
		panel34.add(one);
		panel35.add(two);
		panel36.add(three);
		panel37.add(four);
		panel38.add(five);
		panel39.add(six);
		mainPanel3.add(panel31);
		mainPanel3.add(panel32);
		mainPanel3.add(panel33);
		mainPanel3.add(panel34);
		mainPanel3.add(panel35);
		mainPanel3.add(panel36);
		mainPanel3.add(panel37);
		mainPanel3.add(panel38);
		mainPanel3.add(panel39);
		mainPanel3.setBackground(Color.WHITE);
		this.add(mainPanel3, BorderLayout.CENTER);
		editG.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage.editGrade();

			}
		});
		exportG.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.Export();
			}
		});
		tea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.List();
			}
		});
		TotalScore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.Fill();
			}
		});
		FillScore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.Total();
			}
		});
		Criteria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.Criteria();
			}
		});
		
		pack();
		setTitle("THAMMASAT UNIVERSITY");
		setSize(1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.setResizable(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiHomepage uh = new UiHomepage();
	}

}