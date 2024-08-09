package StringBufferClass;

import java.text.DecimalFormat;

public class dataFormating {
    public static void main(String[] args) {
        //Rounding off
        DecimalFormat df=new DecimalFormat("0.0");
        System.out.println(df.format(7.843));
    }
}
