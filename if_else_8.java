//8.
//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
import java.util.Scanner;
public class if_else_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of classes held:");
        int number_of_classes_held= sc.nextInt();
        System.out.println("Enter number of classes attended:");
        int number_of_classes_attended= sc.nextInt();
        int percentage_of_class_attended=(number_of_classes_attended*100)/number_of_classes_held;
        if(percentage_of_class_attended<75){
            System.out.println("Not allowed to sit in exam.");
        }
        else{
            System.out.println("Allowed to sit in exam.");
        }
    }
}
