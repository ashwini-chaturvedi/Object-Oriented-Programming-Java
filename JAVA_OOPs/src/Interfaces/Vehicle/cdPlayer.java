package Interfaces.Vehicle;

public class cdPlayer implements Media {
    @Override
    public boolean isStart() {
        return false;
    }

    @Override
    public void start() {
        System.out.println("Music Player Starts in cdPlayer Class");
    }

    @Override
    public void stop() {
        System.out.println("Music Player Stops");
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }
}
