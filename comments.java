public class comments {
    public void balance() {
        int balance = 5000;
        System.out.println("currenet balance" +balance);
    }
    public void  withdraw(int amount) {
        balance = balance - amount;
        System.out.println("withdrawn successfully");
    
        
    }
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("deposit successfully");
    }
    public static void main(String[] args) {
        
        withdraw(500);
        deposit(500);
    }
    
}
