import java.util.List;

public class OutputFormatter {
    public void formatAndPrintProblems(List<MathProblem> problems, int columnsPerRow) {
        int row = 0;
        for (MathProblem problem : problems) {
            System.out.print(problem.getProblem() + " = ?");
            if (++row % columnsPerRow == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
    }
}
