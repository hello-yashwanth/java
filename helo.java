import java.io.File;
import java.util.IOException;
public class helo {
    public static void main(String[]  args) throws IOException {
        File f = new File("C:\\files\\myfile.txt");
        System.out.println(f.createNewFile());
    }
}
