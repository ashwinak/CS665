package cs655.hw3.part3.FactoryMethod;

public class App {
    /**
     *
     * @param args
     * The factory method creates an object of Boa class that extends from the abstract class BankFactory.
     *
     * The Boa Object creates all types of customers using the createCustomer method on the Bank factory class.
     *
     */
    public static void main(String[] args) {
        System.out.println("Part3 Second version using FactoryMethod");

        BankFactory Bofa = new Boa();
        Bofa.createCustomer();
    }

}
