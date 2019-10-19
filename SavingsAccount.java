import java.util.Scanner;
public class SavingsAccount {
    private static double annualIntRate = 0;
    private double savingsBalance = 0;

    SavingsAccount(double balance){
        savingsBalance = balance;
        annualIntRate = 0;
    }

    void monthlyInt(){
        System.out.println("Current savings balance: " + savingsBalance);
        double monthlyInt;
        monthlyInt = (savingsBalance * annualIntRate) / 12;
        savingsBalance += monthlyInt;
        System.out.println("New savings balance: " + savingsBalance);
    }

    static void intRate(double newIntRate){
        annualIntRate = newIntRate;
    }
}

class Driver{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount.intRate(.04);
        saver1.monthlyInt();
        SavingsAccount.intRate(.05);
        saver1.monthlyInt();

        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.intRate(.04);
        saver2.monthlyInt();
        SavingsAccount.intRate(.05);
        saver2.monthlyInt();
    }
}
