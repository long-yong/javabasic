package cls.oopadv;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount Mary = new BankAccount();  System.out.println("Mary created a account: " + Mary.getId());
        BankAccount John = new BankAccount();  System.out.println("John created a account: " + John.getId());

        System.out.println(" ");

        Mary.depositChecking(100);     System.out.println("Mary deposit 100 to checking");
        Mary.depositSaving(1000);      System.out.println("Mary deposit 1000 to saving");
        Mary.withdrawChecking(90);     System.out.println("Mary withdraw 90 from checking");
        Mary.savingToChecking(500);    System.out.println("Mary tranfer 500 from saving to checking\nMary's info:");
        Mary.displayAll();

        System.out.println(" ");

        John.depositChecking(1000);    System.out.println("John deposit 1000 to checking");
        John.depositSaving(3000);      System.out.println("John deposit 3000 to saving");
        John.checkingToSaving(500);    System.out.println("John tranfer 500 from checking to saving\nJohn's info:");
        John.displayAll();

        System.out.println(" ");
        System.out.println("Account's number: "+ BankAccount.getAccountNumber());
        System.out.println("Total Money of all accounters: "+ BankAccount.getTotalMoney());
    }
}
