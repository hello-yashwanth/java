//for loop is also as desicision making statement.
//in for loop we have initialisation ; condition ; updation
//syntax: for(){ // ststements} 
public class forloop {
    public static void main(String[] args){
        int i;
        for( i = 0; i<10; i++) {
            System.out.println(i);
        }
        //even numbers
        for(int j=40; j<80; j++) {
            if(j%2==0)
            {
                System.out.println(j);
            }
          
        }
        //odd numbers
        for(int k = 200; k>25; k--){
            if(k%2!=0)
            {
                System.out.println(k);
            }

        }
        //foreach loop
        //foreach also same as for loop but in for loop we can get output in reverse order but in for each only 
        //initialize for one order 
        //syntax for(data type : name ){}
        int[] array = {1,2,3,4,5};
        for(int j = 0; j<array.length; j++) {

            System.out.println(array[j]);
            

        }
        //foreach
        int sum = 0;
        for(int j : array){
            System.out.println(j);
            sum += j;
        }
        System.out.println(sum);
        System.out.println(sum/array.length);

    }
    
}
