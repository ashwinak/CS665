package cs655.hw3.part1;

public class BoaSavings extends Savings {
    @Override
    public String getAccountType() {
        return "";
    }
    public String toString() {
        return super.toString() + "::BankOfAmerica Savings Account";

    }
}
