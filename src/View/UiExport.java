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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Control.HomePage;
import Model.FileConection;

public class UiExport extends JFrame{
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
	JLabel export;
	JLabel thammasat;
	JLabel picLabel;
	JButton back;
	JButton browse;
	JButton export1;
	JButton edit;
	JTextArea txt;
	static JTextArea txt1;
	JScrollPane sp;
	ImageIcon img;
	
	public UiExport(){
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
		panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		export = new JLabel("Export Grade");
		export.setFont(new Font("tahoma",Font.BOLD,20));
		panel31 = new JPanel();
		panel31.setBackground(Color.WHITE);
		browse = new JButton("BROWSE");
		txt = new JTextArea(1, 20);
		txt.setBorder(new LineBorder(Color.BLACK));
		mainPanel3 = new JPanel();
		mainPanel3.setBackground(Color.WHITE);
		panel32 = new JPanel(new BorderLayout());
		panel32.setBackground(Color.WHITE);
		txt1 = new JTextArea();
		txt1.setBorder(new LineBorder(Color.BLACK));
		txt1.setEditable(false);
		sp = new JScrollPane(txt1);
		sp.setPreferredSize(new Dimension(400, 200));
		panel33 = new JPanel();
		panel33.setBackground(Color.WHITE);
		export1 = new JButton("Import Grade To Registration");
		export1.setPreferredSize(new Dimension(panel32.getWidth(), 30));
		edit = new JButton("EDIT");
		
		panel11.add(head);
		panel12.add(thammasat);
		panel13.add(picLabel);
		mainPanel1.add(panel11,BorderLayout.CENTER);
		mainPanel1.add(panel12,BorderLayout.SOUTH);
		mainPanel1p.add(panel13,BorderLayout.WEST);
		mainPanel1p.add(mainPanel1);
		this.add(mainPanel1p, BorderLayout.NORTH);
		
		panel2.add(back);
		
		panel3.add(export);
		panel31.add(browse);
		panel31.add(txt);
		panel32.add(sp);
		//panel33.add(edit);
		panel32.add(export1,BorderLayout.SOUTH);
		
		JPanel test1 = new JPanel(new GridLayout(2, 1));
		test1.add(panel3);
		test1.add(panel31);
		//test2.add(panel33);
		mainPanel3.setLayout(new BorderLayout());
		mainPanel3.add(test1,BorderLayout.NORTH);
		mainPanel3.add(panel32,BorderLayout.CENTER);
		//mainPanel3.add(panel33,BorderLayout.SOUTH);
		browse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileConection.openFile(txt1);
				if(FileConection.getPath()==null) {
					JOptionPane.showMessageDialog(null,"File is null ","Invalid File ",JOptionPane.ERROR_MESSAGE);
				}else {
				txt.setText(FileConection.getPath());
				}
			}
		});
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt1.setEditable(true);
				
			}
		});
		export1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileConection.saveFileExport();				
				
			}
		});
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				HomePage.back();
			}
		});
		this.setBackground(new Color(255,236,139));
		this.add(panel2,BorderLayout.WEST);
		this.add(mainPanel1p,BorderLayout.NORTH);
		this.add(mainPanel3,BorderLayout.CENTER);
		this.setResizable(false);
		setTitle("THAMMASAT UNIVERSITY");
		setSize(1000,800);
	//	add(ue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static JTextArea getTextArea() {
		return txt1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiExport ue = new UiExport();
	}

}