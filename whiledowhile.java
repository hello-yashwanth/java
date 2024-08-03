//in looping statements we can execute multiple times so we use loop for while
//we make desicions in programs we use while and do-while.looping statements are while do-while for foreach
// syntax:while(condition){
//     //statements
// }
// do: do{

// }while(condition)
public class whiledowhile{
    public static void main(String[] args) {
        
    
    int i = 0;
    int j = 100;
    while(i<10) {
        System.out.println(i);
        i++;
    }
    do{
        System.out.println(i);
        i++;
    }
    while(i<10);
}

}
