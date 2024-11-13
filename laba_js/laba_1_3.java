import java.util.HashSet;
import java.util.Scanner;

public class laba_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру матриці n
        System.out.print("Введіть розмір матриці n (n ≤ 20): ");
        int n = scanner.nextInt();

        // Перевірка обмеження на розмір
        if (n > 20 || n <= 0) {
            System.out.println("Помилка: n повинно бути в межах від 1 до 20.");
            return;
        }

        // Введення елементів матриці X(n, n)
        int[][] X = new int[n][n];
        System.out.println("Введіть елементи матриці " + n + " x " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                X[i][j] = scanner.nextInt();
            }
        }

        // Створення логічного вектора Y(n) для зберігання результату
        boolean[] Y = new boolean[n];

        // Перевірка кожного рядка на унікальність елементів
        for (int i = 0; i < n; i++) {
            // Використовуємо HashSet для перевірки унікальності елементів у рядку
            HashSet<Integer> set = new HashSet<>();
            boolean unique = true;

            for (int j = 0; j < n; j++) {
                // Якщо елемент вже присутній в HashSet, значить рядок має повторення
                if (set.contains(X[i][j])) {
                    unique = false;
                    break;
                }
                set.add(X[i][j]);
            }

            // Якщо всі елементи унікальні, то Y[i] = true, інакше Y[i] = false
            Y[i] = unique;
        }

        // Вивід результату
        System.out.println("Логічний вектор Y:");
        for (int i = 0; i < n; i++) {
            System.out.println("Y[" + i + "] = " + Y[i]);
        }
    }
}
