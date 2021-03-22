package labor6_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("Magyari", "Dora"));
        bank.addCustomer(new Customer("Magyari", "Orsolya"));
        bank.getCustomers(1).addAccount(new SavingsAccount(0.15));
        bank.getCustomers(1).addAccount(new CheckingAccount(2000));
        bank.getCustomers(2).addAccount(new SavingsAccount(0.15));
        bank.getCustomers(2).addAccount(new CheckingAccount(2000));
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(0)).deposit(2000);
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(1)).deposit(5678);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(0)).deposit(2344);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(1)).deposit(2826);
        System.out.println(bank.getCustomers(1));
        System.out.println(bank.getCustomers(2));
        BankAccount account = bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(0));
        ((SavingsAccount)account).addInterest();
        account = bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(0));
        ((SavingsAccount)account).addInterest();
        System.out.println(bank.getCustomers(1));
        System.out.println(bank.getCustomers(2));
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(0)).withdraw(345);
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(1)).withdraw(15834);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(0)).withdraw(643);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(1)).withdraw(563);
        System.out.println(bank.getCustomers(1));
        System.out.println(bank.getCustomers(2));
    }
}
