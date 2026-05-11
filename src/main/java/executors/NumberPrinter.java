package executors;

public class NumberPrinter implements Runnable{
    private int numberToPrint;

    NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run(){
        System.out.println("Printing the current Number: "+this.numberToPrint+
                " The thread printing the current number is "+Thread.currentThread().getName());
    }
}
