package cs655.hw4.part2;

public class HalfYearlyStmt implements StatementComponent {
    private String stmtName;

    public HalfYearlyStmt(String stmtName) {
        this.stmtName = stmtName;
    }

    public String getStmtName() {
        return stmtName;
    }

    public void setStmtName(String stmtName) {
        this.stmtName = stmtName;
    }

    @Override
    public void getStatement() {
        System.out.println(stmtName);
    }
}
