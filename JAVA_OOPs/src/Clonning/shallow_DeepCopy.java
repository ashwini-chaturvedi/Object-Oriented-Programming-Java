package Clonning;

import java.util.Arrays;

public class shallow_DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human P1=new Human("Anuj",22864);
        Human twin=(Human)P1.clone();
        System.out.println("Person 1:"+Arrays.toString(P1.arr));
        System.out.println("Twin :"+Arrays.toString(twin.arr));

        //modifying the twin's array
        twin.arr[0]=1000;

        System.out.println("Person 1:"+Arrays.toString(P1.arr));
        System.out.println("Twin :"+Arrays.toString(twin.arr));
    //conclusion: We are Modifying the Twin arr only but the Person 1's arr also gets modified this means that
        //Object.clone() makes Shallow copy

        //****@***Now we have modified the overriden method which will give DEEP COPY
        //Hence only twin.arr gets modified


    }
}
