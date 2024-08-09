package Inheritance.Box;

public class cube extends Square {
    int volume;
    cube(int l,int h,int w,String n){
       super(l,h,w,n);
        this.volume=90;
    }

    public cube(BOX old, String name, int volume) {
        super(old, name);
        this.volume = volume;
    }
}
