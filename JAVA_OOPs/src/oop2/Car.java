package oop2;

public class Car {
    public Car(int headLamp,String str) {
        this.headLamp = headLamp;
        this.Horn=str;
        Car.count+=1;//gives an issue when using this because we are accessing a static variable which is independent of
        //its object so to avoid use the class name instead
    }

    String Horn;
    int headLamp;
    final int wheels=4;//cannot be reassigned
    static int count;

}
