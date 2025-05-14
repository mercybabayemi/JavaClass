
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExercise {
    public static void main(String[] args) {
        try {
            File file = new File("/home/babayemi-mercy/projects/JavaClass/java/classtaskjava/may2025/filepractice");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            Path paths = Paths.get("/home/babayemi-mercy/projects/JavaClass/java/classtaskjava/may2025/filepractice/mercy.txt");
            Files.createFile(paths);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
