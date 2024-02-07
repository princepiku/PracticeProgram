// WAP to print .....
import java.util.Date;
import java.awt.*;
public class Main
{
	public static void main(String args[])
	{
		int myAge = 30;
		long viewCount = 3_123_456_789L;
		float price = 10.99F;
		char letter = 'A';
		boolean iseligible = false;
		int herAge = myAge;
		byte X = 1;
		byte Y = X;
		X = 2;
		int [] numbers = {2,3,5,1,4};
		Date now = new Date();
		String message = "   Hello World"+   "!!";
		System.out.println(numbers);
		System.out.println(message);
		System.out.println(numbers.length);
		System.out.println(message.endsWith("!!"));
		System.out.println(message.startsWith("!!"));
		System.out.println(message.length());
		System.out.println(message.indexOf("H"));
		System.out.println(message.indexOf("e"));
		System.out.println(message.indexOf("sky"));
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		System.out.println(herAge);
		System.out.println("now");
		System.out.println(now);
		System.out.println(Y);
		System.out.print("Null");
	}
}