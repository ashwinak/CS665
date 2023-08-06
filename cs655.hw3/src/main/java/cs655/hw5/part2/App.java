package cs655.hw5.part2;

public class App {

    /**
     *
     * @param args
     * Simple Interest and CompoundInterest are two classes that implements the strategy class Interest calculator.
     * The 2 implementors of stratgey class provides different method of calculating interest rate based on Bank's need.
     *
     * Banks is an interface and BoA is a class implementing the Bank interface. BoA class holds the account information
     * specific to the bank such as balance, interest rate along with constuctors, getters and setters.
     *
     */

    public static void main(String[] args) {
        BoA B1 = new BoA();

        B1.setBalance(1000000);
        B1.setInterest_Rate(0.02);

        //Simple Interest
        SimpleInterest SI = new SimpleInterest();
        System.out.println("Using Simple interest");
        System.out.println(SI.CalculateInterest(B1.getBalance(),B1.getInterest_Rate()));
        System.out.println();

        //Compound Interest
        System.out.println("Using Compound interest");
        CompoundInterest CI = new CompoundInterest();
        System.out.println(CI.CalculateInterest(B1.getBalance(),B1.getInterest_Rate()));
    }

}
