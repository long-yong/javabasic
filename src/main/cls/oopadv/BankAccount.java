package cls.oopadv;

import java.util.ArrayList;
import java.util.Random;

public class BankAccount {

    private static int accountNumber = 0;
    private static double totalMoney = 0;
    private static ArrayList<String> idList = new ArrayList<>();

    private String id;
    private double checkingBalance;
    private double savingBalance;

    public BankAccount() {
        checkingBalance = 0;
        savingBalance = 0;
        accountNumber ++ ;
        id = creat_id();
    }

    private static String creat_id() {
        while (true) {
            long N = (long)(Math.random()*10000000000L);
            String strN = String.valueOf(N);
            while (strN.length()<10) strN ="0"+strN;
            if(!idList.contains(strN)) {
                idList.add(strN); return strN;
            }
        }
    }

    public String getId() {
        return id;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void depositChecking(double money) {
        checkingBalance += money;
        totalMoney += money;
    }

    public void depositSaving(double money) {
        savingBalance += money;
        totalMoney += money;
    }

    public boolean withdrawChecking(double money) {
        if(checkingBalance<money) return false;
        checkingBalance -= money;
        totalMoney -= money;
        return true;
    }

    public boolean withdrawSaving(double money) {
        if(savingBalance<money) return false;
        savingBalance -= money;
        totalMoney -= money;
        return true;
    }

    public boolean checkingToSaving(int money) {
        if(checkingBalance<money) return false;
        checkingBalance -= money;
        savingBalance += money;
        return true;
    }

    public boolean savingToChecking(int money) {
        if(savingBalance<money) return false;
        savingBalance -= money;
        checkingBalance += money;
        return true;
    }

    public double displaySumOfBalance() {
        double sum = checkingBalance + savingBalance;
        System.out.println("Total balance of account "+id+ " is: " + sum);
        return sum;
    }

    public void displayAll() {
        double sum = checkingBalance + savingBalance;
        System.out.println("ID: "+id);
        System.out.println("Checking: "+checkingBalance);
        System.out.println("Saving: "+savingBalance);
        System.out.println("Total: "+ sum);
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

}
