package cs655.hw3.part1;

public class App {
    public static void main(String[] args) {

        /*
          Creates Basic version of the account.  Account factory is the abstract factory class creating checking and savings account.
          Basic account factory is concrete class extending account factory. The basicChecking object of type checking creates
          the basic checking account inside Basic Account factory abstract class.
          The basicSavings object of type Savings creates the basic Savings account.
         */
        System.out.println("--Testing Basic version of Accounts--");
        AccountFactory myAccountFactory = new BasicAccountFactory();
        Checking basicChecking = myAccountFactory.createCheckingAccount();
        System.out.println(basicChecking.toString());
        Savings basicSavings = myAccountFactory.createSavingsAccount();
        System.out.println(basicSavings.getAccountType());
        System.out.println();

        /*
          Creates BoA version of the Basic account.  Account factory is the abstract class creating checking and savings account.
          Boa account factory is concrete class extending account factory. The boaChecking object of type boaChecking creates
          the basic checking account.
          The boaSavings object of type Savings creates the basic Savings account.
          The Basic checking/savings account and BOA checking/savings account have override methods in toString().
          This is so that BOA uses some parts of basicChecking/Savings account + BOA Specific checking/savings account.
         */

        System.out.println("--Testing Bank of America version of Accounts--");
        AccountFactory boa = new BoaAccountFactory();
        Checking boaChecking= boa.createCheckingAccount();
        System.out.println(boaChecking.toString());
        Savings boaSavings = boa.createSavingsAccount();
        System.out.println(boaSavings.toString());
        System.out.println();


        /*
          Creates Chase version of the Basic account.  Account factory is the abstract class creating checking and savings account.
          Chase account factory is concrete class extending account factory. The ChaseChecking object of type boaChecking creates
          the basic checking account.
          The ChaseSavings object of type Savings creates the basic Savings account.
          The Basic checking/savings account and chase checking/savings account have override methods in toString().
          This is so that chase uses some parts of basicChecking/Savings account + chase Specific checking/savings account.

         */

        System.out.println("--Testing Chase version of Accounts--");
        AccountFactory chase = new ChaseAccountFactory();
        Checking chaseChecking = chase.createCheckingAccount();
        System.out.println(chaseChecking.toString());
        Savings chaseSavings = chase.createSavingsAccount();
        System.out.println(chaseSavings.toString());

    }

}
