package Gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TextArea 
{

	static Container c;
	static JButton btn;
	static JLabel sum;
	static JTextArea area;
	static Font f = new Font("Arial", Font.BOLD, 25);
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(200, 221, 450, 410);
		
		c = frame.getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(null);
		
		area = new JTextArea();
		area.setFont(f);
		
		area.setForeground(Color.BLUE);
		area.setBounds(100, 50, 200, 200);
		
		btn = new JButton("No of letters");
		btn.setBounds(150, 260, 120, 40);
		
		
		
		sum = new JLabel("sum");
		sum.setForeground(Color.RED);
		sum.setBounds(190, 310, 100, 30);
		sum.setFont(f);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				event();
			}

			
		});
		
		
		c.add(area);
		c.add(btn);
		c.add(sum);
		frame.setResizable(false);
	}
	public static void event() {
		String s=area.getText();
		sum.setText(Integer.toString(s.length()));
	}

}
