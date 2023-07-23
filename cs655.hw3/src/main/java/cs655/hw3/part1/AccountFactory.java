package cs655.hw3.part1;

public abstract class AccountFactory  {
    //private String BankName;
    public abstract Checking createCheckingAccount();
    public abstract Savings createSavingsAccount();
}
