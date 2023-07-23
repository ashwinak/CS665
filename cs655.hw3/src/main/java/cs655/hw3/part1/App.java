package cs655.hw3.part1;

public class App {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.createBank();
        acc.createCheckingAccount();
        acc.createSavingsAccount();

        BOA BOAName = new BOA();
        BOAName.createBank();
        BOAName.createCheckingAccount();
        BOAName.createSavingsAccount();

        Chase ChaseName = new Chase();
        ChaseName.createBank();
        ChaseName.createCheckingAccount();
        ChaseName.createSavingsAccount();

    }
}
