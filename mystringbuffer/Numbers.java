package mystringbuffer;

import java.math.BigInteger;

import java.math.BigDecimal;

public class Numbers {
    public static void main(String[] args){
        BD();
    }

    static void BD(){
        double x=0.03;
        double y=0.04;

        BigDecimal X=new BigDecimal("0.03");
        BigDecimal Y=new BigDecimal("0.04");
        BigDecimal ans=Y.subtract(X);
        System.out.println(ans);
        
        BigDecimal a=new BigDecimal("456576345675.4546376");
        BigDecimal b=new BigDecimal("547634565352.986785764");

        //operations
        System.out.println(b.add(a)); //addition
        System.out.println(b.subtract(a)); //subtraction
        System.out.println(b.multiply(a)); //multiplication
        System.out.println(b.pow(2));//power
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
    }

    static void BI(){
        int a=30;
        int b=67;

        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(3456789);
        BigInteger C=new BigInteger("12345678");

        //constants
        BigInteger D=BigInteger.TEN;

        //operations
        BigInteger s = C.add(X);

        BigInteger m = C.multiply(X);

        BigInteger sub = C.subtract(X);

        BigInteger d = C.divide(X);

        BigInteger rem = C.remainder(X);

        // if (X.compareTo(C) < 0) {
        //   System.out.println("Yes");
        // } 
        //stem.out.println(factorial.fact(100));
     
    }
}
