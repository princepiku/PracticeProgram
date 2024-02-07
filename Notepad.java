// WAP to Open Notepad.
import java.util.*;
import java.io.*;
public class Notepad
{
	public static void main(String args[])
	{
		Runtime rs = Runtime.getRuntime();
		try
		{
			rs.exec("notepad");
		}
		catch(IOException e)
		{
			System.out.print(e);
		}
	}
}