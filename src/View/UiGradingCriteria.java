package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.JTextField;

import Control.HomePage;
import Model.FileConection;
import Model.Point;

public class UiGradingCriteria extends JFrame{
	JPanel panel11;
	JPanel panel12;
	JPanel panel13;
	JPanel panel2;
	JPanel panel3;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel panel34;
	JPanel panel35;
	JPanel panel4;
	JPanel mainPanel1;
	JPanel mainPanel1p;
	JPanel mainPanel3;
	JPanel mainPanel3p;
	JLabel head;
	JLabel thammasat;
	JLabel picLabel;
	JLabel midterm;
	JLabel final1;
	JLabel reward;
	JLabel scoremid;
	JLabel scorefin;
	JLabel scorere;
	JLabel pop;
	ImageIcon img;
	JButton back;
	JButton edit;
	JButton save;
	JTextField midtxt;
	JTextField finaltxt;
	JTextField retxt;
	private static double mid=40,fin=40,re=20;
	public UiGradingCriteria(){
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
		mainPanel3 = new JPanel();
		mainPanel3.setBackground(Color.WHITE);
		mainPanel3p = new JPanel(new BorderLayout());
		mainPanel3p.setBackground(Color.WHITE);
		panel31 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel31.setBackground(Color.WHITE);
		pop = new JLabel("Proportion of points :");
		pop.setFont(new Font("tahoma",Font.BOLD,28));
		panel32 = new JPanel();
		panel32.setBackground(Color.WHITE);
		reward = new JLabel("REWARD POINT : ");
		reward.setFont(new Font("tahoma",Font.BOLD,18));
		retxt = new JTextField(5);
		scorere = new JLabel("  SCORE");
		scorere.setFont(new Font("tahoma",Font.BOLD,18));
		midterm = new JLabel("           MIDTERM : ");
		midterm.setFont(new Font("tahoma",Font.BOLD,18));
		midtxt = new JTextField(5);
		scoremid = new JLabel("   SCORE");
		scoremid.setFont(new Font("tahoma",Font.BOLD,18));
		panel33 = new JPanel();
		panel33.setBackground(Color.WHITE);
		final1 = new JLabel("                  FINAL : ");
		final1.setFont(new Font("tahoma",Font.BOLD,18));
		finaltxt = new JTextField(5);
		scorefin = new JLabel("   SCORE");
		scorefin.setFont(new Font("tahoma",Font.BOLD,18));
		panel34 = new JPanel();
		panel34.setBackground(Color.WHITE);
		panel35 = new JPanel();
		panel35.setBackground(Color.WHITE);
		panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		edit = new JButton("EDIT");
		save = new  JButton("SAVE");
		retxt.setEditable(false);
		midtxt.setEditable(false);
		finaltxt.setEditable(false);
		if (FileConection.getCriteria()) {
			retxt.setText(Point.getCri(0) + "");
			midtxt.setText(Point.getCri(1) + "");
			finaltxt.setText(Point.getCri(2) + "");
			
		} else {
			retxt.setText(re + "");
			midtxt.setText(mid+"");
			finaltxt.setText(fin+"");
			
		}
		
		retxt.setText(re + "");
		midtxt.setText(mid+"");
		finaltxt.setText(fin+"");
		
		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11,BorderLayout.CENTER);
		mainPanel1.add(panel12,BorderLayout.SOUTH);
		mainPanel1p.add(panel13,BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);
		panel35.setLayout(new BorderLayout());
		panel2.add(back);
		mainPanel3.setLayout(new BorderLayout());
		panel32.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panel33.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panel34.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		//mainPanel3.setLayout(new BorderLayout());
		panel31.add(pop);
		panel32.add(reward);
		panel32.add(retxt);
		panel32.add(scorere);
		panel33.add(midterm);
		panel33.add(midtxt);
		panel33.add(scoremid);
		panel34.add(final1);
		panel34.add(finaltxt);
		panel34.add(scorefin);
		panel35.add(panel33,BorderLayout.NORTH);
		panel35.add(panel34,BorderLayout.CENTER);
		panel4.add(edit);
		panel4.add(save);
		//mainPanel3.add(panel31);
		
		mainPanel3.add(panel32,BorderLayout.NORTH);
		mainPanel3.add(panel35,BorderLayout.CENTER);
		//mainPanel3.add(panel34,BorderLayout.SOUTH);
		
		mainPanel3p.add(panel31,BorderLayout.NORTH);
		mainPanel3p.add(mainPanel3,BorderLayout.CENTER);
		mainPanel3p.add(panel4,BorderLayout.SOUTH);
		this.add(mainPanel3p);
	
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.back();
			}
		});
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				retxt.setEditable(true);
				midtxt.setEditable(true);
				finaltxt.setEditable(true);
			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				retxt.setEditable(false);
				midtxt.setEditable(false);
				finaltxt.setEditable(false);
				re = Double.parseDouble(retxt.getText());
				mid = Double.parseDouble(midtxt.getText());
				fin = Double.parseDouble(finaltxt.getText());
				Point.keepCriteria();
			}
		});
		this.setBackground(new Color(255,236,139));
		this.add(mainPanel1p,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.WEST);
		this.add(mainPanel3p,BorderLayout.CENTER);
		this.setResizable(false);
		setTitle("THAMMASAT UNIVERSITY");
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


	public static double getMid() {
		return mid;
	}

	public static double getFin() {
		return fin;
	}

	public static double getRe() {
		return re;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiGradingCriteria ues = new UiGradingCriteria();
	}

	

}
