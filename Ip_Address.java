// WAP to display the IP ADDRESS in your computer.
import java.net.InetAddress;
public class Ip_Address
{
	public static void main(String args[]) throws Exception
	{
		// Print The IP ADDRESS Of Your Computer.
		System.out.print(InetAddress.getLocalHost());
	}
}