package Interfaces.nestedInterface;

public class B implements A.nestedInterface{//implementing nested interface using dot operator
    @Override
    public void Greet() {
        System.out.println("Helloooo");
    }
}
