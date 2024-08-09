package Inheritance.Box;

public class BOX {
    private double l;//Cannot be accessed anywhere else other than this class

    double h;
    double w;

    public void setL(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }


    BOX(){
        System.out.println("In the Default Constructor");
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    BOX(double side){
        System.out.println("In the one parameter Constructor");
        this.l=side;
        this.h=side;
        this.w=side;
    }

    public BOX(double l, double h, double w) {
        System.out.println("In the 3 parameter Constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }
    BOX(BOX old){
        System.out.println("In the copy Constructor");
        this.w=old.w;
        this.l=old.l;
        this.h= old.h;
    }

}

