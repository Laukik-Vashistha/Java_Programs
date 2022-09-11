import java.util.Scanner;
public class if_else_12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year:");
        int year=sc.nextInt();
        if(year%400==0 || (year%100!=0 && year%4==0)){
            System.out.println("Given year is a leap year.");
        }
        else{
            System.out.println("Given year is not a leap year.");
        }
    }
}
