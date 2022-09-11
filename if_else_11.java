//11.Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
public class if_else_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character:");
        char character=sc.next().charAt(0);
        if(character>=65 && character<=90){
            System.out.println("It is uppercase letter.");
        }
        else{
            System.out.println("It is lowercase letter.");
        }
    }
}
