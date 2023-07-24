package cs655.hw3.part3.SimpleFactory;


public class App {

    /**
     *
     * @param args
     * Simple factory method creates an object from Bankfactory concrete class.
     *
     * The bank factory concrete class invokes the objects via different types of customers implementing the customer interface.
     *
     *
     */
    public static void main(String[] args) {
        System.out.println("Part3 First version using SimpleFactory");

        BankFactory fact = new BankFactory();
        fact.createCustomer();


    }
}
