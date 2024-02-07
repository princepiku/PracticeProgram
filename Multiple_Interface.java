// 12. (2) Multiple Interface.

interface Parent
{
	abstract void display();
}
interface Child
{
	abstract void show();
}
class Son implements Parent, Child
{
	public void display()
	{
		System.out.println("Display Method");
	}
	public void show()
	{
		System.out.println("Show Method");
	}
}
public class Multiple_Interface
{
	public static void main(String alex[])
	{
		Son s = new Son();
		s.display();
		s.show();
	}
}

