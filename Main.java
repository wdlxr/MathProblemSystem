import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.MIXED_ALL, 3, 30, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        OutputFormatter formatter = new OutputFormatter();
        formatter.formatAndPrintProblems(problems, config.getColumnsPerRow());

        CSVWriter csvWriter = new CSVWriter();
        try {
            csvWriter.writeProblemsToCSV(problems, "problems.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}