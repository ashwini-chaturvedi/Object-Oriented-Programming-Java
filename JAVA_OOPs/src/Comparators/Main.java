package Comparators;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        Students Ashwini=new Students(7788,78.94f);
        Students Anuj=new Students(897,89.03f);
        Students Pratibha=new Students(788,88.03f);
        Students Aaditya=new Students(894,88.03f);
        Students Harsh=new Students(778,71.94f);
        Students Fifi=new Students(974,97.03f);

        if(Ashwini.compareTo(Anuj)>0) System.out.println("True");
        else if(Ashwini.compareTo(Anuj)==0) System.out.println("Equal");
        else System.out.println("False");

        Students[] arr={Ashwini,Anuj,Pratibha,Aaditya,Harsh,Fifi};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//Using the Arrays Class algorithm
        Arrays.sort(arr,(o1,o2)->(int)(o1.marks-o2.marks));//using the Lambda function
        System.out.println(Arrays.toString(arr));


    }
}
