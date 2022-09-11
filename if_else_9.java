//9.Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has
// medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.Scanner;
public class if_else_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of classes held:");
        int number_of_classes_held= sc.nextInt();
        System.out.println("Enter number of classes attended:");
        int number_of_classes_attended= sc.nextInt();
        System.out.println("Enter Y or N accordingly if you have medical cause:");
        char cause=sc.next().charAt(0);
        int percentage_of_class_attended=(number_of_classes_attended*100)/number_of_classes_held;
        if(percentage_of_class_attended<75 || cause=='Y'){
            System.out.println("Not allowed to sit in exam.");
        }
        else{
            System.out.println("Allowed to sit in exam.");
        }

    }
}
