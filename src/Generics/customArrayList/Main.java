package Generics.customArrayList;

import java.util.*;

public class Main {
    //IMPORTANT**** WILD CARD EXAMPLES
    public void forOnlyNumberClass(List<Number>list){//this will only take list of Number type not its subclass only number
        //do Something
    }
    public void forSubclass(List<? extends Number>list){//it will take list of Number class as well as its subclass type
        //Do something
    }

    public static void main(String[] args) {
        Arraylist list=new Arraylist();
        for(int i=0;i<=11;i++){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        System.out.println(Arraylist.getDefaultSize());
        System.out.println();
        System.out.println(list.remove(2));


        System.out.println("GENERICS:\n");
        GenericsArrayList<Character>ans=new GenericsArrayList<>();
        for(int i=0;i<=1000+1;i++){
            ans.add((char)i);
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+",");
        }
        System.out.println();
        System.out.println(GenericsArrayList.getDefaultSize());
        System.out.println(ans.size());
        System.out.println();
        System.out.println(ans.remove(2));
        System.out.println(ans);

        System.out.println("Wild Card:\n");
//        wildCardBounds<String>anss=new wildCardBounds<>();//not valid because String is not a member of Number class
//T should be of Number class or Number Class's Subclass because wildCardBounds has generic limit to Number class or
        // it extends number class
//        wildCardBounds<Integer>anss=new wildCardBounds<>();
//        for(int i=0;i<=1000+1;i++){
//            ans.add((char)i);
//        }
//        for(int i=0;i<ans.size();i++){
//            System.out.print(ans.get(i)+",");
//        }
//        System.out.println();
//        System.out.println(GenericsArrayList.getDefaultSize());
//        System.out.println(ans.size());
//        System.out.println();
//        System.out.println(ans.remove(2));





    }
}
