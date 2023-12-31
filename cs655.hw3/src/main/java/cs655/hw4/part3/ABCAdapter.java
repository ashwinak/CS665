package cs655.hw4.part3;

public class ABCAdapter implements IVerify {

    @Override
    public boolean verifyCustomer(Customer cust) {
        ABCValidator ABC = new ABCValidator();
        if (ABC.ValidateCustomer(cust.getName(), cust.getPhNo())) {
            return true;
        }
        else {
            return false;
        }
    }
}
