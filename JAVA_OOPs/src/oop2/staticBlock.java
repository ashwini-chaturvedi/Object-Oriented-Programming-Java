package oop2;

public class staticBlock {
   static int a=4;
   static int b;

   // static block creation
    //this will only run once when the first object is being created after that it will not run
    static{
        b=3478;

   }

    public static void main(String[] args) {
        staticBlock obj=new staticBlock();

    }
}
