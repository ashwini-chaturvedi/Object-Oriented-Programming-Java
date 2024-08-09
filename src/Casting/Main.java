package Casting;

public class Main {
    public static void main(String[]args){
        // 1. TypeCasting
        double a=452.5324;
        int b=(int)a;
        System.out.println();

        Parent num=new Parent();
        num.ShowParent();//Parent iss extended buy class Child but why is it not showing its method with object num
        //because the class Parent doesn't know about which other class is inheriting it and the object is of Parent type
        //class Child know what class Parent is,what are its members,functions etc...
        //but class Parent doesn't know anything about Child class

        // # Up casting
        Parent obj =(Parent) /*Type Casting*/ new Child();//Reference of Parent class and object of Child
        //Basically we are going up referring to parent class using the object of the child class

        //but obj is of child class but  still we cannot call the method of child class because the reference is of
        //type Parent
//        obj.ShowChild();//error message
        // so to solve this issue here comes :

        // # Down casting: Making the Parent Aware about the Child's methods
        Child objChild= (Child)obj;//this means that when i know the reference of obj is of Parent type but when we
        //also know that it is of type Child so when we are assigning objChild make it's reference to Child class
        //without creating any new object
        //Simply the Reference of the object is changed from Parent to Child which stored in objChild
        objChild.ShowChild();




    }
}
