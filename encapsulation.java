//encapsulation means so much of code will be taken in single line
// en means many molecules capsulatiion means a single capsule can having many molecules
//class is a cotainer which stores the data and codes 
//encapsulation is principle of opps(object oriented programming system) concepts

public class encapsulation {
    private int rollno;
    private String name;
    private boolean isAttend;
    public encapsulation(int rollno){
        this.rollno = rollno;
    }
    public void setencapsulation(boolean yes){
        isAttend = yes;
        System.out.println("teacher assigned ");
    }
    public boolean  getencapsulation(){
        System.out.println("not assigned");
        return isAttend;

    }
}
