package labor5_1;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    public static final String PREFIX="OTP";
    public static  final int ACCOUNT_NUMBER_LENGTH=10;
    private static int numAccounts =0;

    // inicializal
    public BankAccount(){
        // shadowing - elfedes
        //accountNumber parameter - lokalis valtozo
        //this.accountNumber - attributum(adattag)
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }
    private static String createAccountNumber(){
        StringBuilder result = new StringBuilder();
        result.append(PREFIX + String.format("%07d", numAccounts));
        return result.toString();
    }

    public void deposit(double amount){
        if(amount <= 0){
            return;
        }
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        this.balance -= amount;
        return true;
    }

    //getter
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //getter
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

}