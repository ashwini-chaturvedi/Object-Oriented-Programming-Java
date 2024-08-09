package Previous.Interface;

interface Bicycle{
    public void applyBrake(int Decrement);
    public void speedUp(int Increment);
}
class AvonCycle implements Bicycle{
    int speed=7;
    @Override
    public void applyBrake(int Decrement){
        speed=speed-1;
    }
    @Override
    public void speedUp(int increment){
        speed += 1;
    }

}
public class Interface {
    public static void main(String[]args){

    }
}
