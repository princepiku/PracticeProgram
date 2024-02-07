// WAP To Check The Year Is Leap Year Or Not.
class Leap
{
	public static void main(String alex[])
	{
		int y = Integer.parseInt(alex[0]);
		String str = ((y % 400 != 0 && y % 100 == 0) || (y % 4 != 0)) ? "is Not a Leap Year" : " is a Leap Year";
		System.out.print(y+" "+str);
	}
}