package Previous;

class baseClass1{
    int x;
    int y;
    int setX(int X){
        this.x=X;
        return this.x;
    }
    int getX(){
        return this.x;
    }
    baseClass1(){
        System.out.println("Base Class Constructor Running");
    }
}
class derivedClass1 extends baseClass1{
    int y;
    int setY(int Y){
        this.y=Y;
        return y;
    }
    int getY(){
        return y;
    }
    derivedClass1(){
        System.out.println("Derived class Constructor is Running");
    }
}
public class Constructor_in_java {
    public static void main(String[]args){
//        Previous.baseClass1 Base=new Previous.baseClass1();
        derivedClass1 Derived=new derivedClass1();
    }
}
