package Clonning;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human p1=new Human("Ashwini Chaturvedi",220864);
//        Human twins=new Human(p1);//this will take memory as well as time to make a clone we can use cloneable interface

        //@** 1st way...
        // we can use below way ,or we can use throws in Main function
        // Human twin;
//        try{
//            twin=(Human)p1.clone();
//        }catch(CloneNotSupportedException e){
//            System.out.println(e.getMessage());
//        }
        //@** 2nd way
        Human twins=(Human)p1.clone();
        System.out.println(twins.age+","+twins.name);

    }
}
