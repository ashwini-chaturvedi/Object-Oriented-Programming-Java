package Interfaces.extendsDemo;

public interface B extends A{
//    public void isAlphabet();//it is Hidden
    public void isCapital();
    //here when an interface Extends Another Interface the method of extended interface is hidden
    //and when we implement this interface in any class we will have to override all the methods of current interface
    //as well as methods of extended class
}
