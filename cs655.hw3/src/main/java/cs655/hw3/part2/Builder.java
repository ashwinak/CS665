package cs655.hw3.part2;

public interface Builder {
    Builder createHeader(String createHeader);
    Builder createSidebar(String createSidebar);
    Builder createMainPanel(String createMainPanel);
    Builder createFooter(String createFooter);

}
