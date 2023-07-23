package cs655.hw3.part1;

public class BOA extends Bank {
    @Override
    public void createBank() {
        System.out.println("--Testing Bank of America version of Accounts--");

    }

    @Override
    public void createCheckingAccount() {
        System.out.println("Creating Checking Account");
        System.out.println("**Basic Checking Account**::BankOfAmerica Checking Account");

    }

    @Override
    public void createSavingsAccount() {
        System.out.println("Creating Savings Account");
        System.out.println("**Basic Savings Account**::BankOfAmerica Savings Account");

    }

}
