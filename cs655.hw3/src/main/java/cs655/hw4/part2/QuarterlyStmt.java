package cs655.hw4.part2;

public class QuarterlyStmt implements StatementComponent {

    private String stmtName;

    public QuarterlyStmt(String stmtName) {
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
//        System.out.println(getClass().getSimpleName());
        System.out.println(stmtName);
    }
}
