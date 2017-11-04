package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import Model.FileConection;

public class UiExport extends JPanel implements ActionListener{
	private JButton b1,b2,b3;
	private JTextArea a;
	private JScrollPane sp;
	public static JLabel filename;
	private JPanel p1,p2;
	String so;
	//JFileChooser jf ;
	 public UiExport() {
		 this.setLayout(new BorderLayout());
		 a = new JTextArea();
		 sp = new JScrollPane(a);
		 b1 = new JButton("Browse");
		 b2 = new JButton("Save");
		 b3 = new JButton("Next");
		 p1=new JPanel();
		 p2=new JPanel();
		 filename = new JLabel(".........");
		 sp.setPreferredSize(new Dimension(400, 200));
		 a.setBorder(new LineBorder(Color.BLACK));
		 p2.setLayout(new FlowLayout());
		 p2.add(b1);
		 p2.add(filename);
		 p1.add(b2);
		 p1.add(b3);
		 this.add(p2,BorderLayout.NORTH);
		 this.add(sp,BorderLayout.CENTER);
		 this.add(p1,BorderLayout.SOUTH);

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
		 UiExport ue = new UiExport();
			JFrame f = new JFrame();
			f.setSize(600, 400);
			f.setTitle("Last Check");
			f.add(ue);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
