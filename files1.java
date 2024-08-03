//when we create a file we used read and write  that file
//so we use FileInputStream , Scanner, FileBuffer, BufferedReader
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class files1 {


    public static void main(String[] args) throws IOException {
        File files1 = new File("./hello.txt");

       if(!files1.exists())
       System.out.print(files1.createNewFile() );
    FileInputStream fi = new FileInputStream(files1);//it will print writing text in file
    int hel;
  
  
    while((hel = fi.read())!= -1)
    System.out.print((char)hel);


     //we can use scanner also read the files
     Scanner scanner = new Scanner(files1);
while (scanner.hasNext()) {
    System.out.println(scanner.nextLine());
    
}
 scanner.close();
//and we can used also FileReader also same reading file
FileReader fr = new FileReader(files1);
int hellos;
while ((hellos = fr.read()) != -1) {
    System.out.print((char)hellos);
}
FileReader.close();
    }
    
}
