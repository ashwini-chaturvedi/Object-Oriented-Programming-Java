package Previous.Interface;

class cellPhone{
    void call(){
        System.out.println("Calling...");
    }
   void display(){
        System.out.println("This is a Feature Phone");
    }
}
interface GPS{
     void Location();
     private void accurate(){
         System.out.println("accurate Location is Private");
     }
    static void accurate_location(){
        System.out.println("static method This is accurate location with 1 meter radius");
    }
     default void approx_location()//default method for interface
     {
         accurate();
          accurate_location();
         System.out.println("Default Method showing approx location in 100 meter radius");
     }

}
interface camera{
     void ClickPhoto();
}
interface speaker{
    void playMusic();

}

class Smart_cellphone extends cellPhone implements GPS,camera,speaker{
    public void Location(){
        System.out.println("Your Location is...");
    }
    public void ClickPhoto(){
        System.out.println("Taking Pictures...");
    }
    public void playMusic(){
        System.out.println("Playing Music \"HUA MAI\" ");
    }

}
public class Interface_Example {
    public static void main(String[]args)
    {
        Smart_cellphone Phone=new Smart_cellphone();
        Phone.ClickPhoto();
        Phone.Location();
        Phone.call();
        Phone.display();
        Phone.playMusic();
        Phone.approx_location();
    }
}
