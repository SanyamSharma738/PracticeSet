class FirstBankAccount{
 private int balance;
    FirstBankAccount(int initialBalance){
     if(initialBalance>0){
         balance=initialBalance;
     }
 }
    public int getBalance() {
        return balance;
    }
    public  synchronized void deposit(int amount){
     if(amount>0){
         balance+=amount;
         System.out.println("Money Deposited: $"+amount);
     }else {
         System.out.println("Insufficient amount");
     }
    }
    public synchronized void Withdraw(int amount){
     if(amount>0 &&amount<=balance){
         balance-=amount;
         System.out.println("Money Withdraw: $"+amount);
     }else {
         System.out.println("Insufficient funds or Invalid value");
     }
    }
}
public class BankingSystem {
    public static void main(String[] args) {
    FirstBankAccount fba = new FirstBankAccount(5000);
    Thread user = new Thread();
    fba.deposit(400);
    fba.Withdraw(4444);
        System.out.println("Current balance: "+fba.getBalance());
    Thread user2= new Thread();
    fba.deposit(500);
    fba.Withdraw(3333);
        System.out.println("Total balance: $"+fba.getBalance());
        user.start();
        user2.start();
    }
}
