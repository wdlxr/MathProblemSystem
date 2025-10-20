public class MathProblemConfig {
    private MathProblemType type;
    private int numberOfOperands;
    private int numberOfProblems;
    private int columnsPerRow;
    public MathProblemConfig(MathProblemType type, int numberOfOperands, int numberOfProblems, int columnsPerRow) {
        this.type = type;
        this.numberOfOperands = numberOfOperands;
        this.numberOfProblems = numberOfProblems;
        this.columnsPerRow = columnsPerRow;
    }
    public MathProblemType getType() {
        return type;
    }
    public int getNumberOfOperands() {
        return numberOfOperands;
    }
    public int getNumberOfProblems() {
        return numberOfProblems;
    }
    public int getColumnsPerRow() {
        return columnsPerRow;
    }
}
