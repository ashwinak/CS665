package ashwinak.cs665.hw2;

import java.text.DateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private final String name;
    private final String customerId;
    private final Date registrationDate;
    private final List<Account> accountList;

    public Customer(String name, String customerId, Date registrationDate) {
        this.name = name;
        this.customerId = customerId;
        this.registrationDate = registrationDate;
        this.accountList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public Date getRegistrationDate() {
        return this.registrationDate;
    }

    public void addAccount(Account account) {

        /* Fill in the code to add the account to the customer's accountList */

        accountList.add(account);


    }


    public void printStatement(Date toDate) {

        System.out.println("\nBEGIN ACCOUNT STATEMENT - " + this.getName() + " - " + DateFormat.getDateInstance().format(toDate));

        /* Fill in the code to iterate over the customer's accountList and invoke printStatement for each account */
        System.out.println("Transactions for Account " + accountList.get(0).getAccountId() + "  " + "Primary Owner: " +
                accountList.get(0).getPrimaryOwner());

        for (Account account : accountList) {
            System.out.println(account.getOpenDate() +
                    account.getAccountId() +
                    account.getCurrentBalance() +
                    account.getPrimaryOwner() +
                    account.getCurrentBalance());
        }
        System.out.println("\nEND ACCOUNT STATEMENT\n");
    }


}
