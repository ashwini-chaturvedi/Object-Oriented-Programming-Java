package Interfaces.Vehicle;

public class myCar {
    private Engine myEngine;
    private Media myPlayer;
    private FuelTank myTank;

   myCar(){
       this.myEngine=new myEngine(3);
       this.myPlayer=new cdPlayer();
       this.myTank=new Tank();
   }
   public void start(){
//       if(isKey) myEngine.start();//now it will call method of myEngine class
//       if(isPlay) myPlayer.start();
       //Car Starts Music player also starts
       myEngine.start();

   }
   public void stop(){
      myEngine.stop();
      myPlayer.stop();
   }
   public void play(){
       myPlayer.play();
   }
    public void pause(){
        myPlayer.pause();
    }
    public void replaceEngine(){

        System.out.println("Current Engine Version:"+myEngine.v());
        System.out.println("myEngine is Changing");

        myEngine=new friendsEngine();
        System.out.println("Engine Replaced");
    }

}
