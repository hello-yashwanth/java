//these are the decision making statements,Generally decision making statement are many types we use
//if , if-else and switch statements are used 
//in switch statement the outcomes are unlimited, switch statement are used value
import java.util.Scanner;
public class ifandifelse {
    
    public static void main(String[] args) {
          //if statement
          int num = -10;
          if(num<0){
            System.out.println("the number is negative");

          }
          if(num>0){
            System.out.println("the number is positive");
          }
       //if-else statement
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter your marks");
       int marks = scanner.nextInt();
       if(marks>35){
           System.out.println("pass");
       }
       else{
           System.out.println("fail");
       }
       //switch statement
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter any number");
       int x = scanner.nextInt();
       switch (x) {
        case 1:
            System.out.println("this is lower number");
            break;
       case 2:
            System.out.println("this is highest number");
            break;
        case 3:
            System.out.println("this is equal too");
        default:
            System.out.println("this is nothing");
            break;
       }
    }

    
}
