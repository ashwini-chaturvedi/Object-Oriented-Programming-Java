package Inheritance;

import Inheritance.Box.BOX;

class Cars{
    String name;
    static String horn;
   int wheels;
    final float mileage=30;
    public  Cars(){
        name="Car";
    }
     Cars(String name, String horn, int wheels) {
//        this.name = name;
        Cars.horn = horn;
        this.wheels = wheels;

    }
}
class XUV500 extends Cars{
     XUV500(String nam, String horn, int wheels) {
       this.name=nam;
       Cars.horn =horn;

    }
}
public class basics {
    public static void main(String[]args){
        Cars h=new Cars();
        System.out.println(h.name);
        XUV500 car=new XUV500("XUV500","BEEP-BEEP",4);
        System.out.println(car.name);


    }
}
