//arrays:arrays are used to store multiple values. it is divided into two types they are 1) single dimensional array 2)multidimensional array((i)two dimensional ii) jagged array)
//arrays are used datatypes and variables we know that datatypes and variables ex: int i=10 here int has datatype i = 10 is variable
//wrapper classes the wrapper classes means suppose int has wrapper class is integer.
//in premetive datatype objects are not created non premetive datatype created. non premative datatypes are class,arrays,collections. 
//in one dimensional array we initialise [] because it contains only one column. in multidimensional array we initialise two[][] it contains rows and columns. 
public class arrays {
    public static void main(String[] args) {
          int[] array = new int[5];
            array[0] = 5;
            array[1]  = 8;
            array[2]  = 4;
            array[3]  = 6;
            array[4]  = 88;
           int  i = 0; 
          while(i<array.length){
            System.out.println(array[i]);
            i++;
          }
    int[] array = new int[5];
    array[0] = 2;
    array[1] = 5;
    array[2] = 1;
    array[3] = 9;
    array[4] = 6;
    int sum = array[0] + array[1] + array[2] + array[3] + array[4];
    sum = sum/5;
    System.out.println(sum); 


        
        
    
    //arrays using string 
    String[] array = new String[2];
    array[0] = "[chai,coffee";
    array[1] = " ,milk, water , coke]";
    String total = array[0] + array[1];
    System.out.println(total);

    int[] array = new int[4];
    array[0] = 2;
    array[1] = 5;
    array[2] = 1;
    array[3] = 9;
    array[4] = 6;
  System.out.println(array.max(length));
  System.out.println(array.index());
 // multidimensional arrays

         int[][] array = new int[3][3];
         array[0][0] = 2;
         array[0][1] = 1;
         array[0][2] = 4;
         
         array[1][0] = 6;
         array[1][1] = 6;
         array[1][2] = 6;
         int size = 0;
         
        for(int i =0; i<array.length; i++){
          
          int[] row =  array[i]; 
          for(int j =0; j<row.length; j++){
            System.out.println(row[j]+ "  ");
          }
          System.out.println("  ");
          size += array[i].length;
          System.out.println(size);
        }



        } 
}

