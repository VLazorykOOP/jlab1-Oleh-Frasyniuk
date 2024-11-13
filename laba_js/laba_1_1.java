import java.util.Scanner;

public class laba_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        // 1. Дійсні вхідні дані, дійсний результат
        double result1 = calculateExpression(x, y);
        System.out.println("1) Float input and result: " + result1);

        // 2. Цілі вхідні дані, дійсний результат
        int intX = (int) x;
        int intY = (int) y;
        double result2 = calculateExpression(intX, intY);
        System.out.println("2) Int input float result: " + result2);

        // 3. Дійсні вхідні дані, цілий результат
        int result3 = (int) Math.round(calculateExpression(x, y));
        System.out.println("3) Float input int result: " + result3);
    }

    
    public static double calculateExpression(double x, double y) {
        double numerator1 = 2 * Math.pow(x, 2) + x * y;
        double denominator1 = Math.pow(x * y, 2);
        double fraction1 = numerator1 / denominator1;

        double numerator2 = 3 * x * y - Math.pow(y, 3);
        double denominator2 = Math.pow(x, 2) + 2 * Math.pow(y, 2);
        double fraction2 = numerator2 / denominator2;

        return fraction1 + fraction2;
    }
}
