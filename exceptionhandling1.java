//in java programming there are multiple exceptions are there but all we had not declare in program
//so we can declare throwable word we used for all the exceptions

public class exceptionhandling1 {
    public static void main(String[] args) throws IOException {
    File files2 = new File("./hello5.txt");
    if(!files2.exists()){
    System.out.println(files2.createNewFile());
    FileOutputStream files = new FileOutputStream(files2);
    files.write(95);
    files.write(65);
    files.write(75);
    files.close();



  String s ="hello";
    FileWriter file = new FileWriter(files2);
   file.write(s.toCharArray());
   System.out.print(file);
    file.close();
}
}
}