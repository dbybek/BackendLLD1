package generics;

public class PairGenerics<A,B> {
    A first;
    B second;

    public PairGenerics(A first, B second){
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public void doSomething(A a, B b){
        System.out.println("Do something method.");
        System.out.println(a);
        System.out.println(b);
    }

    public static <K, V> void doSomethingElse(K a, V b){
        System.out.println("Do something else method");
        System.out.println(a);
        System.out.println(b);
    }
}
