package threads;

public class NumberPrinter implements Runnable {

    private int currNumber;

    public NumberPrinter(int currNumber){
        this.currNumber = currNumber;
    }

    @Override
    public void run(){
        System.out.println("Printing the current Number: "+this.currNumber+
                " The thread printing the current number is "+Thread.currentThread().getName());
    }

}
