package qea.corejava;

public class BankAccount {
    private double balance;
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited "+amount);
        }else {
            System.out.println("Error Cannot deposite negative amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        myAccount.deposit(-50);
        System.out.println(myAccount.getBalance());
    }
}
