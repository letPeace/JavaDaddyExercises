package mentorship.roadmap.step_2_core.step4.task6_BankAccount.solution;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 500.0);
        account.deposit(150.0);
        account.withdraw(200.0);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
