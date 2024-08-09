package Interfaces.StaticInterfaceMethods;

public interface A {
    static void staticMethods(){
        System.out.println("Inside the Static Interface method of A");
    }
    default void defaultMethod(){
        System.out.println("Inside the Default Interface method of A");
    }
    public void isAlphabet();
}
