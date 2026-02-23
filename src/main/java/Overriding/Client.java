package Overriding;

public class Client {
    public static void main(String[] args){
        A a = new A();
        a.doSome();

        a = new B();
        a.doSome();
    }
}
