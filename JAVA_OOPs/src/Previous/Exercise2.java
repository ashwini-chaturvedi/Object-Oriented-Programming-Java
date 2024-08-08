package Previous;

class Monkey{
    void Jump(int...  steps){
        for(int ele:steps){
        System.out.println("Jumping to Step "+ele);
        }
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void step();
}
class Human extends Monkey implements BasicAnimal{
    public void eat() {
        System.out.println("Eating...");
    }
    public void step(){
        System.out.println("Walking...");
    }

}
public class Exercise2 {
    public static void main(String[]args){
        Human H=new Human();
        for(int distance=0;distance<6;distance++){
            H.Jump(distance);
        }

    }
}
