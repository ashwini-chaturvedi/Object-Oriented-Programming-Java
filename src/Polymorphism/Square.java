package Polymorphism;

public class Square  extends Shapes{
    @Override//indicates that the method is overridden
        //the Method is Overriden
    //Same Method is in Parent class and in child class but the content is different
    void area(){
        System.out.println("Area of Square: r*r");
    }
}
