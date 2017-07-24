import java.util.Scanner;

/**
 * Используется для чтения введенной в консоль строки
 */
public class Reader {
    public String readLine() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        return line;
    }
}
