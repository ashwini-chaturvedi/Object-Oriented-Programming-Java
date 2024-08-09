package Interfaces.Vehicle;

public class myEngine implements Engine{
    private int version;
    myEngine(int version){
        this.version=version;
    }
    public int getVersion(){
        return version;
    }
    @Override
    public int v(){
        return getVersion();
    }
    @Override
    public boolean isStart() {
        return false;
    }

    @Override
    public void start() {
        System.out.println("Engine Starts in myEngine Class");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stops");
    }




}
