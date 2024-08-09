package Previous;

class Employee
{
    int id;
    String name;
    Employee(int i,String n)//constructors
    {
        id = i;
        name = n;

    }
    void print()
    {
        System.out.print("Name of the Previous.Employee is:"+name);
        System.out.print(" Id no.:"+id);
    }

}
public class First_Class
{
    public static void main(String[]args)
    {
        Employee one=new Employee(89,"Ashwini Chaturvedi");//instantiating a new object.

        System.out.println(one.id);
        System.out.println(one.name);
        one.print();


    }

}