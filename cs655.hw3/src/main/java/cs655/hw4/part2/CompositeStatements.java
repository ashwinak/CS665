package cs655.hw4.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeStatements implements StatementComponent {
    private String stmtName;

    private List<StatementComponent> childStatements;

    public CompositeStatements(String stmtName) {
        this.stmtName = stmtName;
        this.childStatements = new ArrayList<>();
    }
    @Override
    public void getStatement() {
        childStatements.forEach(StatementComponent::getStatement);
    }

    public void addStatement(StatementComponent stmt) {
        childStatements.add(stmt);

    }

}
