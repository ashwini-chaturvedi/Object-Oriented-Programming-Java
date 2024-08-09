package StringBufferClass;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuffer buffer1=new StringBuffer();//Constructor 1 Creates and Empty StringBuffer of 16 size...
        StringBuffer buffer2=new StringBuffer(69);//Constructor 2 it takes the initial Capacity
        StringBuffer buffer3=new StringBuffer("Ashwini");//Constructor 3 takes String
        createRandomString str=new createRandomString();
        String s=str.randomString(10);
        System.out.println(s);
    }
}
