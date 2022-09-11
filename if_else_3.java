//3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
import java.util.Scanner;
public class if_else_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity:");
        int quantity= sc.nextInt();
        if(quantity*100>1000){
            int discount=((quantity*100)*10)/100;
            int Total_cost=(quantity*100)-discount;
            System.out.println(Total_cost);
        }

    }
}
