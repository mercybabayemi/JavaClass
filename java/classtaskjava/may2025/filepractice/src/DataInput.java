import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {
    public static void main(String args[]) throws IOException {
        File file = new File("/home/babayemi-mercy/projects/JavaClass/java/classtaskjava/may2025/filepractice/mercy.txt");
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);)
        {
            byte[] word = dataInputStream.readAllBytes();
            System.out.println(new String(word));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
