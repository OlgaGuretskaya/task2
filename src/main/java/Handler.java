import java.util.List;

/**
 * Используется для нахождения слов без повторяющихся букв
 */
public class Handler {
    public String compareLettersInTheWord(List<String> list) {
        String word = null;
        for (int i = 0; i < list.size(); i++) {
            boolean isTheSameLetters = false;
            for (int j = 0; j < list.get(i).length(); j++) {
                for (int n = j + 1; n < list.get(i).length(); n++) {
                    if (list.get(i).charAt(j) == list.get(i).charAt(n)) {
                        isTheSameLetters = true;
                    }
                }
            }
            if (!isTheSameLetters) {
                word = list.get(i);
                break;
            }
        }
        return word;
    }
}
