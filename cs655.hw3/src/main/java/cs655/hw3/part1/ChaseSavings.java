package cs655.hw3.part1;

public class ChaseSavings extends Savings {
    @Override
    public String getAccountType() {
        return "";
    }
    public String toString() {
        return super.toString() + "::Chase Savings Account";
    }
}
