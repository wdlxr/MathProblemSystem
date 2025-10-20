import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathProblemGenerator {
    private Random random = new Random();
    public List<MathProblem> generateProblems(MathProblemConfig config) {
        List<MathProblem> problems = new ArrayList<>();
        for (int i = 0; i < config.getNumberOfProblems(); i++) {
            MathProblem problem = generateSingleProblem(config);
            if (problem != null) {
                problems.add(problem);
            }
        }
        return problems;
    }

    private MathProblem generateSingleProblem(MathProblemConfig config) {
        int numberOfOperands = config.getNumberOfOperands();
        MathProblemType type = config.getType();

        switch (type) {
            case ADDITION:
                return generateAdditionProblem(numberOfOperands);
            case SUBTRACTION:
                return generateSubtractionProblem(numberOfOperands);
            case MIXED_ADD_SUB:
                return generateMixedAddSubProblem(numberOfOperands);
            case MULTIPLICATION:
                return generateMultiplicationProblem(numberOfOperands);
            case DIVISION:
                return generateDivisionProblem(numberOfOperands);
            case MIXED_MUL_DIV:
                return generateMixedMulDivProblem(numberOfOperands);
            case MIXED_ALL:
                return generateMixedAllProblem(numberOfOperands);
            default:
                return null;
        }
    }

    private MathProblem generateAdditionProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = 0;
        StringBuilder problem = new StringBuilder();
        for (int i = 0; i < numberOfOperands; i++) {
            result += operands[i];
            if (i > 0) {
                problem.append(" + ");
            }
            problem.append(operands[i]);
        }
        return new MathProblem(problem.toString(), result);
    }

    private MathProblem generateSubtractionProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = operands[0];
        StringBuilder problem = new StringBuilder();
        problem.append(operands[0]);
        for (int i = 1; i < numberOfOperands; i++) {
            if (result - operands[i] <= 0) {
                return null; // Ensure result is positive
            }
            result -= operands[i];
            problem.append(" - ").append(operands[i]);
        }
        return new MathProblem(problem.toString(), result);
    }

    private MathProblem generateMixedAddSubProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = operands[0];
        StringBuilder problem = new StringBuilder();
        problem.append(operands[0]);
        for (int i = 1; i < numberOfOperands; i++) {
            if (random.nextBoolean()) {
                result += operands[i];
                problem.append(" + ").append(operands[i]);
            } else {
                if (result - operands[i] <= 0) {
                    return null; // Ensure result is positive
                }
                result -= operands[i];
                problem.append(" - ").append(operands[i]);
            }
        }
        return new MathProblem(problem.toString(), result);
    }

    private MathProblem generateMultiplicationProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = 1;
        StringBuilder problem = new StringBuilder();
        for (int i = 0; i < numberOfOperands; i++) {
            result *= operands[i];
            if (i > 0) {
                problem.append(" * ");
            }
            problem.append(operands[i]);
        }
        return new MathProblem(problem.toString(), result);
    }

    private MathProblem generateDivisionProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = operands[0];
        StringBuilder problem = new StringBuilder();
        problem.append(operands[0]);
        for (int i = 1; i < numberOfOperands; i++) {
            if (result % operands[i] != 0) {
                return null; // Ensure result is an integer
            }
            result /= operands[i];
            problem.append(" / ").append(operands[i]);
        }
        return new MathProblem(problem.toString(), result);
    }

    private MathProblem generateMixedMulDivProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = operands[0];
        StringBuilder problem = new StringBuilder();
        problem.append(operands[0]);
        for (int i = 1; i < numberOfOperands; i++) {
            if (random.nextBoolean()) {
                result *= operands[i];
                problem.append(" * ").append(operands[i]);
            } else {
                if (result % operands[i] != 0) {
                    return null; // Ensure result is an integer
                }
                result /= operands[i];
                problem.append(" / ").append(operands[i]);
            }
        }
        return new MathProblem(problem.toString(), result);
    }

    private MathProblem generateMixedAllProblem(int numberOfOperands) {
        int[] operands = generateOperands(numberOfOperands);
        int result = operands[0];
        StringBuilder problem = new StringBuilder();
        problem.append(operands[0]);
        for (int i = 1; i < numberOfOperands; i++) {
            int operation = random.nextInt(4);
            switch (operation) {
                case 0:
                    result += operands[i];
                    problem.append(" + ").append(operands[i]);
                    break;
                case 1:
                    if (result - operands[i] <= 0) {
                        return null; // Ensure result is positive
                    }
                    result -= operands[i];
                    problem.append(" - ").append(operands[i]);
                    break;
                case 2:
                    result *= operands[i];
                    problem.append(" * ").append(operands[i]);
                    break;
                case 3:
                    if (result % operands[i] != 0) {
                        return null; // Ensure result is an integer
                    }
                    result /= operands[i];
                    problem.append(" / ").append(operands[i]);
                    break;
            }
        }
        return new MathProblem(problem.toString(), result);
    }
    private int[] generateOperands(int numberOfOperands) {
        int[] operands = new int[numberOfOperands];
        for (int i = 0; i < numberOfOperands; i++) {
            operands[i] = random.nextInt(99) + 1; // Ensure operands are between 1 and 99
        }
        return operands;
    }
}