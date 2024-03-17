public class BankAcount {
    private double amount;

    public BankAcount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Пополнение на " + sum + " сом. Текущий баланс: " + amount + " сом.");
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на счете", amount);
        }
        amount -= sum;
        System.out.println("Снятие " + sum + " сом. Текущий баланс: " + amount + " сом.");
    }
}
