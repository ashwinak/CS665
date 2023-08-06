package cs655.hw5.part2;

public class SimpleInterest implements InterestCalculator {
    @Override
    public double CalculateInterest(int Balance, double interest_rate) {
        double Interest;
        Interest =  ((Balance*interest_rate)/12.0);
        return Interest;
    }
}
