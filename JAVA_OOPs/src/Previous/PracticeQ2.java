package Previous;//Create a class Previous.Square with a method to initialize its side, calculating area, perimeter etc.

class Square{
    int side;
   public Square(){
        side=100;
    }
   int Area(){
       return side*side;
   }
   int Perimeter(){
       return 4*side;
   }
}
public class PracticeQ2 {
    public static void main(String[]args){
//        Scanner Input=new Scanner(System.in);
//        System.out.print("Enter the side of Previous.Square:");
        Square sq=new Square();
//        sq.side=Input.nextInt();
        System.out.println("Perimeter of the Previous.Square is:"+sq.Perimeter());
        System.out.println("The Area of Previous.Square is:"+sq.Area());

    }
}
