import java.util.Arrays;
import java.util.List;

/**
 * Используется для конвертации переменных
 */
public class Parser {
    /**
     * Конвертирует введенную строку в массив из слов
     * @param line
     * @return массив слов
     */
    public String[] parseLineToMass(String line) {
        String[] words = line.split(" ");
        return words;
    }

    /**
     * Конвертирует массив из слов в лист
     * @param words
     * @return лист слов
     */

    public List<String> parseMassToList(String[] words) {
        List<String> list = Arrays.asList(words);
        return list;
    }
}
