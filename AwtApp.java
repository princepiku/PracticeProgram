import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AwtApp extends Frame
{
	AwtApp()
	{
		Label un = new Label("Username : ");
		Label pd = new Label("Password : ");
		
		TextField  tf = new TextField();
		TextField tpf = new TextField();
		
		Button sb = new Button("Submit");
		
		un.setBounds(40,50,100,20);
		pd.setBounds(40,80,100,20);
		tf.setBounds(140,50,100,20);
		tpf.setBounds(140,80,100,20);
		sb.setBounds(100,110,100,20);
		
		
		add(un);
		add(pd);
		add(tf);
		add(tpf);
		add(sb);
		
		setSize(300,150);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String alex[])
	{
		AwtApp awt = new AwtApp();
	}
}
