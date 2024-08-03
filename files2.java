import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
public class files2 {
    public static void main(String[] args) throws IOException{
        File files2 = new File("./hello5.txt");
        if(!files2.exists()){
        // System.out.println(files2.createNewFile());
        // FileOutputStream files = new FileOutputStream(files2);
        // files.write(95);
        // files.write(65);
        // files.write(75);
        // files.close();



      String s ="hello";
        FileWriter file = new FileWriter(files2);
       file.write(s.toCharArray());
       System.out.print(file);
        file.close();


    }
}
}