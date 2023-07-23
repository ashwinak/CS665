package cs655.hw3.part1;

public class App {
    public static void main(String[] args) {
        System.out.println("--Testing Basic version of Accounts--");
        AccountFactory myAccountFactory = new BasicAccountFactory();
        Checking basicChecking = myAccountFactory.createCheckingAccount();
        System.out.println(basicChecking.toString());
        Savings basicSavings = myAccountFactory.createSavingsAccount();
        System.out.println(basicSavings.getAccountType());
        System.out.println();

        System.out.println("--Testing Bank of America version of Accounts--");
        AccountFactory boa = new BoaAccountFactory();
        Checking boaChecking= boa.createCheckingAccount();
        System.out.println(boaChecking.toString());
        Savings boaSavings = boa.createSavingsAccount();
        System.out.println(boaSavings.toString());
        System.out.println();

        System.out.println("--Testing Chase version of Accounts--");
        AccountFactory chase = new ChaseAccountFactory();
        Checking chaseChecking = chase.createCheckingAccount();
        System.out.println(chaseChecking.toString());
        Savings chaseSavings = chase.createSavingsAccount();
        System.out.println(chaseSavings.toString());

    }

//    public static void createAccount(AccountFactory accountFactory){
//
//    }
}
