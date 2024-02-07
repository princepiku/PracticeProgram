// WAP To Enter The Character And Check The Character Is Vowel And Consonant.
class Check1
{
	public static void main(String alex[])
	{
		char ch = (alex[0]).charAt(0);
		switch(ch)
		{
			case'a': System.out.print(ch+ " is a Vowel");
			break;
			case'e': System.out.print(ch+ " is a Vowel");
			break;
			case'i': System.out.print(ch+ " is a Vowel");
			break;
			case'o': System.out.print(ch+ " is a Vowel");
			break;
			case'u': System.out.print(ch+ " is a Vowel");
			break;
			case'A': System.out.print(ch+ " is a Vowel");
			break;
			case'E': System.out.print(ch+ " is a Vowel");
			break;
			case'I': System.out.print(ch+ " is a Vowel");
			break;
			case'O': System.out.println(ch+ " is a Vowel");
			break;
			case'U': System.out.print(ch+ " is a Vowel");
			break;
			default: System.out.print(ch+ " is a Consonant");
		}
	}
}