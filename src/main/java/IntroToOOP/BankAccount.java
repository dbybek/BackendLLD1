package IntroToOOP;

public class BankAccount {
    double balance;
    String ownerName;

    void withdraw(double amount){
        if(amount<=0){
            System.out.println("Please enter a valid amount greater than 0.");
        }
        if(amount<=this.balance){
            this.balance -= amount;
            System.out.println("Rs."+amount+"/- debited from your account.");
            System.out.println("Remaining balance: Rs."+this.balance+"/-");
        }
        else {
            System.out.println("Not sufficient balance.");
        }
    }

    void deposit(double amount){
        if(amount<=0){
            System.out.println("Please enter a valid amount greater than 0.");
        }
        this.balance += amount;
        System.out.println("Rs."+amount+"/- credited to your account.");
        System.out.println("Total balance: Rs."+this.balance+"/-");
    }
}
