package labor3_2;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Bagoly", "Norbert");
        Customer customer2 = new Customer("Magyari", "Dora");
        customer1.addAccount(new BankAccount("OTP0001"));
        customer1.addAccount(new BankAccount("OTP0002"));
        customer1.addAccount(new BankAccount("OTP0003"));
        customer1.addAccount(new BankAccount("OTP0004"));
        customer1.addAccount(new BankAccount("OTP0005"));
        customer2.addAccount(new BankAccount("OTP0001"));
        customer2.addAccount(new BankAccount("OTP0002"));
        customer2.addAccount(new BankAccount("OTP0003"));
        customer2.addAccount(new BankAccount("OTP0004"));
        customer2.addAccount(new BankAccount("OTP0005"));
        customer2.addAccount(new BankAccount("OTP0006"));
        customer2.addAccount(new BankAccount("OTP0007"));
        customer2.addAccount(new BankAccount("OTP0008"));
        customer2.addAccount(new BankAccount("OTP0009"));
        System.out.println(customer1);
        System.out.println(customer2);
        customer1.closeAccount(0);
        customer2.closeAccount(1);
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
