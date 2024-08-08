package Previous;

//create a class Previous.cylinder and use getter and setters to set its radius and height
//use ➊ to calculate surface and volume of the Previous.cylinder
//Use a constructor and repeat ➊
//Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
//Repeat ➊ for a sphere
class cylinder{
    int height;
    float radius;
    void setHeight(int H){
        this.height=H;

    }
    void setRadius(int R){
        this.radius=R;
    }
    int getHeight(){
        return this.height;
    }
    float Radius(){
        return this.radius;
    }
    void display(){
        System.out.println("Height of the Cylinder is:"+this.height);
        System.out.println("Radius of the Cylinder is:"+this.radius);
    }
}

public class Practice {
    public static void main(String[]args){
        cylinder red=new cylinder();
        red.setHeight(78);
        red.setRadius(4);
        red.display();



    }
}
