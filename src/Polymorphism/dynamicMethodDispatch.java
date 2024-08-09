package Polymorphism;
class Person{
    void Gender(){
        System.out.println("Person's Gender");
    }
}
class son extends Person{
    void Gender(){
        System.out.println("Son's Gender Male");
    }
}
class daughter extends Person{
    void Gender(){
        System.out.println("Daughter's Gender Female");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        //when we see a person(object) we say it is a Person but we don't know what type of person he/she is
        // Person person:Defines that this is a Person
        // person=new person: defines that it is a normal Person type of person
        Person person=new Person();
        person.Gender();

        person=new son();// person=new son: defines that it is a son type of person //means it has gender male
        person.Gender();

        person =new daughter();// person=new daughter: defines that it is a Daughter type of person //means it has gender Female
        person.Gender();

        // # Object/person is same only its type is defined after some time
        //this defining of what is the type of this object is done at runtime hence this is a Polymorphism
        //which type of Gender function(i.e. Parent,son,daughter) is going to be called is define at run time
        //# All This Technique is Called DYNAMIC METHOD DISPATCH
        //p.s. all other classed should inherit the Reference type class to see this working
    }
}
