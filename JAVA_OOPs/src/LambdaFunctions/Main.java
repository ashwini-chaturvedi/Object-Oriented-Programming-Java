package LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<6;i++){
            list.add(i);
        }
        //1st Way
        list.forEach((item)-> System.out.print(item*2+","));
        System.out.println();
        //2nd Way Consumer is an Interface
        Consumer<Integer>consume=(item)-> System.out.print(item*2+",");
        list.forEach(consume);
        //Consumer interface only accept 1 item or parameter so to work with two parameter we will make our interface
        System.out.println();

        //This is the Body of Operation function of Lambda Interface as it is lambda function so it has all in one line
        LambdaInterface op1=(a,b)->a+b;
        LambdaInterface op2=(a,b)->a-b;
        LambdaInterface op3=(a,b)->a*b;
        LambdaInterface op4=(a,b)->a/b;

        Lambda num=new Lambda();
        System.out.println(num.operate(5,3,op1));

    }


}
