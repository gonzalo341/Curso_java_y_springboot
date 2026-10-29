public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        if (balance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void mostrarBalance(){
        System.out.println("\nMonto actual: " + this.balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: El monto a depositar debe ser mayor que cero.");
            return;
        }

        this.balance += amount;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + this.balance);
    }

    public void withDraw(double amount){
        if (amount <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor que cero.");
            return;
        }

        if (amount > this.balance) {
            System.out.println("Error: Fondos insuficientes. Su saldo disponible es: $" + this.balance);
            return;
        }

        this.balance -= amount;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + this.balance);
    }
}
