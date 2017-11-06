package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class UiExport extends JFrame{
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel mainPanel3;
	JLabel head;
	JLabel export;
	JButton back;
	JButton browse;
	JButton save;
	JButton edit;
	JTextArea txt;
	JTextArea txt1;
	
	public UiExport(){
		panel1 = new JPanel();
		panel1.setBackground(new Color(255,193,37));
		head = new JLabel("สำนักงานทะเบียนนักศึกษา");
		panel2 = new JPanel();
		panel2.setBackground(new Color(255,236,139));
		back = new JButton("BACK");
		back.setBackground(new Color(255,127,0));
		panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		export = new JLabel("Export Grade");
		panel31 = new JPanel();
		panel31.setBackground(Color.WHITE);
		browse = new JButton("BROWSE");
		txt = new JTextArea(1, 20);
		txt.setBorder(new LineBorder(Color.BLACK));
		mainPanel3 = new JPanel();
		mainPanel3.setBackground(Color.WHITE);
		panel32 = new JPanel();
		panel32.setBackground(Color.WHITE);
		txt1 = new JTextArea(10,40);
		txt1.setBorder(new LineBorder(Color.BLACK));
		panel33 = new JPanel();
		panel33.setBackground(Color.WHITE);
		save = new JButton("SAVE");
		edit = new JButton("EDIT");
		
		panel1.add(head);
		this.add(panel1,BorderLayout.NORTH);
		
		panel2.add(back);
		this.add(panel2,BorderLayout.WEST);
		
		panel3.add(export);
		panel31.add(browse);
		panel31.add(txt);
		panel32.add(txt1);
		panel33.add(edit);
		panel33.add(save);
		JPanel test1 = new JPanel(new GridLayout(2, 1));
		test1.add(panel3);
		test1.add(panel31);
		//test2.add(panel33);
		mainPanel3.add(test1);
		mainPanel3.add(panel32);
		mainPanel3.add(panel33);
		this.add(mainPanel3,BorderLayout.CENTER);
		setTitle("THAMMASAT UNIVERSITY");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiExport ue = new UiExport();
	}

}
