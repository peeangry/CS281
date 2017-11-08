package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Control.HomePage;
import Model.FileConection;

public class UiScoreG extends JFrame {
	JPanel panel11;
	JPanel panel12;
	JPanel panel2;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel panel34;
	JPanel panel35;
	JPanel panel36;
	JPanel panel37;
	JPanel panel38;
	JPanel panel39;
	JPanel panel310;
	JPanel panel4;
	JPanel mainPanel1;
	JPanel mainPanel3;
	JLabel head;
	JLabel g;
	JLabel grade;
	JLabel A;
	JLabel Bp;
	JLabel B;
	JLabel Cp;
	JLabel C;
	JLabel Dp;
	JLabel D;
	JLabel F;
	JLabel signA;
	JLabel signBp;
	JLabel signB;
	JLabel signCp;
	JLabel signC;
	JLabel signDp;
	JLabel signD;
	JLabel signF;
	JLabel thammasat;
	JButton back;
	JButton save;
	JButton clear;
	JButton edit;
	JTextField txta;
	JTextField txta1;
	JTextField txtbp;
	JTextField txtbp1;
	JTextField txtb;
	JTextField txtb1;
	JTextField txtcp;
	JTextField txtcp1;
	JTextField txtc;
	JTextField txtc1;
	JTextField txtdp;
	JTextField txtdp1;
	JTextField txtd;
	JTextField txtd1;
	JTextField txtf;
	JTextField txtf1;

	public UiScoreG() {
		this.setLayout(new BorderLayout());
		mainPanel1 = new JPanel(new GridLayout(2, 1));
		panel11 = new JPanel();
		panel11.setBackground(new Color(255,193,37));
		panel12 = new JPanel();
		panel12.setBackground(new Color(255,193,37));
		head = new JLabel("OFFICE OF THE REGISTRAION");
		head.setForeground(Color.WHITE);
		head.setFont(new Font("tahoma",Font.BOLD,30));
		thammasat = new JLabel("THAMMASAT UNIVERSITY");
		thammasat.setForeground(Color.WHITE);
		thammasat.setFont(new Font("tahoma",Font.BOLD,18));
		panel2 = new JPanel();
		panel2.setBackground(new Color(255, 236, 139));
		back = new JButton("BACK");
		back.setBackground(new Color(255, 127, 0));
		mainPanel3 = new JPanel(new GridLayout(11, 1));
		mainPanel3.setBackground(Color.WHITE);
		panel31 = new JPanel();
		panel31.setBackground(Color.WHITE);
		panel32 = new JPanel();
		panel32.setBackground(Color.WHITE);
		panel33 = new JPanel();
		panel33.setBackground(Color.WHITE);
		panel34 = new JPanel();
		panel34.setBackground(Color.WHITE);
		panel35 = new JPanel();
		panel35.setBackground(Color.WHITE);
		panel36 = new JPanel();
		panel36.setBackground(Color.WHITE);
		panel37 = new JPanel();
		panel37.setBackground(Color.WHITE);
		panel38 = new JPanel();
		panel38.setBackground(Color.WHITE);
		panel39 = new JPanel();
		panel39.setBackground(Color.WHITE);
		panel310 = new JPanel();
		panel310.setBackground(Color.WHITE);
		g = new JLabel("Grade confix");
		grade = new JLabel("Grade :");
		A = new JLabel("A  :  ");
		txta = new JTextField(3);
		signA = new JLabel("<=");
		txta1 = new JTextField(3);
		Bp = new JLabel("B+  : ");
		txtbp = new JTextField(3);
		signBp = new JLabel("<=");
		txtbp1 = new JTextField(3);
		B = new JLabel("B  :  ");
		txtb = new JTextField(3);
		signB = new JLabel("<=");
		txtb1 = new JTextField(3);
		Cp = new JLabel("C+  : ");
		txtcp = new JTextField(3);
		signCp = new JLabel("<=");
		txtcp1 = new JTextField(3);
		C = new JLabel("C  :  ");
		txtc = new JTextField(3);
		signC = new JLabel("<=");
		txtc1 = new JTextField(3);
		Dp = new JLabel("D+  : ");
		txtdp = new JTextField(3);
		signDp = new JLabel("<=");
		txtdp1 = new JTextField(3);
		D = new JLabel("D  :  ");
		txtd = new JTextField(3);
		signD = new JLabel("<=");
		txtd1 = new JTextField(3);
		F = new JLabel("F  :  ");
		txtf = new JTextField(3);
		signF = new JLabel("<=");
		txtf1 = new JTextField(3);
		panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		save = new JButton("SAVE");
		clear = new JButton("CLEAR");
		edit = new JButton("EDIT");
		txta.setText("100");
		txta1.setText("80");
		txtbp.setText("79.9");
		txtbp1.setText("75");
		txtb.setText("74.9");
		txtb1.setText("70");
		txtcp.setText("69.9");
		txtcp1.setText("65");
		txtc.setText("64.9");
		txtc1.setText("60");
		txtdp.setText("59.9");
		txtdp1.setText("55");
		txtd.setText("54.9");
		txtd1.setText("50");
		txtf.setText("49.9");
		txtf1.setText("0");
		txta.setEditable(false);
		txta1.setEditable(false);
		txtbp.setEditable(false);
		txtbp1.setEditable(false);
		txtb.setEditable(false);
		txtb1.setEditable(false);
		txtcp.setEditable(false);
		txtcp1.setEditable(false);
		txtc.setEditable(false);
		txtc1.setEditable(false);
		txtdp.setEditable(false);
		txtdp1.setEditable(false);
		txtd.setEditable(false);
		txtd1.setEditable(false);
		txtf.setEditable(false);
		txtf1.setEditable(false);
		
		panel11.add(head);
		panel12.add(thammasat);
		mainPanel1.add(panel11);
		mainPanel1.add(panel12);
		this.add(mainPanel1, BorderLayout.NORTH);

		panel2.add(back);
		this.add(panel2, BorderLayout.WEST);

		panel31.add(g);
		panel32.add(grade);
		panel33.add(A);
		panel33.add(txta);
		panel33.add(signA);
		panel33.add(txta1);
		panel34.add(Bp);
		panel34.add(txtbp);
		panel34.add(signBp);
		panel34.add(txtbp1);
		panel35.add(B);
		panel35.add(txtb);
		panel35.add(signB);
		panel35.add(txtb1);
		panel36.add(Cp);
		panel36.add(txtcp);
		panel36.add(signCp);
		panel36.add(txtcp1);
		panel37.add(C);
		panel37.add(txtc);
		panel37.add(signC);
		panel37.add(txtc1);
		panel38.add(Dp);
		panel38.add(txtdp);
		panel38.add(signDp);
		panel38.add(txtdp1);
		panel39.add(D);
		panel39.add(txtd);
		panel39.add(signD);
		panel39.add(txtd1);
		panel310.add(F);
		panel310.add(txtf);
		panel310.add(signF);
		panel310.add(txtf1);
		panel4.add(edit);
		panel4.add(save);
		panel4.add(clear);
		mainPanel3.add(panel31);
		mainPanel3.add(panel32);
		mainPanel3.add(panel33);
		mainPanel3.add(panel34);
		mainPanel3.add(panel35);
		mainPanel3.add(panel36);
		mainPanel3.add(panel37);
		mainPanel3.add(panel38);
		mainPanel3.add(panel39);
		mainPanel3.add(panel310);
		mainPanel3.add(panel4);
		this.add(mainPanel3, BorderLayout.CENTER);
		edit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txta.setEditable(true);
				txta1.setEditable(true);
				txtbp.setEditable(true);
				txtbp1.setEditable(true);
				txtb.setEditable(true);
				txtb1.setEditable(true);
				txtcp.setEditable(true);
				txtcp1.setEditable(true);
				txtc.setEditable(true);
				txtc1.setEditable(true);
				txtdp.setEditable(true);
				txtdp1.setEditable(true);
				txtd.setEditable(true);
				txtd1.setEditable(true);
				txtf.setEditable(true);
				txtf1.setEditable(true);

			}
		});
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txta.setEditable(false);
				txta1.setEditable(false);
				txtbp.setEditable(false);
				txtbp1.setEditable(false);
				txtb.setEditable(false);
				txtb1.setEditable(false);
				txtcp.setEditable(false);
				txtcp1.setEditable(false);
				txtc.setEditable(false);
				txtc1.setEditable(false);
				txtdp.setEditable(false);
				txtdp1.setEditable(false);
				txtd.setEditable(false);
				txtd1.setEditable(false);
				txtf.setEditable(false);
				txtf1.setEditable(false);

			}
		});
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txta.setText("");
				txta1.setText("");
				txtbp.setText("");
				txtbp1.setText("");
				txtb.setText("");
				txtb1.setText("");
				txtcp.setText("");
				txtcp1.setText("");
				txtc.setText("");
				txtc1.setText("");
				txtdp.setText("");
				txtdp1.setText("");
				txtd.setText("");
				txtd1.setText("");
				txtf.setText("");
				txtf1.setText("");
				txta.setEditable(true);
				txta1.setEditable(true);
				txtbp.setEditable(true);
				txtbp1.setEditable(true);
				txtb.setEditable(true);
				txtb1.setEditable(true);
				txtcp.setEditable(true);
				txtcp1.setEditable(true);
				txtc.setEditable(true);
				txtc1.setEditable(true);
				txtdp.setEditable(true);
				txtdp1.setEditable(true);
				txtd.setEditable(true);
				txtd1.setEditable(true);
				txtf.setEditable(true);
				txtf1.setEditable(true);
			}
		});
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage.back();
			}
		});
		pack();
		setTitle("THAMMASAT UNIVERSITY");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiScoreG us = new UiScoreG();
	}

}