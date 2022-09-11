//3.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
//INPUT : 1234        OUTPUT : 4321
//INPUT : 5982        OUTPUT : 2895
import java.util.Scanner;
public class if_else_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0) {
            int a = num % 10;
            rev = rev * 10 + a;
            num =num / 10;
        }
        System.out.println(rev);
        }
}
