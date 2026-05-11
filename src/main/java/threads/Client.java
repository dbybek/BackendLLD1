package threads;

public class Client {

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            NumberPrinter num = new NumberPrinter(i);
            Thread t = new Thread(num);
            t.start();
        }
    }
}
