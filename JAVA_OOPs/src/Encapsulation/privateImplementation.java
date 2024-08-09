package Encapsulation;

public class privateImplementation {
    private int num;//this making members private is example of Encapsulation
    private String Name;
    int[] marks;

    public String getName(){
        return Name;
    }
    public int getNum(){
        return num;
    }
    privateImplementation(int n,String str){
        this.num=n;
        this.Name=str;
        marks=new int[n];
    }
}
