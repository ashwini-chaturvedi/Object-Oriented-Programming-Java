package Generics.genericInterfaces;

/*
public class genericInterfaceClass implements Interface<Integer>{//Defined T as Integer
    @Override
    public void compare(Integer num) {

    }

 */
public class genericInterfaceClass<T> implements Interface<T>{//Defined the whole class as Generic
    //here we can define the T or we can make Generic of
    //this class which  will make it a class of generic type implementing interface of generic type...
    @Override
    public void compare(T num) {

    }
}
