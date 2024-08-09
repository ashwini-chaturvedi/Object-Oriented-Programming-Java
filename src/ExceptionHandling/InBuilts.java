package ExceptionHandling;
public class InBuilts {
    public static void main(String[] args) {
        int a=7;
        int b=0;

        try{
            int c=a/b;

        }catch(Exception e){//Exception is a class ArithmeticException is a subclass that extends the Exception class
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally will always run..");
        }

        //For Method Calls we will Exceptionally give the message
        try{

            divide(a,b);
        }catch(Exception e){//Exception is a class ArithmeticException is a subclass that extends the Exception class
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally will always run..");
        }
        //try catch can be multiple
        try{
            int c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Catched");
        }catch(Exception e){
            System.out.println("Any other Exception Catched");
        }finally {
            System.out.println("Always");
        }
        //Catch for Arithmetic Exception will Always be above of catch for Exception because Arithmetic Exception is a
        //Subclass of Exception Class so when Exception's catch is present before Arithmetic Exception's catch it will
        //catch all the exceptions whether Arithmetic or any other...

    }
    public static int divide(int a,int b) throws Exception{//Divide is static because it is outside the Main method and if it was
        //not static we will need an object to access it but static members are object independent so
        if(b==0){
            throw new ArithmeticException("Don't Divide by Zero");
        }
        return a/b;
    }

}
