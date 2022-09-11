//2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//And any other input of age should print "ERROR".
import java.util.Scanner;
public class if_else_13 {
    public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter sex (M and F):");
        char sex= sc.next().charAt(0);
        System.out.println("Enter marital status (Y and N):");
        char status= sc.next().charAt(0);
        if(sex=='F'){
            System.out.println("She will work only in urban areas.");
        }
        else if(sex=='M' && (age>20 && age<40)){
            System.out.println("He may work in anywhere.");
        }
        else{
            System.out.println("He will work in urban areas only.");
        }
    }
}
