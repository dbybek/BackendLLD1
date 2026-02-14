package ConstructorChain;

public class C extends B {
    public int val;

    public C(int val2){
        this.val = val2;
        System.out.println("Constructor of class C with params/arguments.");
    }

//    public C(){
//        System.out.println("Constructor of class C.");
//    }
}
