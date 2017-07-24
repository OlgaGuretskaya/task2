import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Используется для запуска приложения
 */
public class Runner {
    /** Метод для запуска приложения */
    public static void main(String[] args) {
        WordList wordList = new WordList();
        Reader reader = new Reader();
        Parser parser = new Parser();
        Handler handler = new Handler();


        System.out.println("Введите несколько слов через пробел:");
        String line = reader.readLine();
        String[] words = parser.parseLineToMass(line);
        List<String> list = parser.parseMassToList(words);
        wordList.setWord(list);
        System.out.println("Первое слово, состоящее из разных символов:");
        System.out.println(handler.compareLettersInTheWord(list));


    }
}