// WAP To print The Add , And Sub Using this Operator.
class Shadow1
{
	int a, b;
	void store(int a , int b)
	{
		this.a = a;
		this.b = b; 
		// Istanc <=> Local
	}
	void add()
	{
		System.out.println("Add = "+(a+b));
	}
	void sub()
	{
		System.out.println("Sub = "+(a-b));
	}	
	public static void main(String alex[])
	{
		Shadow1 s = new Shadow1();
		s.add();
		s.store(10,20);
		s.add();
		s.sub();
	}
}		