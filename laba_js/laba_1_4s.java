import java.util.Scanner;

public class laba_1_4s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення тексту
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        // Розділяємо текст на слова з урахуванням пробілів і розділових знаків
        String[] words = inputText.split("\\b");

        // Створюємо новий рядок для збереження результату
        StringBuilder result = new StringBuilder();

        // Проходимо по кожному слову
        for (String word : words) {
            if (word.matches("\\w+")) { // Перевіряємо, що це слово (не розділовий знак)
                // Залишаємо тільки перше входження першої літери
                String processedWord = removeNextOccurrences(word);
                result.append(processedWord);
            } else {
                // Додаємо розділові знаки та пробіли без змін
                result.append(word);
            }
        }

        // Вивід обробленого тексту
        System.out.println("Оброблений текст:");
        System.out.println(result.toString());
    }

    // Метод для видалення всіх наступних входжень першої літери в слові
    public static String removeNextOccurrences(String word) {
        char firstChar = word.charAt(0); // Отримуємо першу літеру
        StringBuilder processedWord = new StringBuilder();
        processedWord.append(firstChar); // Додаємо першу літеру в результат

        // Додаємо до результату всі інші символи, крім повторних входжень першої літери
        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar != firstChar) {
                processedWord.append(currentChar);
            }
        }

        return processedWord.toString();
    }
}
