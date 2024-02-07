class Alex
{
	public static void main(String alex[])
	{
		int a = 10;
		int b = 20;
		int c = (a > b) ? a : b;
		String Msg = (c % 2 == 0) ? "Even" :"Odd";
		System.out.println("Greatest Number = "+c+"\n It is "+Msg);
	}
}
