package Method.calculator;

public class Student {

    // properties of data members

    String name;
        int age;
        int roll;

     // capabilities: read, run, eat, write/
    // syntax access specifier return type method name (parameter) (opt)

    public void read(){
        System.out.println("This is read metod");
    }
    public void run(){
        System.out.println("this is run method");
    }public void eat(){
        System.out.println("this is eat method");
    }public void write(){
        System.out.println("this is write method");
    }

    public static void main(String[] args) {
        Student obj =new Student();
        obj.read();
        obj.run();
        obj.eat();
        obj.write();

    }
}
