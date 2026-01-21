package IntroToOOP;

public class BankAccount {
    double balance;
    String ownerName;

    void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("Not sufficient balance.");
        }
        else{
            this.balance -= amount;
            System.out.println("Rs."+amount+"/- debited from your account.");
            System.out.println("Remaining balance: Rs."+this.balance+"/-");
        }
    }

    void deposit(double amount){
        this.balance += amount;
        System.out.println("Rs."+amount+"/- credited to your account.");
        System.out.println("Total balance: Rs."+this.balance+"/-");
    }
}
