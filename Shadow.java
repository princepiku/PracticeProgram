// WAP To Display Data Shadowing.
class Shadow
{
	int prince = 22; // Instance Variable.
	void call()
	{
		int prince = 25; // Local Variable.
		System.out.println("Calling : "+prince);
		System.out.println("Instance Variable : "+this.prince); // Data Shodowing.
	}
	public static void main(String alex[])
	{
		Shadow p = new Shadow();
		p.call();
		add();
		// System.out.print("Void Main Value : "+p.prince);
	}
	static void add()
	{
		System.out.println("Static Method");
	}
}