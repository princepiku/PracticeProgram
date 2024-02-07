package P2;
import P1.Demo;
public class Demo2
{
	void display()
	{
		System.out.println("Display Method Of Demo2 Class");
	}
	public static void main(String alex[])
	{
		Demo2 d2 = new Demo2();
		d2.display();
		Demo d = new Demo();
		int a = d.show();
		System.out.println("Private Data X = "+a);
	}
}