// WAP To Display Uppercased/Lowercased A To Z Using For Loop.
public class Alphabets
{
	public static void main(String args[])
	{
		char ch;
		for(ch = 'A' ; ch <= 'Z' ; ch++)	// UpperCased
		System.out.print(ch+ " ");
		{
			System.out.print("\n");							
			for(ch = 'a' ; ch <= 'z' ; ch++)	// LowerCased
			System.out.print(" " +ch);
		}
	}
}