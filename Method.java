// WAP To Show Method Over Loading.
class Method
{	
	void add(int a , int b)
	{
		System.out.println("Int = "+(a+b));
	}
	void add(int a , double b)
	{
		System.out.println("Int Double = "+(a+b));
	}
	void add(double a , double b)
	{
		System.out.println("Double Double = "+(a+b));
	}
	void add(int a , int b , int c)
	{
		System.out.println("3 Int = "+(a+b+c));
	}	
	public static void main(String alex[])
	{
		Method m = new Method();
		m.add(10,20);
		m.add(10,20.20);
		m.add(10.10,20);
		m.add(10.10,20.20);
		m.add(10,20,30);
	}
}