package Previous;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fountain_Pen extends Pen{
    public void write(){
        System.out.println("lambdaInterface am Writing");
    }
    public void refill(){
        System.out.println("Refilling the Previous.Pen");
    }
    void changeNib(){
        System.out.println("Changing the Nib of the Previous.Pen");
    }
}
public class Exercise {
    public static void main(String[]args){

    }
}
