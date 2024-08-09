package Inheritance.Box;



public class Main {
    public static void main(String[] args) {

        Square s=new Square(4,6,8,"SQUARE");
        System.out.println(s.name);

        BOX b=new BOX(7);
        System.out.println(b.h);

        cube c=new cube(b,"ui",89);
        System.out.println(c.h);

    }
}
