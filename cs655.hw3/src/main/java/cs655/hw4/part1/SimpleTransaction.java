package cs655.hw4.part1;

public class SimpleTransaction implements Transaction{

    private final String acctTransaction;

    public SimpleTransaction(String acctTransaction) {
        this.acctTransaction = acctTransaction;
        System.out.println(acctTransaction);
    }


    @Override
    public void transaction(String message) {
        System.out.println(message);
    }
}
