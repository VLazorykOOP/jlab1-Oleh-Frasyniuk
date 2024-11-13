import java.util.Scanner;

public class laba_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Введення значень a, b та n
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Введіть значення b (b повинно бути більше за a): ");
        double b = scanner.nextDouble();
        
        if (a >= b) {
            System.out.println("Помилка: b повинно бути більше за a.");
            return;
        }
        
        System.out.print("Введіть кількість елементів масиву n (n ≤ 200): ");
        int n = scanner.nextInt();
        
        if (n > 200 || n <= 0) {
            System.out.println("Помилка: n повинно бути в межах від 1 до 200.");
            return;
        }
        
        // Введення елементів масиву X(n)
        double[] X = new double[n];
        System.out.println("Введіть " + n + " елементів масиву:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextDouble();
        }
        
        // Ініціалізація змінних для обчислень
        double sumBelowA = 0; // Сума всіх X(i) < a
        double productAboveB = 1; // Добуток всіх X(i) > b
        boolean hasProductAboveB = false; // Прапорець для перевірки добутку
        
        Double maxInRange = null; // Максимум серед X(i) ∈ [a, b]
        Double minInRange = null; // Мінімум серед X(i) ∈ [a, b]
        
        // Обчислення
        for (double x : X) {
            if (x < a) {
                sumBelowA += x;
            } else if (x > b) {
                productAboveB *= x;
                hasProductAboveB = true;
            } else { // x знаходиться в межах [a, b]
                if (maxInRange == null || x > maxInRange) {
                    maxInRange = x;
                }
                if (minInRange == null || x < minInRange) {
                    minInRange = x;
                }
            }
        }
        
        // Вивід результатів
        System.out.println("Сума всіх елементів, що менші за a: " + sumBelowA);
        
        if (hasProductAboveB) {
            System.out.println("Добуток всіх елементів, що більші за b: " + productAboveB);
        } else {
            System.out.println("Не знайдено елементів, більших за b.");
        }
        
        if (maxInRange != null && minInRange != null) {
            System.out.println("Максимум серед елементів у діапазоні [a, b]: " + maxInRange);
            System.out.println("Мінімум серед елементів у діапазоні [a, b]: " + minInRange);
        } else {
            System.out.println("Не знайдено елементів у діапазоні [a, b].");
        }
    }
}
