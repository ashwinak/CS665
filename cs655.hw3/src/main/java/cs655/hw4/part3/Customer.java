package cs655.hw4.part3;

public class Customer {
    String name;
    String  phNo;
    String address;
    boolean backgroundCheck;

    public boolean isBackgroundCheck() {
        return backgroundCheck;
    }

    public void setBackgroundCheck(boolean backgroundCheck) {
        this.backgroundCheck = backgroundCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
