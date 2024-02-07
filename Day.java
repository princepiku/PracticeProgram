// WAP To Enter The Number And Check The Number is Day.
class Day
{
	public static void main(String alex[])
	{
		
		System.out.print("User Enter The Number For Day : ");
		int day = Integer.parseInt(alex[0]);
		switch(day)
		{
			case 1: System.out.print("Sunday");
			break;
			case 2: System.out.print("Monday");
			break;
			case 3: System.out.print("Tuesday");
			break;
			case 4: System.out.print("Wednesday");
			break;
			case 5: System.out.print("Thursday");
			break;
			case 6: System.out.print("Friday");
			break;
			case 7: System.out.print("Saturday");
			break;
			default: System.out.print("Invalid Day Input!");
		}
	}
}