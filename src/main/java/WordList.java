import java.util.List;

/** Используется для хранения листа */
public class WordList {
    /** Лист слов, введдый с консоли*/
    private List<String> word;
    /** Конструктоп по умолчанию */
    public WordList() {
    }
    /** Конструктоп с параментрами */
    public WordList(List<String> word) {
        this.word = word;
    }
    /** Метод get для листа */
    public List<String> getWord() {
        return word;
    }
    /** Метод set для листа */
    public void setWord(List<String> word) {
        this.word = word;
    }
    /** Метод конвертирования листа в строку */
    @Override
    public String toString() {
        return "WordList{" +
                "word=" + word +
                '}';
    }
}
