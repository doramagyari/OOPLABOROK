package labor6_1;

public class SavingsAccount extends BankAccount {
    private double interestRate; //kamatlab

    public SavingsAccount(double interestRate){
        //altalaban meg kell hivni az ososztaly constructorat: super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest(){
        this.balance += balance*interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
