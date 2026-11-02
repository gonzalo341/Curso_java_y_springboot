public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }
}