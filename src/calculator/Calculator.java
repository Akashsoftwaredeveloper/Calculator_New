package calculator;

public class Calculator {
    // add, sub, mul, divide;
    //syntax: access_specifier return_type method_name(parameter){code}

    public void addition(){
        int a= 10;
        int b= 20;
        int result= a+b;
        System.out.println("addition of two number is ="+result);
    }
    public void multiplication(){
        int a= 12;
        int b= 18;
        int result= a*b;
        System.out.println("multiplication of two number is =" +result);
    }
    public void sub(){
        int a=19;
        int b=7;
        int result= a-b;
        System.out.println("substraction of two number is ="+result);
    }
    public void divide(){
        int a= 10;
        int b= 40;
        int result= b/a;
        System.out.println("division of two number is ="+result);
    }

    public static void main(String[] args) {
        Calculator object= new Calculator();
        object.addition();
        object.multiplication();
        object.sub();
        object.divide();
    }
}

