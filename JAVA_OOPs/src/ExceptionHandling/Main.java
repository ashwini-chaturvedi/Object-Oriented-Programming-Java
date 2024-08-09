package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        String name="Ashwini";
        try{
            if(!name.equals("Ashwini")){
                throw new customExceptions("My Name is Ashwini Chaturvedi");
            }
        }catch(customExceptions e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Exception Handling");
        }
    }
}
