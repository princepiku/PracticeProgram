public class Integer_Test
{
    public static void main(String...g) 
    {
        int b = 55;
        String bb = "45";
        Integer x = new Integer(b);
        Integer y = new Integer(bb);
        System.out.println("Decimal(b) = " + Integer.toString(b));
        System.out.println("Hexa_Decimal(b) = " + Integer.toHexString(b));
        System.out.println("Octal(b) = " + Integer.toOctalString(b));
        System.out.println("Binary(b) = " + Integer.toBinaryString(b));
        Integer z = Integer.valueOf(b);
        System.out.println("ValueOf(b) = " + z);
        z = Integer.valueOf(bb);
        System.out.println("ValueOf(bb) = " + z);
        z = Integer.valueOf(bb, 6);
        System.out.println("ValueOf(bb,6) = " + z);
        String decimal = "45";
        String octal = "011";
        String hex = "0x0f";
 
        Integer dec = Integer.decode(decimal);
        System.out.println("Decode(45) = " + dec);
        dec = Integer.decode(octal);
        System.out.println("Decode(011) = " + dec);
        dec = Integer.decode(hex);
        System.out.println("Decode(0x0f) = " + dec);
 
        int valrot = 15; // 1111
        System.out.println("Rotate_Left("+Integer.toBinaryString(valrot)+" , 2) = " +Integer.toBinaryString(Integer.rotateLeft(valrot, 2))+" : "+Integer.rotateLeft(valrot, 2));
        System.out.println("Rotate_Right("+Integer.toBinaryString(valrot)+", 2) = " +Integer.toBinaryString(Integer.rotateRight(valrot, 2))+" : "+Integer.rotateRight(valrot, 2));
		System.out.println("Add (12 + 13): "+Integer.sum(12, 13));
		System.out.println("Greatest Number is (12, 13): "+Integer.max(12, 13));
		
    }
}