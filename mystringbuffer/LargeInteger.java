package mystringbuffer;
import java.math.BigInteger;
public class LargeInteger {
    public static void main(String[] args) {
        int a=30;
        int b=67;

        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(3456789);
        BigInteger C=new BigInteger("12345678");

        //constants
        BigInteger D=BigInteger.TEN;

        //addition
        BigInteger sum=A.add(B);
        System.out.println("Sum: "+sum);
        

    }
}
