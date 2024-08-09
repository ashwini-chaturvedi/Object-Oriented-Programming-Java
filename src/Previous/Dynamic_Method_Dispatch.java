package Previous;

class FeaturePhone{
    void on(){
        System.out.println("Feature Phone is turning ON:");
    }
}
class SmartPhone extends FeaturePhone{
    void on(){
        System.out.println("Previous.SmartPhone is Turning ON:");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[]args){
        FeaturePhone Phone=new SmartPhone();//Child is of Previous.FeaturePhone and object(Phone) is of Smartphone type.
        //this is judged at the Runtime so it is good way to achieve Runtime polymorphism.
        Phone.on();

    }
}
