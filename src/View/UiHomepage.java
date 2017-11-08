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
	JPanel mainPanel1;
	JPanel mainPanel1p;
	JPanel mainPanel2;
	JPanel mainPanel3;
	JLabel head;
	JLabel id;
	JLabel txt;
	JLabel idShow;
	JLabel thammasat;
	JLabel picLabel;
	JButton tea;
	JButton editG;
	JButton exportG;
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
		editG = new JButton("EDIT GRADE");
		editG.setBackground(new Color(255, 127, 0));
		editG.setFont(new Font("tahoma",Font.BOLD,16));
		exportG = new JButton("EXPORT GRADE");
		exportG.setBackground(new Color(255, 127, 0));
		exportG.setFont(new Font("tahoma",Font.BOLD,16));
		panel31 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel31.setBackground(Color.WHITE);
		id = new JLabel("ID : ");
		id.setFont(new Font("tahoma", Font.BOLD, 24));
		idShow = new JLabel("Student ID : ");
		idShow.setFont(new Font("tahoma", Font.BOLD, 26));
		txt = new JLabel("Welcome! To EDUCATIONAL SERVICE SYSTEM ");
		txt.setFont(new Font("tahoma",Font.BOLD,16));
		mainPanel3 = new JPanel(new GridLayout(15, 1));
		panel32 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel32.setBackground(Color.WHITE);
		
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
		mainPanel2.add(exportG);
		this.add(mainPanel2, BorderLayout.WEST);
		;

		panel31.add(id);
		panel32.add(txt);
		mainPanel3.add(panel31);
		mainPanel3.add(panel32);
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
		

		pack();
		setTitle("THAMMASAT UNIVERSITY");
		setSize(1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiHomepage uh = new UiHomepage();
	}

}