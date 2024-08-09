package Clonning;

public class Human implements Cloneable {  //this cloneable is an interface available in java .lang package
    String name;
    int age;
    int[]arr=new int[]{3,45,567,43,255,79,2};

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human other) {
        this.age=other.age;
        this.name=other.name;
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{//this is the exception for clone
//        //this is making shallow copy
//        return super.clone();//making clone
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{//this is the exception for clone
        Human twin=(Human)super.clone();//Shallow Copy;
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
