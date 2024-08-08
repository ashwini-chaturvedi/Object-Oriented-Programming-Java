package LambdaFunctions;

public class Lambda  {
    int operate(int a,int b,LambdaInterface op){
        return op.operation(a,b);
    }

    
}
