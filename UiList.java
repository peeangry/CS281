package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
	JPanel panel2;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel mainPanel1;
	JPanel mainPanel3;
	JLabel head;
	JLabel thammasat;
	JButton back;
	JButton open;
	JButton save;
	JTextArea txt;
	JTextField txt1;
	JScrollPane sp;
	
	public UiList(){
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
		mainPanel1.add(panel11);
		mainPanel1.add(panel12);
		this.add(mainPanel1, BorderLayout.NORTH);
		
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

		setSize(800, 600);
		setTitle("THAMMASAT UNIVERSITY");
	//	add(ui);
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