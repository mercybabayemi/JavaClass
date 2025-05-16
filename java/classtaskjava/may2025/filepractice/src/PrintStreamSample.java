import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamSample {
    public static void main(String[] args) {
        String path = "/home/babayemi-mercy/projects/JavaClass/java/classtaskjava/may2025/filepractice/mercy.txt";
        try(PrintStream printStream = new PrintStream(path)) {
            System.setOut(printStream);
            System.out.println("Hello World");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
