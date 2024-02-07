// 16. Perform the MultiThreads. (Using Thread)

class S1 extends Thread
{
	S1(int a , int b)
	{
		int r = a+b;
		System.out.println("Starting Thread1.."+r);
	}
	public void run()
	{
		System.out.println("Task First.");
	}  
}  
  
class S2 extends Thread
{
	S2()
	{
		System.out.println("Starting Thread2..");
	}
	public void run()
	{
		System.out.println("Task Second.");
	}  
}  
  
public class Multi_Thread
{
	public static void main(String alex[])
	{
		S1 t1 = new S1(10,20);
		S2 t2 = new S2();
		t1.start();
		t2.start();
	}  
}  

