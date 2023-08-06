package cs655.hw5.part2;

public class CompoundInterest implements InterestCalculator {

    @Override
    public double CalculateInterest(int Balance, double interest_rate) {
        double Interest;
        Interest =  (Balance*Math.pow((1+interest_rate/365),31) - Balance);
        return Interest;
    }
}
