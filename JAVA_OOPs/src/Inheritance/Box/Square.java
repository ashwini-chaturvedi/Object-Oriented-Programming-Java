package Inheritance.Box;

public class Square extends BOX{
    String name;
    Square(int a,String n){
        super(a);
        this.name=n;
    }

    public Square(double l, double h, double w,String n) {

        super(l, h, w);///Calling the parent class constructor of similar number of parameters
        this.name=n;
    }

    public Square(BOX old, String name) {
        super(old);
        this.name = name;
    }
}
