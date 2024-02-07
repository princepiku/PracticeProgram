public class Single_Thread extends Thread
{
	public void run()
	{
		System.out.println("Inside the run() Thread is Running.....");
	}
	public static void main(String alex[])
	{
		Single_Thread st = new Single_Thread();
		st.start();
		System.out.println("Outside Thread is Running.....");
	}
}

