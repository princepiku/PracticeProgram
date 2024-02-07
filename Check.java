// WAP To Enter Any Character Check The Character Is Vowel And Consonant.
public class Check
{
	public static void main(String alex[])
	{
	char ch = (alex[0]).charAt(0);
		//System.out.println("Invalid Input");
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U')
			System.out.println(ch+ " is a Vowel");
			else
				System.out.print(ch+ " is a Consonant");
	}
}