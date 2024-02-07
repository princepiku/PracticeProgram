package P1.P2.P3;
import P1.Demo;
public class Demo3 extends Demo
{
	void display()
	{
		System.out.println("Display Method Of Demo3 Class");
	}
	public static void main(String alex[])
	{
		System.out.println("\n-----Using Inheritance-----\n");
		Demo3 d3 = new Demo3();		// Inheritance
		d3.display();
		d3.show();
		d3.call();					
		Demo d = new Demo();		// Association
		int a = d.show();
		//d.call();
		System.out.println("Private Data X = "+a);
	}
}