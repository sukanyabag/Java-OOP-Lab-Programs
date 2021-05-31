abstract class Bank {

    abstract int getBalance();
    
    }
    
    class BankA extends Bank {
    private int balance;
    void deposit(int money) {
    balance += money;
    }
    
    @Override
    int getBalance() {
    return balance;
    
    }
    
    }
    class BankB extends Bank {
    private int balance;
    void deposit(int money) {
    balance += money;
    
    }
    @Override
    int getBalance() {
    return balance;
    
    }
    
    }
    class BankC extends Bank {
    private int balance;
    void deposit(int money) {
    balance += money;
    }
    @Override
    int getBalance() {
    return balance;
    }
    }
    
    public class Banks {
    public static void main(String[] args) {
    
    BankA bankA = new BankA();
    
    BankB bankB = new BankB();
    
    BankC bankC = new BankC();
    
    bankA.deposit(100);
    
    bankB.deposit(150);
    
    bankC.deposit(200);
    
    System.out.println("Balance of Bank A = $"+ bankA.getBalance());
    
    System.out.println("Balance of Bank B = $"+ bankB.getBalance());
    
    System.out.println("Balance of Bank C = $"+ bankC.getBalance());
    }
    }
