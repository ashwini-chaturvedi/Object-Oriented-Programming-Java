package Interfaces.Vehicle;

public class friendsEngine implements Engine{
    @Override
    public boolean isStart() {
        return false;
    }

    @Override
    public void start() {
        System.out.println("Friends Car Starts");
    }

    @Override
    public void stop() {
        System.out.println("Friends Car Stops");
    }

    @Override
    public int v() {
        return 0;
    }
}
