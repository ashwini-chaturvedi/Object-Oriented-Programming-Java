package StringBufferClass;

import java.util.Arrays;

public class regxWorking {
    public static void main(String[] args) {
        //Removing Blank Spaces
        String removeBlanks="Aihd    dhsoi       ji sdf                rgjsoj";
        System.out.println(removeBlanks);
        System.out.println(removeBlanks.replaceAll("\\s",","));//replace the blank spaces "\\s" with ","

        //Splitting at spaces or anything
        String students="Ashwini     Anuj     AAditya        Harsh  Pratibha";
        String[] names=students.split(" ");
        System.out.println(Arrays.toString(names));
    }
}
