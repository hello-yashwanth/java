//in java we can create files by using path of folder, we can create and delete files using java.io.Files libary
//when we create file we use objects.
//so we create file we use createNewFile() and delete , delete() , commands and exists() is used to file is there are not
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class files {
    public static void main(String[]  args) throws IOException {
        File f = new File("C:/");
        System.out.println(Arrays.toString(f.list()));//it will print list of folders
        // System.out.println(f.mkdir());//it is used to create folder

        // System.out.println(f.exists());
        // System.out.println(f.delete());
        // System.out.println(f.createNewFile());
        
        //   if(f.exists())
        //   f.delete();
        //   System.out.println(f.createNewFile());
    
        // System.out.println(f.isHidden());//it shows hidden files when we hidden
        // System.out.println(f.canWrite());
    }
}
