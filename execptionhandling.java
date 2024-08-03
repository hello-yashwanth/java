//exeception handling is very important topic
//exeception handling means if a program is running then program is stopped due to some problem it is known as exeception handling
// in java suppose we divide 9/0 then we have execption handling so java controlls execption . but you also controlls execption. we can create logfiles
// when we handling the execption then we operate the execption
//in java we have 2 types of execption there are checked execption(compiletime execption) and unchecked execption(runtimeexecption)
//we handle execption we have try catch throw 
//when there is exeception or not we use finally block
//the super class of all the exceptions are throwable
//try & catch are the  mandatory 
public class execptionhandling{
    public static void main(String[] args){
        int x = 9;
        int y = 0;
        float total = 0;
        
        try{
             total = x/y;
            
        }
        catch(ArithmeticException ae){
            
            System.out.println(ae.toString());
            throw ae;
        }

        finally{
            System.out.println("finally block");
        }
        System.out.println(total);
    }
}
