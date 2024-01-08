public class Test3 {
    public static void main(String[] args) {

       float f = 123.9F;

        int a = 54;

        long l = a;
        int x = (int)l;
        System.out.println(x);

        int b = 435;
        double y = b;
        System.out.println(y);

        double z = 237.17;
        int c = (int)z;
        System.out.println(c);
        long r = Math.round(z);
        System.out.println(r);

        byte p = (byte)130;



        // float = numar (123.3F, 23.98F;;) 32 byte
        // double = numar (34.9, 87,88;;) 64 byte
        // long = numar (658897L, 6656569L;;) 64 byte
        // int = numar (87, 65, 332;;) 32 byte
        // short = numar (0...infinit) 16 byte
        // byte = numar (-128...127)
    }

}
