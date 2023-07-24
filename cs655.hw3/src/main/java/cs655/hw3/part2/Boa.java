package cs655.hw3.part2;

public class Boa {
    private final String createHeader;
    private final String createSidebar;
    private final String createMainPanel;
    private final String createFooter;


    Boa(String createHeader, String createSidebar, String createMainPanel, String createFooter) {
        this.createSidebar = createSidebar;
        this.createMainPanel = createMainPanel;
        this.createFooter = createFooter;
        this.createHeader = createHeader;
    }

    @Override
    public String toString() {
        return """
                    Step1: %s
                    Step2: %s
                    Step3: %s
                    Step4: %s
                """.formatted(createHeader, createSidebar, createMainPanel, createFooter);
    }
}
