package cs655.hw4.part1;

public class App {
    /**
     *
     * @param args
     *
     * The Transaction is the interface with transaction method with a string argument to pass the logging to the end user.
     * The base transaction decorator is the wrapper class that implements the transaction interface.
     * The simple  transaction class is a normal class that prints the logging to the end user.
     *
     * Transaction with logging and transaction with security classes calls the super method from the decorator class. This method
     * implements the wrapper function such that the existing classes are used when more than one option is enabled by the end-user.
     *
     * This wrapper function avoids creation of a new sub-class and makes use of the existing classes that are implemented.
     *
     */
    public static void main(String[] args) {
        System.out.println();
        Transaction simpleDepositTransaction = new SimpleTransaction("-- Testing Deposit Transaction by itself --");
        simpleDepositTransaction.transaction("Transaction::DepositTransaction\n");

        Transaction LoggingTransaction = new TransactionWithLogging(new SimpleTransaction("-- Testing Deposit Transaction with Logging --"));
        LoggingTransaction.transaction("Logging @Wed Jul 27 05:28:38 EDT 2022->Transaction::DepositTransaction");
        System.out.println();

        Transaction SecurityTransaction = new TransactionWithLogging(new SimpleTransaction("-- Testing Deposit Transaction with Security --"));
        SecurityTransaction.transaction("Security check @Wed Jul 27 05:28:38 EDT 2022->Transaction::DepositTransaction\n");
        System.out.println();

        Transaction LoggingSecurityDepositTransaction = new TransactionWithLogging(new TransactionWithSecurity(new SimpleTransaction
                ("-- Testing Deposit Transaction with Logging and Security --")));
        LoggingSecurityDepositTransaction.transaction("Logging @Wed Jul 27 05:28:38 EDT 2022->Security check @Wed Jul 27 05:28:38 EDT 2022-" +
                ">Transaction::DepositTransaction\n");
        System.out.println();

        Transaction simpleWithdrawTransaction = new SimpleTransaction("-- Testing Withdraw Transaction by itself --");
        simpleWithdrawTransaction.transaction("Transaction::WithdrawTransaction\n");


        Transaction LoggingSecurityWithdrawTransaction = new TransactionWithLogging(new TransactionWithSecurity(new SimpleTransaction
                ("-- Testing Withdraw Transaction with Security and Logging --")));
        LoggingSecurityWithdrawTransaction.transaction("Security check @Wed Jul 27 05:28:38 EDT 2022->Logging @Wed Jul 27 05:28:38 EDT 2022->" +
                "Transaction::WithdrawTransaction\n");
        System.out.println();

    }
}
