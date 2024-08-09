package Previous;

class A{
    void meth(){
        System.out.println("This is Method 1 of class Previous.A");
    }
}
class B extends  A{
    @Override //showing overriden method.
    void meth()//same name of method in both class it is method overridden.
    {
        System.out.println("This is Method 1 of class Previous.B Which is a Example of method overriding");
    }

}
public class Method_Overriding {
    public static void main(String[]args){
        A a=new A();
        a.meth();
        B b=new B();
        b.meth();

    }
}
