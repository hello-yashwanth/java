//inheritance is type of principle in opps concepts
//in javaprojects we have stored code in class so that code we want in some location then we use inheritance
//we didn't take that code from one class to another we have some relationship
//Eg: parent and child assects. like parent assects are giving to child but not reversly doing
// in jaa we called it super and sub
//it has two types of inheritance multiple and multilevel 
//java does not support multiple inheritances in one class
//but we use multiple interfaces in public interface x entends x , x 
public class inheritance {
    public static void main(String[] args) {
              inheritance1 s = new inheritance1();
              s.guest();
              inheritance2 p = new inheritance2();
              p.guest();
              p.developer();
              inheritance3 r = new inheritance3();
              r.guest();
              r.developer();
              r.admin(); 
    }
}
