public class Main {
    public static void main(String[] args) {
        BankAcount account = new BankAcount(15000);

        try {
            while (true) {
                account.withdraw(6000);
            }
        } catch (LimitException e) {
            double remainingAmount = e.getRemainingAmount();
            System.out.println("Ошибка: " + e.getMessage() + ". Доступная сумма: " + remainingAmount + " сом.");


            try {
                account.withdraw(remainingAmount);
                System.out.println("Снято оставшееся на счете: " + remainingAmount + " сом.");
            } catch (LimitException ex) {
                System.out.println("Ошибка при снятии остатка: " + ex.getMessage());
            }
            System.out.println("На счете осталось 0 сом.");
        }
    }
}
