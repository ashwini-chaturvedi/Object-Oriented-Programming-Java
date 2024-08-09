package oop2;

public class student{
    String name;
    int rNo;
    float percentage;

//    student(){
//        name="Ashwini Chaturvedi";
//        rNo=78;
//        percentage=80f;
//        System.out.println(name+rNo+percentage);
//    }
public student(String n,int r,float c){
        name=n;
        rNo=r;
        percentage=c;
        System.out.println(name+rNo+percentage);
    }
     public student(student node){
        this.name=node.name;
        rNo=node.rNo;
        percentage=node.percentage;
        System.out.println(name+rNo+percentage);
    }

     public student(){//Calling a Constructor from constructor
        this("Anuj",499,89f);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is Destroyed");
    }
}
