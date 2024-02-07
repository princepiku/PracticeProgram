// 12. (3) Inherited Interface.

interface Parent
{
	abstract void show();
}
interface Child extends Parent
{
	abstract void display();
}
class Son implements Child
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
public class Inherited_Interface
{
	public static void main(String alex[])
	{
		Son s = new Son();
		s.show();
		s.display();
	}
}

