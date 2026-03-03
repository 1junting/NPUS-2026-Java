import java.util.Scanner;

public class Main {

    // 非線性函數 f(x) = x^3 - x - 2
    public static double f(double x) {
        return x * x * x - x - 2;
    }

    // 導數 f'(x)
    public static double df(double x) {
        return 3 * x * x - 1;
    }

    // Newton iteration
    public static double newton(double x0, int iterations) {
        double x = x0;
        for (int i = 0; i < iterations; i++) {
            x = x - f(x) / df(x);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial guess: ");
        double x0 = sc.nextDouble();

        System.out.print("Enter number of iterations: ");
        int n = sc.nextInt();

        double root = newton(x0, n);

        System.out.println("Approximate root: " + root);
    }
}