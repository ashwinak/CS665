package cs655.hw3.part2;

public class BuilderBoa implements Builder {

    private String createHeader;
    private  String createSidebar;
    private  String createMainPanel;
    private  String createFooter;

    @Override
    public BuilderBoa createHeader(String createHeader) {
        this.createHeader = createHeader;
        return this;
    }

    @Override
    public BuilderBoa createSidebar(String createSidebar) {
        this.createSidebar = createSidebar;
        return this;
    }

    @Override
    public BuilderBoa createMainPanel(String createMainPanel) {
        this.createMainPanel = createMainPanel;
        return this;
    }

    @Override
    public BuilderBoa createFooter(String createFooter) {
        this.createFooter = createFooter;
        return this;
    }

    public Boa getUI() {
        return new Boa(createHeader,createSidebar,createMainPanel,createFooter);
    }
}
