public class S_Thread implements Runnable
{
	public void run()
	{
		System.out.println("Outside the running thread.");
	}
	public static void main(String alex[])
	{
		S_Thread st = new S_Thread();
		Thread t = new Thread(st);
		t.start();	
	}
}

