package cs655.hw3.part2;

public class Director {

    public void buildBoA(Builder builder) {
         builder.createHeader("Creating Bank of America Header...")
                .createSidebar("Creating Bank of America Sidebar...")
                .createMainPanel("Creating Bank of America Main Panel...")
                .createFooter("Creating Bank of America Footer...");
    }

    public void buildChase(Builder builder) {
         builder.createHeader("Creating Chase Header...")
                .createSidebar("Creating Chase Sidebar...")
                .createMainPanel("Creating Chase Main Panel...")
                .createFooter("Creating Chase Footer...");
    }
}
