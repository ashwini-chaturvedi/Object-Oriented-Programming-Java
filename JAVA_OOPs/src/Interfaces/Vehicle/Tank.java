package Interfaces.Vehicle;

public class Tank implements FuelTank{
    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int level() {
        return 15;
    }
}
