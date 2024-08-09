package Interfaces.Cars;

import Interfaces.Cars.Cars;

public class Harrier implements Cars, Bikes, biCycle {
    @Override
    public void Name() {

    }

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public int modelNo() {
        return 0;
    }

    @Override
    public int Name(int b) {
        return 0;
    }

    @Override
    public void horn() {

    }

    @Override
    public void rightTurn() {

    }

    @Override
    public void leftTurn() {

    }

    @Override
    public String Name(String a) {
        return null;
    }

    @Override
    public boolean isMoving() {
        return false;
    }

    @Override
    public int seats() {
        return 0;
    }
}
