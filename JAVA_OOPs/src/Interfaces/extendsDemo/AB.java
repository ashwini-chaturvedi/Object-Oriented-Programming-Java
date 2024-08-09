package Interfaces.extendsDemo;

public class AB implements B{
    @Override
    public void isAlphabet() {
        //method of interface A
        //Hidden in the interface B because it is extending the interface A
        System.out.println("Method of InterFace A");
    }

    @Override
    public void isCapital() {
        System.out.println("Method of Interface B");

    }
}
