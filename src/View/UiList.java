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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Control.HomePage;
import Model.FileConection;

public class UiList extends JFrame implements ActionListener{
	JPanel panel11;
	JPanel panel12;
	JPanel panel13;
	JPanel panel2;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel mainPanel1;
	JPanel mainPanel1p;
	JPanel mainPanel3;
	JLabel head;
	JLabel thammasat;
	JLabel picLabel;
	JButton back;
	JButton open;
	JButton save;
	JTextArea txt;
	JTextField txt1;
	JScrollPane sp;
	ImageIcon img;
	
	public UiList(){
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
		panel2.setBackground(new Color(255, 236, 139));
		back = new JButton("BACK");
		back.setPreferredSize(new Dimension(175, 50));
		back.setBackground(new Color(255, 127, 0));
		back.setFont(new Font("tahoma",Font.BOLD,16));
		mainPanel3 = new JPanel(new GridLayout(3, 1));
		mainPanel3.setBackground(Color.WHITE);
		mainPanel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel31 = new JPanel();
		panel31.setBackground(Color.WHITE);
		panel32 = new JPanel();
		panel32.setBackground(Color.WHITE);
		panel33 = new JPanel();
		panel33.setBackground(Color.white);
		txt = new JTextArea();
		txt.setBorder(new LineBorder(Color.BLACK));
		txt.setEditable(false);
		sp = new JScrollPane(txt);
		sp.setPreferredSize(new Dimension(400, 140));
		open = new JButton("OPEN");
		txt1 = new JTextField(25);
		save = new JButton("SAVE");
		
		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11,BorderLayout.CENTER);
		mainPanel1.add(panel12,BorderLayout.SOUTH);
		mainPanel1p.add(panel13,BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);
		
		panel2.add(back);
		this.add(panel2, BorderLayout.WEST);
		
		panel31.add(sp);
		panel32.add(open);
		panel32.add(txt1);
		panel33.add(save);
		mainPanel3.add(panel31);
		mainPanel3.add(panel32);
		mainPanel3.add(panel33);
		this.add(mainPanel3,BorderLayout.CENTER);
		
		open.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
					FileConection.openFile(txt);	
			}
		});
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					FileConection.saveFile(txt);
			}
		});
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage.back();
			}
		});

		this.setResizable(false);
		setSize(1000, 800);
		setTitle("THAMMASAT UNIVERSITY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		UiList ui = new UiList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}