public class Main {
    public static void main(String[] args) {
        BankAcount account = new BankAcount(15000);

        try {
            while (true) {
                account.withdraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Ошибка: " + e.getMessage() + ". Доступная сумма: " + e.getRemainingAmount() + " сом.");
        }
    }
}
