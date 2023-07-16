package ashwinak.cs665.hw2;

import ashwinak.cs665.hw2.enumTypes.AccountType;
import ashwinak.cs665.hw2.enumTypes.TransactionType;
import ashwinak.cs665.hw2.exceptions.BankException;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class Bank {

    private final Map<String, Customer> customerMap;
    private final Map<String, Account> accountMap;

    private static Bank bankInstance;

    private Bank() {
        customerMap = new HashMap<>();
        accountMap  = new HashMap<>();
    }

    public static synchronized Bank getBankInstance() {
        if (bankInstance == null) {
            bankInstance = new Bank();
        }
        return bankInstance;
    }

    public synchronized Customer createCustomer(String customerName, String customerId, Date registrationDate)
            throws BankException {
        /* Fill in the code and return the Customer. Exception if customerId already exists */

        return null;

    }

    public synchronized Customer lookupCustomer(String customerId)
            throws BankException {

        /* Fill in the code and return the Customer. Exception if customerId doesn't exist */

        return null;
    }

    public synchronized Account createAccount(String customerId, AccountType accountType,
                                              String accountId, Date openDate, int initialAmount)
            throws BankException {

        /* Fill in the code and return either a CheckingAccount or a SavingsAccount. Exception for any other AccountType */


        return null;
    }

    public synchronized Account lookupAccount(String accountId) {

        /* Fill in the code and return the Account. Exception if accountId doesn't exist */

        return null;
    }

    public synchronized void setJointOwner(String accountId, String primaryOwnerId,
                                           String jointOwnerId, Date jointOwnershipDate) {

        Account account = this.lookupAccount(accountId);
        Customer primaryOwner = this.lookupCustomer(primaryOwnerId);
        Customer jointOwner   = this.lookupCustomer(jointOwnerId);

        if ((account != null) && (primaryOwner != null) && (jointOwner != null)) {
            if ( (account.getPrimaryOwner() == primaryOwner) && (account.getJointOwner() == null) ) {
                account.setJointOwner(jointOwner, jointOwnershipDate);
            }
        }


    }

    public synchronized void createTransaction(TransactionType transactionType, Date date, int amount,
                                               String customerId, String sourceAccountId,
                                               String destinationAccountId) {

        /* Fill in the code
         - Based on the transactionType, invoke makeDeposit(...), or makeWithdrawal(...), or makeTransfer(...)
         - The destinationAccountId is only applicable if this is a Transfer request
         */
        switch (transactionType) {

            case Deposit -> {

                break;
            }
            case Withdraw -> {

                break;
            }
            case Transfer -> {


            }
        }
    }

    private synchronized void makeDeposit(Date date, int amount, String customerId, String accountId) {
        Customer customer = this.lookupCustomer(customerId);
        Account account = this.lookupAccount(accountId);
        new DepositTransaction(date, amount, customer, account);
    }

    private synchronized void makeWithdrawal(Date date, int amount, String customerId, String accountId) {
        Customer customer = this.lookupCustomer(customerId);
        Account account = this.lookupAccount(accountId);
        if (account != null &&
                ((account.getPrimaryOwner() == customer) ||
                        (account.getJointOwner() != null && account.getJointOwner() == customer)) ) {
            new WithdrawTransaction(date, amount, customer, account);
        } else
            new BankException("Customer is not owner or joint owner");
    }

    private synchronized void makeTransfer(Date date, int amount, String customerId, String fromAccountId, String toAccountId) {
        Customer customer = this.lookupCustomer(customerId);
        Account fromAccount = this.lookupAccount(fromAccountId);
        Account toAccount = this.lookupAccount(toAccountId);
        if (fromAccount != null &&
                ((fromAccount.getPrimaryOwner() == customer) ||
                        (fromAccount.getJointOwner() != null && fromAccount.getJointOwner() == customer)) ){
            new TransferTransaction(date, amount, customer, fromAccount, toAccount);
        } else
            new BankException("Customer is not owner or joint owner");
    }

    public synchronized void printStatement(String customerId, Date toDate) {
        Customer customer = this.lookupCustomer(customerId);
        if (customer != null)
         customer.printStatement(toDate);
    }

}
