package cs655.hw4.part3;

public class ABCAdapter implements IVerify {

    @Override
    public boolean verifyCustomer(Customer cust) {
        if (cust.backgroundCheck== false) {
            ABCValidator ABC = new ABCValidator();
            if (ABC.ValidateCustomer(cust.getName(), cust.getPhNo())) ;
            {
                return true;
            }
        }
        if(cust.backgroundCheck == true) {
            XYZChecker XYZ = new XYZChecker();
            if (XYZ.backgroundCheck(cust.getName(), cust.getPhNo(), cust.getAddress())) ;
            {
                return true;
            }
        }
        return false;
    }
}
