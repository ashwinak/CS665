package cs655.hw3.part2;

public class BuilderChase implements Builder {

    private String createHeader;
    private  String createSidebar;
    private  String createMainPanel;
    private  String createFooter;

    @Override
    public BuilderChase createHeader(String createHeader) {
        this.createHeader = createHeader;
        return this;
    }

    @Override
    public BuilderChase createSidebar(String createSidebar) {
        this.createSidebar = createSidebar;
        return this;
    }

    @Override
    public BuilderChase createMainPanel(String createMainPanel) {
        this.createMainPanel = createMainPanel;
        return this;
    }

    @Override
    public BuilderChase createFooter(String createFooter) {
        this.createFooter = createFooter;
        return this;
    }

    public Chase getUI() {
        return new Chase(createHeader,createSidebar,createMainPanel,createFooter);
    }


}
