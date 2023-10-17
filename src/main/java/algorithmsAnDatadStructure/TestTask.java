package algorithmsAnDatadStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Пример входной строки: “aaaaabcccc”
 * Пример выходного результата: “a”: 5, “c”: 4, “b”: 1
 */
public class TestTask {
    public static void main(String[] args) {
        task01("bbbbaaaaacaabccccl");
    }

    public static void task01(String text) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Подсчитываем частоту встречи символов
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Приводим символ к нижнему регистру
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Сортируем по убыванию количества вхождений
        charFrequencyMap = charFrequencyMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        HashMap::new
                ));

        // Выводим результат
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
