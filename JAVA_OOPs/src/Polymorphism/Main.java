package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        shape.area();
        circle circles=new circle();
        circles.area();
        Triangle tri=new Triangle();
        tri.area();
        Square square=new Square();
        square.area();
        //Same Method name and Arraylist but different ways of saying it.
        // if any method is not present in the current child class it will go  to find it to its extended class

    }
}
