public class MathProblem {
    private String problem;
    private int answer;

    public MathProblem(String problem, int answer) {
        this.problem = problem;
        this.answer = answer;
    }

    public String getProblem() {
        return problem;
    }

    public int getAnswer() {
        return answer;
    }
}


//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class MathProblemGenerator {
//    private static final Random random = new Random();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("选择算式类型：1. 纯加法 2. 纯减法 3. 混合加减法");
//        int type = scanner.nextInt();
//
//        System.out.println("选择数字范围：1. 两位数 2. 三位数");
//        int range = scanner.nextInt();
//
//        System.out.println("输入要生成的算式数量：");
//        int count = scanner.nextInt();
//
//        List<String> problems = generateProblems(type, range, count);
//        for (String problem : problems) {
//            System.out.println(problem);
//        }
//    }
//
//    private static List<String> generateProblems(int type, int range, int count) {
//        List<String> problems = new ArrayList<>();
//        int lowerBound = range == 1 ? 10 : 100;
//        int upperBound = range == 1 ? 99 : 999;
//
//        for (int i = 0; i < count; i++) {
//            String problem;
//            switch (type) {
//                case 1: // 纯加法
//                    problem = generateAdditionProblem(lowerBound, upperBound);
//                    break;
//                case 2: // 纯减法
//                    problem = generateSubtractionProblem(lowerBound, upperBound);
//                    break;
//                case 3: // 混合加减法
//                    problem = generateMixedProblem(lowerBound, upperBound);
//                    break;
//                default:
//                    throw new IllegalArgumentException("无效的类型选择");
//            }
//            problems.add(problem);
//        }
//        return problems;
//    }
//
//    //case1:纯加法
//    private static String generateAdditionProblem(int lowerBound, int upperBound) {
//        int num1 = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//        int num2 = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//        int result = num1 + num2;
//
//        if (result > 100) {
//            return generateAdditionProblem(lowerBound, upperBound);
//        }
//
//        return num1 + " + " + num2 + " = ?";
//    }
//
//    //case2:纯减法
//    private static String generateSubtractionProblem(int lowerBound, int upperBound) {
//        int num1 = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//        int num2 = random.nextInt(num1 - lowerBound + 1) + lowerBound;
//        int result = num1 - num2;
//
//        if (result <= 0) {
//            return generateSubtractionProblem(lowerBound, upperBound);
//        }
//
//        return num1 + " - " + num2 + " = ?";
//    }
//
//    //case3:混合加法和减法
//    private static String generateMixedProblem(int lowerBound, int upperBound) {
//        int num1 = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//        int num2 = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//        int num3 = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
//
//        int result = num1 + num2 - num3;
//
//        if (result <= 0 || result > 100) {
//            return generateMixedProblem(lowerBound, upperBound);
//        }
//
//        return num1 + " + " + num2 + " - " + num3 + " = ?";
//    }
//}