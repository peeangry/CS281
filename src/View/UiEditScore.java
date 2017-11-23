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

import Control.HomePage;

public class UiEditScore extends JFrame{
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
	ImageIcon img;
	JButton back;
	
	public UiEditScore(){
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
		panel32 = new JPanel(new BorderLayout());
		panel32.setBackground(Color.WHITE);
		
		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11,BorderLayout.CENTER);
		mainPanel1.add(panel12,BorderLayout.SOUTH);
		mainPanel1p.add(panel13,BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);
		
		panel2.add(back);
		
		mainPanel3.setLayout(new BorderLayout());
		mainPanel3.add(panel32,BorderLayout.CENTER);
		back.addActionListener(new ActionListener() {
			
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
		UiEditScore ues = new UiEditScore();
	}

}
