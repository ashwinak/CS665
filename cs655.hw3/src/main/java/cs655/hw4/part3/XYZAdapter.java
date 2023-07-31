package cs655.hw4.part3;

public class XYZAdapter implements IVerify {
    @Override
    public boolean verifyCustomer(Customer cust) {
        XYZChecker XYZ = new XYZChecker();
        if (XYZ.backgroundCheck(cust.getName(), cust.getPhNo(), cust.getAddress())){
            return true;
        }
        else {
            return false;
        }
    }
}
