package producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Client {
    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedDeque<>();

        Producer p1 = new Producer(objects,6);
        Producer p2 = new Producer(objects,6);
        Producer p3 = new Producer(objects,6);

        Consumer c1 = new Consumer(objects,6);
        Consumer c2 = new Consumer(objects,6);
        Consumer c3 = new Consumer(objects,6);
        Consumer c4 = new Consumer(objects,6);
        Consumer c5 = new Consumer(objects,6);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
    }
}
