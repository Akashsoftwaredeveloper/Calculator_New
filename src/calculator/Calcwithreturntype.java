package calculator;

public class Calcwithreturntype {
    public int add (int a, int b){
        int result= a+b;
        return result;

    }

    public static void main(String[] args) {
        Calcwithreturntype obj=new Calcwithreturntype();
        int output= obj.add(6,5);
        System.out.println("addition of two number is"+ output);

    }
}
