// 12. Illustrate the Multiple Inheritance Using Interface. (1) Single Interface.

interface Parent
{
	abstract void show();
	abstract void display();
}
class Child implements Parent
{
	
	public void show()
	{
		System.out.println("Show Method");
	}
	public void display()
	{
		System.out.println("Display Method");
	}
}
public class Single_Interface
{
	public static void main(String alex[])
	{
		Child c = new Child();
		c.show();
		c.display();
	}
}
