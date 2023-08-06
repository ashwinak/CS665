package cs655.hw5.part2;

public class BoA implements Banks {

    Integer Balance;
    double Interest_Rate;

    public Integer getBalance() {
        return Balance;
    }

    public void setBalance(Integer balance) {
        Balance = balance;
    }

    public double getInterest_Rate() {
        return Interest_Rate;
    }

    public void setInterest_Rate(double interest_Rate) {
        Interest_Rate = interest_Rate;
    }

    public BoA() {

    }

    @Override
    public void showInterest() {

    }
}
