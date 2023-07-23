package cs655.hw3.part1;

public class Chase extends Bank {
    @Override
    public void createBank() {
        System.out.println("--Testing Chase version of Accounts--");

    }

    @Override
    public void createCheckingAccount() {
        System.out.println("Creating Checking Account");
        System.out.println("**Basic Checking Account**::Chase Checking Account");

    }

    @Override
    public void createSavingsAccount() {
        System.out.println("Creating Savings Account");
        System.out.println("**Basic Savings Account**::Chase Savings Account");

    }
}
