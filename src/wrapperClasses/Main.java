package wrapperClasses;

public class Main {
    public static void main(String[] args) {
        int num=89;
        Integer nums=new Integer(num);//it is showing error means it is depricated or going to be removed
        //when we take a primitive value and store it in our wrapper object this is called BOXING
        //in newer version we can directly assign value to wrapper class objects
        Integer num1=num;//Here BOXING is going on automatically //this is called auto-BOXING

        int newNum=nums.intValue();//gives the number to be stored in primitve type // we are explicitally doing this
        //it is called UNBOXING
        int nextNum=nums;//UNBOXING is going on automatically so it is called auto-UNBOXING

        //Parsing
        String str="684";
        int no=Integer.parseInt(str);
        System.out.println(no*2);
    }
}
