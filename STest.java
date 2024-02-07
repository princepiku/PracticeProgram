import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STest
{
	public static void main(String alex[])
	{
		JFrame f = new JFrame("Login Page !");
		final JLabel l = new JLabel();
		JLabel l1 = new JLabel("Username : ");
		JLabel l2  = new JLabel("Password : ");
		
		JTextField tf = new JTextField();
		final JPasswordField tpf = new JPasswordField();
		
		JButton b = new JButton("Login");
		
		l.setBounds(20,130,100,20);
		l1.setBounds(40,50,100,20);
		l2.setBounds(40,80,100,20);
		tf.setBounds(140,50,100,20);
		tpf.setBounds(140,80,100,20);
		b.setBounds(120,110,100,20);
		
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(tf);
		f.add(tpf);
		f.add(b);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				l.setText("Login Sucessfully !");
			}
		});
	}
}

		