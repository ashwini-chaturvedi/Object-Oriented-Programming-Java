package Abstraction;

public abstract class abstractClass {
        int modelNo;
        String Name;
       // abstract abstractClass(); //abstract Constructors are not Allowed
        abstractClass(){
            modelNo=0;
            Name="XUV";
        }
        abstract public void name();
        void mileage(){
            System.out.println("In mileage");
        }

}
