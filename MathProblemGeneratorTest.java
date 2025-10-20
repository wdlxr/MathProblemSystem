import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class MathProblemGeneratorTest {
    @Test
    public void testGenerateAdditionProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.ADDITION, 2, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }

    @Test
    public void testGenerateSubtractionProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.SUBTRACTION, 2, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }

    @Test
    public void testGenerateMixedAddSubProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.MIXED_ADD_SUB, 3, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }

    @Test
    public void testGenerateMultiplicationProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.MULTIPLICATION, 2, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }

    @Test
    public void testGenerateDivisionProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.DIVISION, 2, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }

    @Test
    public void testGenerateMixedMulDivProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.MIXED_MUL_DIV, 3, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }

    @Test
    public void testGenerateMixedAllProblem() {
        MathProblemConfig config = new MathProblemConfig(MathProblemType.MIXED_ALL, 3, 10, 5);
        MathProblemGenerator generator = new MathProblemGenerator();
        List<MathProblem> problems = generator.generateProblems(config);

        for (MathProblem problem : problems) {
            assertTrue(problem.getAnswer() > 0 && problem.getAnswer() < 100);
        }
    }
}