package labor6_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Magyari", "Dora");
        customer1.addAccount(new SavingsAccount(0.15));
        customer1.addAccount(new CheckingAccount(1000));
        System.out.println(customer1);
        System.out.println(customer1.getAccountNumbers());
        customer1.getAccount(customer1.getAccountNumbers().get(0)).deposit(5000);

        customer1.getAccount(customer1.getAccountNumbers().get(1)).deposit(2000);
        System.out.println(customer1);
        BankAccount account = customer1.getAccount(customer1.getAccountNumbers().get(0));
        ((SavingsAccount)account).addInterest();
        System.out.println(customer1);
    }
}
