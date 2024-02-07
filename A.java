// 16. Ex - (2) Demonstrate the Concept of Inter Thread Communication.

class A implements Runnable
{
    int token = 1;
    public void run()
    {
        synchronized(this)
        {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(token+" tickets..... alloted to "+name);
            token++;
        }
    }
	public static void main(String alex[])
    {
        A a1 = new A();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a1);
        Thread t3 = new Thread(a1);
		Thread t4 = new Thread(a1);
        t1.setName("Prince Kumar.");
        t2.setName("Pallavi Kumari.");
        t3.setName("Nandani Kumari.");
		t4.setName("Manohar A S.");
        t1.start();
        t2.start();
        t3.start();
		t4.start();
    }
}
