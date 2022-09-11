//6.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
public class if_else_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age1:");
        int age1 = sc.nextInt();
        System.out.println("Enter age2:");
        int age2 = sc.nextInt();
        System.out.println("Enter age3:");
        int age3 = sc.nextInt();
        if (age1 > age2) {
            if(age1>age3){
                System.out.println("First one is oldest.");
            }
            else{
                System.out.println("Third one is oldest.");
            }
        }
        else {
            if (age2> age3) {
                System.out.println("Second one is oldest.");
            }
            else {
                System.out.println("Third one is oldest.");
            }
        }
        if(age1<age2 && age1<age3){
            System.out.println("First one is younger.");
        }
        else if(age2<age1 && age2<age3){
            System.out.println("Second one is younger.");
        }
        else{
            System.out.println("Third one is younger.");
        }
    }
}
