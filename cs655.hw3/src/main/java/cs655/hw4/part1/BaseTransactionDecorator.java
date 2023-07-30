package cs655.hw4.part1;

public class BaseTransactionDecorator implements Transaction {

    private final Transaction wrapped;

    public BaseTransactionDecorator(Transaction wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void transaction(String message) {
        wrapped.transaction(message);
    }
}
