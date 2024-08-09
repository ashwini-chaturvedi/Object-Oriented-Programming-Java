package Previous;

class Employees{
    int salary;
    String name;
    int getSalary(int S){
        salary=S;
        return salary;
    }
    String getName(String N){
        name=N;
        return name;
    }
    String setName(String Name){
        name=Name;
        return name;
    }
}
public class PracticeQ1{
    public static void main(String[]args){
        Employees Anuj=new Employees();//Class Instance.

        Anuj.getName("Ashwini Chaturvedi");
       System.out.println("Official Name is:"+Anuj.name);
        System.out.println( "Salary is:"+Anuj.getSalary(1000));
        Anuj.setName("Anuj");
        System.out.println("Nick Name is:"+Anuj.name);




    }
        }