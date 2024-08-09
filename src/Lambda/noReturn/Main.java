package Lambda.noReturn;

import Lambda.noReturn.lambdaClass;
import Lambda.noReturn.lambdaInterface;

public class Main {
    public static void main(String[] args) {
        lambdaClass obj=new lambdaClass();
        obj.show();//but instead of instantiating a Class method we can also instantiate an object of interface
//        lambdaInterface interfaceObj=new lambdaInterface() {
//            @Override
//            public void show() {
//                System.out.println("Using Lambda Functions");
//            }
//        };
//        interfaceObj.show();//calling the overriden method of interface

        //After Java 8 Compiler Already know For A Single abstract method interface to make an object and overriding
        //its method below is the prerequisite so java internally handle these,so we only have to use '->' "Lambda"
        // new lambdaInterface() {
        //            @Override
        //            public void show
        //it Creates a lambda function

        //UnParameterised:
//        lambdaInterface interfaceObjLambda=()-> {
//            //if we have multiple statements we can use braces else we can remove them
//                System.out.println("Using Lambda Functions");
//            };
//
//        interfaceObj.show();//calling the overRiden method of interface

        //Parameterised
        lambdaInterface interfaceObjLambda=((a, b)-> {
            //if we have multiple statements we can use braces else we can remove them
            System.out.println("Using Lambda Functions:"+(a+b));
        });

        //lambda function calling
        interfaceObjLambda.show(10,134);//calling the overRiden method of interface

    }
}
