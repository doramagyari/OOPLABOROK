package labor6_1;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit=overdraftLimit;
    }

   @Override
    public boolean withdraw(double ammount){
        if(this.balance - ammount < (-overdraftLimit)){
            System.out.println("Invalid withdraw");
            return false;
        }
        else {
            this.balance -= ammount;
            return true;
        }
   }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
