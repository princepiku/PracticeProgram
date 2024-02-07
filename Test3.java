// WAP To Display Shifting(Right - Left - Triple).
class Test3
{
	public static void main(String alex[])
	{
		int x = 11;
		System.out.println(x+ " << 1 = "+(x<<1));
		System.out.println(x+ " << 2 = "+(x<<2));
		System.out.println(x+ " >> 1 = "+(x>>1));
		System.out.println(x+ " >> 2 = "+(x>>2));
		System.out.println(x+ " >>> 1 = "+(x>>>1));
		System.out.println(x+ " >>> 2 = "+(x>>>2));
		
		x = -11;
		System.out.println(x+ " << 1 = "+(x<<1));
		System.out.println(x+ " << 2 = "+(x<<2));
		System.out.println(x+ " >> 1 = "+(x>>1));
		System.out.println(x+ " >> 2 = "+(x>>2));
		System.out.println(x+ " >>> 1 = "+(x>>>1));
		System.out.println(x+ " >>> 2 = "+(x>>>2));
		System.out.println(x+ " << 1 = "+(x<<1));
		System.out.println(Integer.toBinaryString(x) +"<< 1 = "+Integer.toBinaryString((x<<1)));
		System.out.println(Integer.toBinaryString(x) +">> 1 = "+Integer.toBinaryString((x>>1)));
		System.out.print(Integer.toBinaryString(x) +">>> 1 = "+Integer.toBinaryString((x>>>1)));	
		
	}
}