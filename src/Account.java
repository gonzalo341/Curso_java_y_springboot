public class Account extends  BankAccount{
    String name;

    public Account(double balance, String name) {
        super(balance);
        this.name = name;
    }
}
