package cs655.Term_Project.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class SubConcentration implements PrintHTML {
    private final List<PrintHTML> PrintList = new ArrayList<>();

    @Override
    public void showHTMLFormat()
    {
        for(PrintHTML print:PrintList) {
            print.showHTMLFormat();
        }
    }

    public void addContent(PrintHTML print) {
        PrintList.add(print);
    }

    public void removeContent(PrintHTML print) {
        PrintList.remove(print);
    }
}
