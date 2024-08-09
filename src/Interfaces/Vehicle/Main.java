package Interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Engine myEngine=new myCar();
//        myEngine.stop();//we are trying to stop engine but instead it is giving music stopped so to solve this we will implement classes
        //for different interfaces to keep them safe
        //this also can be avoided using different method initials...

         myCar car=new myCar();

         car.start();
         car.replaceEngine();
         car.start();
         car.stop();


    }
}
