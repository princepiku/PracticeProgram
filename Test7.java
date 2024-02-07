// WAP To Check The Number Is Two(2) Digit Number Or Three(3) Digit Number Or Greater Than Three(3) Digit Number.
class Test7
{
	public static void main(String alex[])
	{
		int x = Integer.parseInt(alex[0]);
		if(x >= 0 && x < 10)
			System.out.println(x+" is a Single Digit Number");
		else if(x >= 10 && x < 100)
			System.out.println(x+" is a Double Digit Number");
		else if(x >= 100 && x < 1000)
			System.out.println(x+" is a Triple Digit Number");
		else if(x >= 1000 && x < 10000)
			System.out.println(x+" is a Four Digit Number");
		else if(x >= 10000 && x < 100000)
			System.out.println(x+" is a Five Digit Number");
		else if(x >= 100000 && x < 1000000)	
			System.out.println(x+" is a Greater Than Five Digit Number");
		else
			System.out.println(x+" Negative is Not Allowed");
	}
}