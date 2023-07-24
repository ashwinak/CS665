package cs655.hw3.part2;

public class App {

    public static void main(String[] args) {

        /**
         * A director class is used to offload the creation of objects away from this client code.
         * The director class contains the construction code for each of the objects used to create various UI.
         *
         * Addition of new creation object can be instantiated on the director class instead of client code or in specific builder class.
         * A builder interface class is created with methods defined. Any specific UI builder class will extend from the builder class to
         * define methods.
         */

        Director dir = new Director();
        BuilderBoa builder = new BuilderBoa();
        dir.buildBoA(builder);
        System.out.println("\t--Testing Bank of America version of UI--");
        System.out.println("\tUser interface completed as below :");
        System.out.println(builder.getUI());
        System.out.println();

        dir.buildChase(builder);
        System.out.println("\t----Testing Chase version of UI--");
        System.out.println("\tUser interface completed as below :");
        System.out.println(builder.getUI());
        System.out.println();


    }
}
