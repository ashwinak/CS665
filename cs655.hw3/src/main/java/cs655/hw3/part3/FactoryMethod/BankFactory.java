package cs655.hw3.part3.FactoryMethod;

public abstract class BankFactory {
    public void createCustomer() {
        Customer custSTD = createStandardCustomerAC();
        custSTD.createCustomerType();

        Customer custPref = createPreferredCustomerAC();
        custPref.createCustomerType();

        Customer custBus = createBusinessCustomerAC();
        custBus.createCustomerType();
    }
    public abstract Customer createStandardCustomerAC();
    public abstract Customer createPreferredCustomerAC();
    public abstract Customer createBusinessCustomerAC();

}
