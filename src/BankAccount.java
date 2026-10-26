public class BankAccount {
    double balance;

    public void mostrarBalance(){
        System.out.println("\nMonto actual: " + this.balance);
    }

    public double deposit(double amount){
        System.out.println("Se agrego a su cuenta: $" + amount);

        return this.balance += amount;
    }
}
