package math.problems;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " using iteration: " + factorialIterative(num));
        System.out.println("Factorial of " + num + " using recursion: " + factorialRecursive(num));
    }

    // Iterative method to find factorial
    public static int factorialIterative(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Recursive method to find factorial
    public static int factorialRecursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorialRecursive(num - 1);
        }
    }
}
