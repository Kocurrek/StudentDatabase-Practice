import org.w3c.dom.ls.LSOutput;
import java.lang.Math;
import java.util.Random;

public class Database {
    public static void main(String[] args) {
        NewStudent student1 = new NewStudent("Mateusz", "Kot", "1111111111111111");
        NewStudent student2 = new NewStudent("Natalson","Swietochowska", "2222222222222");
        NewStudent student3 = new NewStudent("Andrzej","Masztalerz", "333333333333");
//        student1.Start();
//        student2.Start();
//        student3.Start();
        student1.enroll("Physics");
        student1.enroll("Math");
        student1.checkBalance();
        student1.showCourses();
        student1.pay(400);
        student1.checkBalance();
        System.out.println(student1.toString());
    }
}
class NewStudent{
    private static int ID = 100;
    private String surname;
    private String name;
    private String phone;
    private String City;
    private String SSN;
    private String email;
    private String courses = "";
    private static final int courseCost = 800;
    private int balance = 0;

    void Start(){
        System.out.println("New account created");
        userID();
        Id();
        ID++;
        setEmail();
    }
    NewStudent(String name, String surname, String SSN ){
        this.name = name;
        this.surname = surname;
        this.SSN = SSN;
           }
    private void setPhoneNumber(String phone){
        this.phone = phone;
        System.out.println("Phone nr");
    }

    private void setEmail(){
        email = name + "@uczelnia.pl";
        System.out.println("Email studenta to: " + email );
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private int Id(){
         int id = (int) (Math.random()*10000);
        return id;
    }

    public void userID(){
        System.out.println("Student " + name + " " + surname + " ID is : " +  ID  +"-"+ SSN.substring(6,10) + Id() );
    }
    //METHODS
    public void enroll(String course){
        this.courses = this.courses + "\n" + course;
        balance = balance + courseCost;


    }

    public void pay(int amount){
        balance = balance - amount;
        System.out.println("Payment: " + amount);


    }

    public void checkBalance(){
        System.out.println("Balance is: " + balance);
    }

    public void showCourses(){
        System.out.println("Here are courses: " + "\n" + courses );
    }

    public String toString(){
        return "[NAME" + name + " " + surname + "]\n[COURSES" + courses + "]\n[BALANCE" + balance + "]";
    }


 }