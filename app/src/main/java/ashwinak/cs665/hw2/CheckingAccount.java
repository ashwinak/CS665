package ashwinak.cs665.hw2;

import java.util.Date;

class CheckingAccount extends Account {

    public CheckingAccount(Customer primaryOwner, String accountId, Date openDate, int initialAmount) {
        super(primaryOwner, accountId, openDate);
        Transaction transaction = new DepositTransaction(openDate, initialAmount, primaryOwner, this);
    }

}
