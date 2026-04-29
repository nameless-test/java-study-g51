package task4;

public class BankAccount {

    private long bankAccountId;
    private String name;
    private double balance;

    public void setBankAccountId(long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public long getBankAccountId() {
        return bankAccountId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(long bankAccountId, String name, double balance) {
        this.bankAccountId = bankAccountId;
        this.name = name;
        this.balance = balance;
    }

    public void creditOperation(double topUpAmount) {
        if (topUpAmount <= 0) {
            System.out.println("Operation is not allowed");
            return;
        } else {
            this.balance = this.balance + topUpAmount;
            System.out.println("Top up successful. New balance: " + this.balance);
        }
    }

    public void debitOperation(double withdrawalAmount) {
        if (withdrawalAmount > this.balance || withdrawalAmount <= 0) {
            System.out.println("Operation is not allowed");
            return;
        } else {
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Withdrawal seccussful. New balance: " + this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount testUser = new BankAccount(3223, "Test User", 2135);
        testUser.creditOperation(65);
        testUser.debitOperation(100);
        testUser.creditOperation(0);
        testUser.creditOperation(-100);
        testUser.debitOperation(-500);
        testUser.debitOperation(0);
    }
}
