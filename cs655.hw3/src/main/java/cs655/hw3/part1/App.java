package cs655.hw3.part1;

public class App {
    public static void main(String[] args) {
        System.out.println("--Testing Basic version of Accounts--");
        AccountFactory myAccountFactory = new BasicAccountFactory();
        Checking basicChecking = myAccountFactory.createCheckingAccount();
        System.out.println(basicChecking.getAccountType());
        Savings basicSavings = myAccountFactory.createSavingsAccount();
        System.out.println(basicSavings.getAccountType());
        System.out.println();

        System.out.println("--Testing Bank of America version of Accounts--");
        AccountFactory boa = new BoaAccountFactory();
        Checking boaChecking= boa.createCheckingAccount();
        System.out.println(boaChecking.getAccountType());
        Savings boaSavings = boa.createSavingsAccount();
        System.out.println(boaSavings.getAccountType());
        System.out.println();

        System.out.println("--Testing Chase version of Accounts--");
        AccountFactory chase = new ChaseAccountFactory();
        Checking chaseChecking = chase.createCheckingAccount();
        System.out.println(chaseChecking.getAccountType());
        Savings chaseSavings = chase.createSavingsAccount();
        System.out.println(chaseSavings.getAccountType());

    }

//    public static void createAccount(AccountFactory accountFactory){
//
//    }
}
