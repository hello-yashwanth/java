//interface is a very important topic in java most interview questions asked
//in java the important is class and object but interface is equal important to class
//interface is blueprint of class
public interface laptop {

    //suppose you had doing laptop bussiness you have to send some terms to laptop bussinners ex : hp lenovo acer
        public void copy();
        public void paste();
        public void cut();
        public void keyboard();
        default void capture(){
            System.out.println("it is capture");
        }
         static void audo(){
        System.out.println("it is audioble");
     }
} 
    

