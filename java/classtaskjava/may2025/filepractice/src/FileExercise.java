
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileExercise {
    public static void main(String[] args) {
        File file = new File("/home/babayemi-mercy/projects/JavaClass/java/classtaskjava/may2025/filepractice");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        )
        {
            objectOutputStream.write(12);
            byte[] bytes = fileInputStream.readAllBytes();
            String message = new String(bytes);
            System.out.println(message);

            User user = new User();
            user.setFirstName("Mercy");
            user.setLastName("Janet");
            user.setEmail("mercy@mercy.com");
            user.setPassword("mercy");
            objectOutputStream.writeObject(user);


            byte[] bytesOne = new byte[5];
            int result = fileInputStream.readNBytes(bytesOne, 0, 5);
            System.out.println(Arrays.toString(bytesOne));
            String value = new String(bytesOne);
            System.out.println(value);
            System.out.println(result);
            System.out.println(file.getPath());
            Path paths = Paths.get("/home/babayemi-mercy/projects/JavaClass/java/classtaskjava/may2025/filepractice/mercy.txt");
            Files.createFile(paths);
        }catch (IOException exception ){
            System.err.println(exception.getMessage());
        }
    }

}
