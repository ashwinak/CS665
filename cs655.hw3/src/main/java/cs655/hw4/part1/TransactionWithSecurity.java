package cs655.hw4.part1;

public class TransactionWithSecurity extends BaseTransactionDecorator {
    public TransactionWithSecurity(Transaction wrapped) {
        super(wrapped);
    }
    public void transaction(String message) {
        super.transaction(message);
//        System.out.println(message);
    }
}
