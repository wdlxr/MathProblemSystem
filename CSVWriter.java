import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {
    public void writeProblemsToCSV(List<MathProblem> problems, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (MathProblem problem : problems) {
                writer.write(problem.getProblem() + " = ?");
                writer.newLine();
            }
        }
    }
}

