package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UiHomepage extends JFrame{
	JPanel panel1;
	JPanel panel21;
	JPanel panel22;
	JPanel panel23;
	JPanel panel24;
	JPanel panel31;
	JPanel panel32;
	JPanel mainPanel2;
	JPanel mainPanel3;
	JLabel head;
	JLabel id;
	JLabel txt;
	JButton back;
	JButton tea;
	JButton editG;
	JButton exportG;
	
	public UiHomepage(){
		panel1 = new JPanel();
		panel1.setBackground(new Color(255,193,37));
		head = new JLabel("สำนักงานทะเบียนนักศึกษา");
		mainPanel2 = new JPanel(new GridLayout(10, 1,15,15));
		mainPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel2.setBackground(new Color(255,236,139));
		panel21 = new JPanel();
		panel21.setBackground(new Color(255,236,139));
		panel22 = new JPanel();
		panel22.setBackground(new Color(255,236,139));
		panel23 = new JPanel();
		panel23.setBackground(new Color(255,236,139));
		panel24 = new JPanel();
		panel24.setBackground(new Color(255,236,139));
		back = new JButton("BACK");
		back.setBackground(new Color(255,127,0));
		tea = new JButton("PROFILE");
		tea.setBackground(new Color(255,127,0));
		editG = new JButton("EDIT GRADE");
		editG.setBackground(new Color(255,127,0));
		exportG = new JButton("EXPORT GRADE");
		exportG.setBackground(new Color(255,127,0));
		panel31 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel31.setBackground(Color.WHITE);
		id = new JLabel("รหัศนักศึกษา : ");
		id.setFont(new Font("tahoma",Font.BOLD,20));
		txt = new JLabel("ยินดีต้อนรับสู้ระบบบริการการศึกษา");
		mainPanel3 = new JPanel(new GridLayout(15, 1));
		panel32 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel32.setBackground(Color.WHITE);
		
		panel1.add(head);
		this.add(panel1,BorderLayout.NORTH);
		
		mainPanel2.add(back);
		mainPanel2.add(tea);
		mainPanel2.add(editG);
		mainPanel2.add(exportG);
		this.add(mainPanel2,BorderLayout.WEST);;
		
		panel31.add(id);
		panel32.add(txt);
		mainPanel3.add(panel31);
		mainPanel3.add(panel32);
		mainPanel3.setBackground(Color.WHITE);
		this.add(mainPanel3,BorderLayout.CENTER);
		
		pack();
		setTitle("THAMMASAT UNIVERSITY");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiHomepage uh = new UiHomepage();
	}

}
