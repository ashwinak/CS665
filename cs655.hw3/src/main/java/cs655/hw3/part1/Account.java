package cs655.hw3.part1;

public class Account implements AbstractBank {

    @Override
    public void createBank() {
        System.out.println("--Testing Basic version of Accounts--");

    }
    @Override
    public void createCheckingAccount() {
        System.out.println("Creating Checking Account");
        System.out.println("**Basic Checking Account**");

    }

    public void createSavingsAccount() {
        System.out.println("Creating Savings Account");
        System.out.println("**Basic Savings Account**");

    }
}
