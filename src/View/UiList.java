package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import Model.FileConection;

public class UiList extends JPanel implements ActionListener{
	private JButton b1,b2,b3;
	private JTextArea a;
	private JScrollPane sp;
	private JPanel p1;
	String so;
	JFileChooser jf ;
	 public UiList() {
		 this.setLayout(new BorderLayout());
		 a = new JTextArea();
		 sp = new JScrollPane(a);
		 b1 = new JButton("Open");
		 b2 = new JButton("Save");
		 b3 = new JButton("Next");
		 p1=new JPanel();
		 sp.setPreferredSize(new Dimension(400, 200));
		 a.setBorder(new LineBorder(Color.BLACK));
		 p1.add(b1);
		 p1.add(b2);
		 p1.add(b3);
		 this.add(sp,BorderLayout.NORTH);
		 this.add(p1,BorderLayout.CENTER);
		 b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileConection.openFile(a);
			}
		});
		 b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileConection.saveFile(a);
			}
		});
		 b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Young mai dai tam ja");
				
			}
		});
	 }
	 public static void main(String[] args) {
		 UiList ul = new UiList();
			JFrame f = new JFrame();
			f.setSize(600, 400);
			f.add(ul);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
