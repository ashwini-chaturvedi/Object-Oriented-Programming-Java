package LargeNumbers;

import java.math.BigInteger;

public class BigIntegers {
    public static void main(String[] args) {
        //in Primitive type
        int a=99;
        int b=44;
        //in BigInteger type converting int or long to BigInteger
        BigInteger A= BigInteger.valueOf(56);//value of is static so no use to create an object
        BigInteger B= BigInteger.valueOf(8548);

        //Convert to int
        int num=A.intValue();

        //Working with Strings
        BigInteger C= new BigInteger("8548564745523489456322534675856");//here we have to create object

        //Constants
        BigInteger D=BigInteger.ONE;//Value ot one.

        //Addition
        BigInteger sum=A.add(B);

        //Multiply
        BigInteger m=A.multiply(B);

        //Subtract
        BigInteger diff=A.subtract(B);

        //Divide
        BigInteger d=A.divide(B);

        //Remainder
        BigInteger rem=A.remainder(B);

        //Compare
        if(A.compareTo(B)>0);


    }
}
