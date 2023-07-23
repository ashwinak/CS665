package cs655.hw3.part1;

public class BasicAccountFactory extends AccountFactory{
    @Override
    public Checking createCheckingAccount() {
        System.out.println("Creating Checking Account");
        return new BasicChecking();
    }

    @Override
    public Savings createSavingsAccount() {
        System.out.println("Creating Savings Account");
        return new BasicSavings();
    }
}
