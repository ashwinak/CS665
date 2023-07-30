package cs655.hw4.part2;

public class App {

    /**
     *
     * @param args
     *  StatementComponent is the interface and composite statement is composite class that implements the interface.
     *  The composite statement class creates 3 methods, CompositeStatements method that creates a arraylist to store each of its child elements.
     *
     *  The getStatement method to iterate over the child elements when accessing the composite statement.
     *
     *  The addStatement method is used to add child statements to the arraylist of Composite statements.
     *
     *  Here monthly statements are at the first level. Any level after this one is a composite level that includes multiple monthly statements to
     *  satisfy the specific composite level.
     *
     *  For eg : For Quarterly statements, 3 monthly statements are the child statements of a quarterly statements.
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-- Testing Monthly Statement by itself --");
        StatementComponent MonthlyStmtJan2022 = new MonthlyStmt("** Monthly Statement for January, 2022");

        MonthlyStmtJan2022.getStatement();
        System.out.println();

        StatementComponent newLine = new MonthlyStmt("\n");

        StatementComponent MonthlyStmtFeb2022 = new MonthlyStmt("** Monthly Statement for February, 2022");
        StatementComponent MonthlyStmtMar2022 = new MonthlyStmt("** Monthly Statement for March, 2022");
        StatementComponent MonthlyStmtApril2022 = new MonthlyStmt("** Monthly Statement for April, 2022");
        StatementComponent MonthlyStmtMay2022 = new MonthlyStmt("** Monthly Statement for May, 2022");
        StatementComponent MonthlyStmtJune2022 = new MonthlyStmt("** Monthly Statement for June, 2022");

        CompositeStatements CompStmtQTR = new CompositeStatements("compStmt");

        StatementComponent QtrlyStmtHeader = new QuarterlyStmt("-- Testing Quarterly Statement --");
        StatementComponent QtrlyStmtQ12022 = new QuarterlyStmt("** Combo Statement of Quarterly Statement for Q1 2022");
        CompStmtQTR.addStatement(QtrlyStmtHeader);
        CompStmtQTR.addStatement(QtrlyStmtQ12022);
        CompStmtQTR.addStatement(MonthlyStmtJan2022);
        CompStmtQTR.addStatement(MonthlyStmtFeb2022);
        CompStmtQTR.addStatement(MonthlyStmtMar2022);
        CompStmtQTR.addStatement(newLine);

        StatementComponent QtrlyStmtQ22022 = new QuarterlyStmt("** Combo Statement of Quarterly Statement for Q2 2022");
        CompStmtQTR.addStatement(QtrlyStmtHeader);
        CompStmtQTR.addStatement(QtrlyStmtQ22022);
        CompStmtQTR.addStatement(MonthlyStmtApril2022);
        CompStmtQTR.addStatement(MonthlyStmtMay2022);
        CompStmtQTR.addStatement(MonthlyStmtJune2022);
        CompStmtQTR.getStatement();

        System.out.println();
        CompositeStatements CompStmtHalfYearly = new CompositeStatements("compStmt");

        StatementComponent HalfYearlyStmtHeader = new HalfYearlyStmt("-- Testing Half yearly Statement --");

        StatementComponent HalfYearly1H2022 = new HalfYearlyStmt("** Combo Statement of First Half yearly Statement for 2022");
        CompStmtHalfYearly.addStatement(HalfYearlyStmtHeader);
        CompStmtHalfYearly.addStatement(HalfYearly1H2022);
        CompStmtHalfYearly.addStatement(QtrlyStmtQ12022);
        CompStmtHalfYearly.addStatement(MonthlyStmtJan2022);
        CompStmtHalfYearly.addStatement(MonthlyStmtFeb2022);
        CompStmtHalfYearly.addStatement(MonthlyStmtMar2022);
        CompStmtHalfYearly.addStatement(QtrlyStmtQ22022);
        CompStmtHalfYearly.addStatement(MonthlyStmtApril2022);
        CompStmtHalfYearly.addStatement(MonthlyStmtMay2022);
        CompStmtHalfYearly.addStatement(MonthlyStmtJune2022);

        CompStmtHalfYearly.getStatement();


    }
}
