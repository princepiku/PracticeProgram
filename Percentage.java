// Percentage Division.
class Percentage
{
	public static void main(String alex[])
	{
		int x = Integer.parseInt(alex[0]);
		double y = (x / 500.0) * 100;
		if(y >= 60)
			System.out.print(y+" : 1st Division");
			else if(y >= 45)
				System.out.print(y+" : 2nd Division");
			else if(y >= 30)
				System.out.print(y+" : 3rd Division");
			else
				System.out.print(y+" : ! Bad Luck You Are Fail");
	}
}