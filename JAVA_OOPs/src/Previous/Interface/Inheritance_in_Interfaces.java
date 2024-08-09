package Previous.Interface;

interface MyInterface_1{
    void method1();
    void method2();
}
interface MyInterface_2{
    void method3();
    void method4();
}
interface first extends MyInterface_1,MyInterface_2{
    @Override
    void method1();
      @Override
      void method2();
    @Override
    void method3();
      @Override
      void method4();
}
//interface second implements Previous.Interface.MyInterface_1 ==> Invalid.

//class My_class extends Previous.Interface.MyInterface_1 ==>Invalid

class My_Class implements MyInterface_1,MyInterface_2{

    @Override
    public  void method1() {
        System.out.println("Meth1");
    }
    @Override
    public  void method2() {
        System.out.println("Meth2");
    }
    @Override
    public  void method3(){
        System.out.println("Meth3");
    }
    @Override
    public  void method4() {
        System.out.println("Meth4");
    }

}
class My_Class2 implements first{
    @Override
    public  void method1() {
        System.out.println("1");
    }
    @Override
    public  void method2() {
        System.out.println("2");
    }
    @Override
    public  void method3() {
        System.out.println("3");
    }
    @Override
    public  void method4() {
        System.out.println("4");
    }
}

public class Inheritance_in_Interfaces {
    public static void main(String[]args){
        My_Class obj1=new My_Class();
        obj1.method1();
        obj1.method2();
        obj1.method3();
        obj1.method4();

        My_Class2 obj2=new My_Class2();
        obj2.method1();
        obj2.method2();
        obj2.method3();
        obj2.method4();


    }
}
