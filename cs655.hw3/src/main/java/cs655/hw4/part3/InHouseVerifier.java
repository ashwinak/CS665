package cs655.hw4.part3;

import java.util.Objects;

public class InHouseVerifier implements IVerify {

    @Override
    public boolean verifyCustomer(Customer cust) {
        if(cust.name == "Alice") {
            return true;
        }
        return false;
    }
}

