package P1;
public class Demo1
{
	void display()
	{
		System.out.println("Display Method Of Demo1 Class");
	}
	public static void main(String alex[])
	{
		Demo1 d1 = new Demo1();
		d1.display();
		Demo d = new Demo();
		d.show();
		//System.out.println("Private Data X = "+d.x);		//x is a private data of Demo Class, so it don’t be access
	}
}