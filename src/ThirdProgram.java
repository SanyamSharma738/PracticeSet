//So here is a program of Bank Account where money is being deposited and Withdrawn!

class BankAccount{
    private int balance;

    BankAccount(int initialBalance){
        if(initialBalance>0){
            balance=initialBalance;
        }
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Money is Deposited in the BankAccount! $"+amount);
        }else {
            System.out.println("Insufficient Money Deposit");
        }
    }
    public void Withdraw(int amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Money is withdrawn from the BankAccount! $"+amount);
        }else {
            System.out.println("Insufficient Funds! or Invalid Value");
        }
    }
}

public class ThirdProgram {
    public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount(5000);
        System.out.println("Initial Balance: $"+bankAccount.getBalance());
      bankAccount.deposit(450);
        System.out.println("New Balance after deposit: "+bankAccount.getBalance());
      bankAccount.Withdraw(3200);
        System.out.println("NewBalance after Withdrawing the Money: $"+bankAccount.getBalance());
    }
}
